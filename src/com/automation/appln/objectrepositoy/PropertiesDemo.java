package com.automation.appln.objectrepositoy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		
		//File file = new File("C:\\Users\\lenovo\\Desktop\\TESTING\\FrameWorks\\src\\com\\automation\\appln\\objectrepositoy\\or.properties");
		//FileInputStream fip = new FileInputStream(file);
		FileInputStream fip = new FileInputStream("C:\\Users\\lenovo\\Desktop\\TESTING\\FrameWorks\\src\\com\\automation\\appln\\objectrepositoy\\or.properties");
		
		Properties properties = new Properties();
		properties.load(fip);
		String un_id_value = properties.getProperty("un_id123","hello");
		String un_xpath_value = properties.getProperty("un_xpath");
		String nxt_id_value = properties.getProperty("nxt_id");
		String signin_id_value = properties.getProperty("signin_id");
		
		System.out.println(un_id_value);
		System.out.println(un_xpath_value);
		System.out.println(nxt_id_value);
		System.out.println(signin_id_value); 
		
		Object signin_css_value = properties.get("signin_css");
		System.out.println(signin_css_value);
		
		Object signin_id_value1 = properties.getOrDefault("signin_id", "java selenium");
		System.out.println(signin_id_value1);
		
		FileInputStream fip1 = new FileInputStream("C:\\Users\\lenovo\\Desktop\\TESTING\\FrameWorks\\config.properties");
		Properties properties2 = new Properties();
		properties2.load(fip1);
		
		properties2.setProperty("qa_url", "https://www.gmail.com");
		properties2.setProperty("hardwork", "job");
		properties2.put("job", "respect");
		
		properties2.store(new FileOutputStream("C:\\Users\\lenovo\\Desktop\\TESTING\\FrameWorks\\config.properties"),"file is saved successfully");
		
		
		
		
		
		
		
	}

}
