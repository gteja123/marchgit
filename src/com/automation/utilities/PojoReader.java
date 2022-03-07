package com.automation.utilities;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.automation.supporters.ExcelReader;
import com.automation.supporters.PropertiesReader;
import com.automation.supporters.TextReader;

public class PojoReader {
	public static PropertiesReader getPrConf() throws IOException
	{
	PropertiesReader prConf = new PropertiesReader(FilePaths.confFilePath);
	return prConf;
		}
	
public static PropertiesReader getPrOr() throws IOException
    {
		PropertiesReader prOr = new PropertiesReader(FilePaths.orFilePath);
		return prOr;
    }

public static ExcelReader getExcelReaderObj() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	ExcelReader excelReader = new ExcelReader(FilePaths.excelFilePath);
	return excelReader;
}
public static TextReader getTextReaderObj() throws IOException
{
	TextReader textReader = new TextReader(FilePaths.txtFilePath);
	return textReader;
}
}
