package com.automation.appln.testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDemo2 {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {

	FileInputStream fip = new FileInputStream("C:\\Users\\lenovo\\Desktop\\TESTING\\FrameWorks\\src\\com\\automation\\appln\\testdata\\TestData.xls");
		
    Workbook workbook = WorkbookFactory.create(fip);
	 
    //Sheet sheet = workbook.getSheetAt(0);
	  Sheet sheet = workbook.getSheet("Gmail_Data");
	  	  
	  Row row0= sheet.getRow(0);
	  Cell cell = row0.createCell(2);
	  cell.setCellValue("JOB");
	  
	  Row row2 = sheet.createRow(2);
	  Cell cell20 = row2.createCell(0);
	  cell20.setCellValue("kick");
	  
	  row2.createCell(1).setCellValue("ok");
	  
	  FileOutputStream fop = new FileOutputStream("C:\\Users\\lenovo\\Desktop\\TESTING\\FrameWorks\\src\\com\\automation\\appln\\testdata\\TestData.xls");
	  workbook.write(fop);
}
}
