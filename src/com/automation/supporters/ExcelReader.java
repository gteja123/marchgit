package com.automation.supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import customisedexception.FrameworkException;



public class ExcelReader {
	private String filePath;
	private FileInputStream fileInputStream;
    private Workbook workbook;
    private Sheet sheet;
    private Row row;
    private Cell cell;
    
    public ExcelReader(String filePath) throws EncryptedDocumentException, InvalidFormatException, IOException
    {
	this.filePath = filePath;
	fileInputStream = new FileInputStream(filePath);
	workbook = WorkbookFactory.create(fileInputStream);
    }
    
 public Sheet getSheetObj(String how,String value) throws FrameworkException 
 {
  if (workbook!=null) 
  {
   if (how.equalsIgnoreCase("sheetName"))
    {
     sheet = workbook.getSheet(value);
    }
    else if (how.equalsIgnoreCase("index")) 
    {
    	int index = Integer.parseInt(value);
        sheet = workbook.getSheetAt(index);
    } 
  }
    else
    {
    	FrameworkException exception = new FrameworkException("WORKBOOK IS POINTING TO NULL");
    	throw exception;
    }
     return sheet;
  }
  
 public String getCellData(String how, String value, int rowNum , int cellNum) throws FrameworkException
 {
	 sheet = getSheetObj(how,value);
	 if (sheet!= null)
	    {
		 row = sheet.getRow(rowNum);
		 if (row!=null) 
		    {
			 cell = row.getCell(cellNum);
			 if(cell!=null)
               {
				 if(cell.getCellType()==cell.CELL_TYPE_STRING)
		     { 		 
				 value = cell.getStringCellValue();
			 }
			 else if (cell.getCellType()==cell.CELL_TYPE_BOOLEAN)
			 {
				value = cell.getBooleanCellValue()+"";
		     }
		     else if (cell.getCellType()==cell.CELL_TYPE_NUMERIC)
		     {
		    	 value = cell.getNumericCellValue()+"";
	         }
			   }
			 else 
			 {
				 FrameworkException exception = new FrameworkException("Cell IS POINTING TO NUL");
				 throw exception;
			 }
		    }	
		 else 
		 {
			 FrameworkException exception = new FrameworkException("Row IS POINTING TO NUL");
			 throw exception;
		 }
		}
      else
      {
          FrameworkException exception = new FrameworkException("Sheet IS POINTING TO NUL");
		  throw exception;
      }
     return value;
 }
 public List<String> getRowData(String how, String value, int rowNum) throws FrameworkException
 {
	 List<String> rowData =  new ArrayList<String>();
	 
	sheet = getSheetObj(how, value);
	row = sheet.getRow(rowNum);
	
	for(int i =0; i < row.getLastCellNum(); i++)
	{
		cell = row.getCell(i);
	  if(cell.getCellType()==cell.CELL_TYPE_STRING)
	     { 		 
			 value = cell.getStringCellValue();
			 rowData.add(value);
		 }
		 else if (cell.getCellType()==cell.CELL_TYPE_BOOLEAN)
		 {
			value = cell.getBooleanCellValue()+"";
			rowData.add(value);
	     }
	     else if (cell.getCellType()==cell.CELL_TYPE_NUMERIC)
	     {
	    	 value = cell.getNumericCellValue()+"";
	    	 rowData.add(value);
         }
		   }
			 return rowData;
		 }
 
 public List<String> getSheetData(String how, String value) throws FrameworkException
 {
	 List<String> sheetData =  new ArrayList<String>();
	 
	sheet = getSheetObj(how, value);
	
	for(int i =0; i<=sheet.getLastRowNum(); i++)
	{
		row = sheet.getRow(i);
	}
	
	for(int j=0; j<=row.getLastCellNum(); j++)
	{
		cell = row.getCell(j);
		 {
			 if(cell.getCellType()==cell.CELL_TYPE_STRING)
	     { 		 
			 value = cell.getStringCellValue();
			 sheetData.add(value);
		 }
		 else if (cell.getCellType()==cell.CELL_TYPE_BOOLEAN)
		 {
			value = cell.getBooleanCellValue()+"";
			sheetData.add(value);
	     }
	     else if (cell.getCellType()==cell.CELL_TYPE_NUMERIC)
	     {
	    	 value = cell.getNumericCellValue()+"";
	    	 sheetData.add(value);
         }
		   }
	}
		 return sheetData;
	}  
 }
 


	

 
