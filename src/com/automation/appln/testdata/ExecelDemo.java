package com.automation.appln.testdata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExecelDemo {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InvalidFormatException {
		
		//FileInputStream fip = new FileInputStream(new File(""));
		 FileInputStream fip = new FileInputStream("C:\\Users\\lenovo\\Desktop\\TESTING\\FrameWorks\\src\\com\\automation\\appln\\testdata\\TestData.xls");
		
		 Workbook workbook = WorkbookFactory.create(fip);
		 
	   //Sheet sheet = workbook.getSheetAt(0);
		 Sheet sheet = workbook.getSheet("Gmail_Data");
		 int rowNums = sheet.getLastRowNum();
		 System.out.println("total no of rows are: "+rowNums);
		 
		 Row row0 = sheet.getRow(0);
		 int cellsInROW0 = row0.getLastCellNum();
		 System.out.println("total no of cells are: "+cellsInROW0);
		 
		 Cell cell00 = row0.getCell(0);
		 if(cell00.getCellType() == Cell.CELL_TYPE_STRING)
		 {
			 String cell00Value = cell00.getStringCellValue();
			 System.out.println(cell00Value);
		 }
		 else if(cell00.getCellType() == Cell.CELL_TYPE_BOOLEAN)
		 {
			 String cell00Value = cell00.getBooleanCellValue()+"";
			 System.out.println(cell00Value);
		 } 
		 else if(cell00.getCellType() == Cell.CELL_TYPE_NUMERIC)
		 {
			 String cell00Value = cell00.getNumericCellValue()+"";
			 System.out.println(cell00Value);
		 }
		 	 
		 Cell cell01 = row0.getCell(1); 
		 if(cell01.getCellType() == Cell.CELL_TYPE_STRING)
		 {
			 String cell01Value = cell01.getStringCellValue();
			 System.out.println(cell01Value);
		 }
		 else if(cell01.getCellType() == Cell.CELL_TYPE_BOOLEAN)
		 {
			 String cell01Value = cell01.getBooleanCellValue()+"";
			 System.out.println(cell01Value);
		 } 
		 else if(cell01.getCellType() == Cell.CELL_TYPE_NUMERIC)
		 {
			 String cell01Value = cell01.getNumericCellValue()+"";
			 System.out.println(cell01Value);
		 }
				 
		 Row row1 = sheet.getRow(1);
		 int row1CellCount = row1.getLastCellNum();
		 System.out.println(row1CellCount);
		 		 
		 Cell cell10 = row1.getCell(0);
		 if(cell10.getCellType() == Cell.CELL_TYPE_STRING)
		 {
			 String cell10Value = cell10.getStringCellValue();
			 System.out.println(cell10Value);
		 }
		 else if(cell10.getCellType() == Cell.CELL_TYPE_BOOLEAN)
		 {
			 String cell10Value= cell10.getBooleanCellValue()+"";
			 System.out.println(cell10Value);
		 } 
		 else if(cell10.getCellType() == Cell.CELL_TYPE_NUMERIC)
		 {
			 String cell10Value = cell10.getNumericCellValue()+"";
			 System.out.println(cell10Value);
		 }
		 
		 Cell cell11 = row1.getCell(1);
		 if(cell11.getCellType() == Cell.CELL_TYPE_STRING)
		 {
			 String cell11Value = cell11.getStringCellValue();
			 System.out.println(cell11Value);
		 }
		 else if(cell11.getCellType() == Cell.CELL_TYPE_BOOLEAN)
		 {
			 String cell11Value= cell11.getBooleanCellValue()+"";
			 System.out.println(cell11Value);
		 } 
		 else if(cell11.getCellType() == Cell.CELL_TYPE_NUMERIC)
		 {
			 String cell11Value = cell11.getNumericCellValue()+"";
			 System.out.println(cell11Value);
		 }
		 
		
	}

}
