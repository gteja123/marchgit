package com.automation.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextReader {
private String filePath;
private File file;
private FileWriter fileWriter;
private BufferedWriter bufferedWriter;
private FileReader fileReader;
private BufferedReader bufferedReader;
private String value;

public TextReader(String filePath) throws IOException
{
	this.filePath = filePath;
	File file = new File(filePath);
	boolean status = file.createNewFile();
	if (status)
	{
		System.out.println("FILE IS CREATED NEWLY");      
	}
	else
	{
		System.out.println("RETURNS EXISTING FILE");
	}
    fileWriter = new FileWriter(filePath);
    bufferedWriter = new BufferedWriter(fileWriter);
	fileReader = new FileReader(filePath);
	bufferedReader = new BufferedReader(fileReader);
	
}
	
	public void writeData(String data) throws IOException 
	{
		if(bufferedWriter!=null)
		{
			bufferedWriter.write(data);
			bufferedWriter.flush();
		}
		else
		{
		//throw exception
		 System.out.println("BUFFEREDWRITER IS POINTING TO NULL");	
		}
	}
	public void writeData(int data) throws IOException
	{
		if(bufferedWriter!=null)
		{
			bufferedWriter.write(data);
			bufferedWriter.flush();
		}
		else
		{
		//throw exception
		 System.out.println("BUFFEREDWRITER IS POINTING TO NULL");	
		}
	}
		
	public String getData() throws IOException 
	{
		if(bufferedReader!=null)
		{
			value = bufferedReader.readLine();
		}
		else
		{
		//throw exception
		 System.out.println("BUFFEREDREADER IS POINTING TO NULL");	
		}	
		return value;
	}

	public List<String> getTotalData() throws IOException
	{
		List<String> fileData = new ArrayList<>();
		if(bufferedReader!=null)
		{
			value = bufferedReader.readLine();
			fileData.add(value);
		}
		else
		{
			//throw exception
			System.out.println("BUFFEREDREADER IS POINTING TO NULL");
		}
		return fileData;		
	}
}