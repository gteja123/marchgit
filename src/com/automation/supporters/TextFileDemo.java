package com.automation.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileDemo {
public static void main(String[] args) throws IOException {
	File file = new File("C:\\Users\\lenovo\\Desktop\\TESTING\\FrameWorks\\src\\com\\automation\\supporters\\demo.text");
	
	boolean status = file.createNewFile();
	if(status)
	{
		System.out.println("file is created newly");
	}
	else
	{
		System.out.println("returns existing one!");		
	}
	
	FileReader filereader = new FileReader(file);
	BufferedReader bufferedReader = new BufferedReader(filereader);
	
	while(bufferedReader.ready())
	{
		String data = bufferedReader.readLine();
		System.out.println(data);
	}
	
	//FileWriter filewriter = new FileWriter(file);
	//BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
	
	//bufferedwriter.write("hello");
	//bufferedwriter.newLine();
	//bufferedwriter.write("hi");
	//bufferedwriter.newLine();
	//bufferedwriter.write("rayagada");
	//bufferedwriter.newLine();
	//bufferedwriter.write("how");
	//bufferedwriter.newLine();
	//bufferedwriter.write("java");
	//bufferedwriter.newLine();
	//bufferedwriter.write("job");
	//bufferedwriter.newLine();
	//bufferedwriter.write("good");
	
//	bufferedwriter.flush();
	
}
}
