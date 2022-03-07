package com.automation.supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import customisedexception.FrameworkException;

public class PropertiesReader {
	private String filePath;
	private FileInputStream fip;
	private Properties properties;
	private String value;
	
	public PropertiesReader(String filePath) throws IOException
	{
		this.filePath = filePath;
		fip = new FileInputStream(filePath);
	    properties = new Properties();
		properties.load(fip);		
	}
      public String getPropertyValue(String key) {
		if (properties!=null) {
			value = properties.getProperty(key);
		}
		else {
			// throw exception
			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL....");
		}
		return value;
      }
      public String getPropertyValue(String key,String defaultValue) throws FrameworkException {
  		if (properties!=null) {
  			value = properties.getProperty(key);
  			if (value == null) {
  				value = defaultValue;
  			}
  		}
  		else {
            FrameworkException exception = new FrameworkException("PROPERTIES OBJECT IS POINTING TO NULL....");
  			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL....");
  			throw exception;
  		}
  		return value;
        }

      public String getPropertyValue(Object key) throws FrameworkException {
  		if (properties!=null) {
  			value = (String) properties.get(key);
  		}
  		else {
  			 FrameworkException exception = new FrameworkException("PROPERTIES OBJECT IS POINTING TO NULL....");
   			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL....");
   			throw exception;
  		}
  		return value;
        }
      
      public String getPropertyValue(Object key,Object defaultValue) throws FrameworkException {
    		if (properties!=null) {
    			value = (String) properties.getOrDefault(key, defaultValue);
    			if (value == null) {
    				value = (String) defaultValue;
    			}
    		}
    		else {
    			 FrameworkException exception = new FrameworkException("PROPERTIES OBJECT IS POINTING TO NULL....");
    	  			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL....");
    	  			throw exception;
    		}
    		return value;
          }
      
      public void writekeyValue(String key,String value) throws IOException, FrameworkException
  	{
  		if (properties!=null)
  		{
  			properties.setProperty(key, value);
  			FileOutputStream fop = new FileOutputStream(filePath);
  			properties.store(fop, "File is saved successfully");
  		}
  		else {
  			FrameworkException exception = new FrameworkException("PROPERTIES OBJECT IS POINTING TO NULL....");
  			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL....");
  			throw exception;
  		}
  	}
  	public void writekeyValue(Object key,Object value) throws IOException, FrameworkException
  	{
  		if (properties!=null)
  		{
  			properties.put(key, value);
  			FileOutputStream fop = new FileOutputStream(filePath);
  			properties.store(fop, "File is saved successfully");
  		}
  		else {
  			FrameworkException exception = new FrameworkException("PROPERTIES OBJECT IS POINTING TO NULL....");
  			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL....");
  			throw exception;
  		}
  	}
  	 public Set getKeys() throws FrameworkException {
  		Set setKeys = null;
  		if (properties!= null)
  			{
  			setKeys = properties.keySet();
  	       }
  	 else {
  		FrameworkException exception = new FrameworkException("PROPERTIES OBJECT IS POINTING TO NULL....");
			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL....");
			throw exception;
  		}
  		return setKeys; 
  }
  	 public List getValues() throws FrameworkException
  	 {
  		List listValues = new ArrayList<>();
  		if(properties!=null) {
  			Set set = properties.keySet();
  			for(Object obj : set)
  			{
  				Object value=properties.get(obj);
  				listValues.add(value);
  			}
  		}
  		else {
  			FrameworkException exception = new FrameworkException("PROPERTIES OBJECT IS POINTING TO NULL....");
  			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL....");
  			throw exception;
  		}
  		return listValues; 
  	 }
  	public Map getKeysValues() throws FrameworkException {
  	Map map = new HashMap<>();
  	{
  		if(properties!=null) {
  			Set set = properties.keySet();
  			for(Object obj : set)
  			{
  				Object value = properties.get(obj);
  			}
  		}
  		
  			else {
  				FrameworkException exception = new FrameworkException("PROPERTIES OBJECT IS POINTING TO NULL....");
	  			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL....");
	  			throw exception;
  			}
  		return map;			
  	}
  	}
}