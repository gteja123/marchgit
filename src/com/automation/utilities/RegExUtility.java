package com.automation.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface RegExUtility {

	public static boolean isValidPhNo(String PhNo)
	{
		boolean isValidPhoneNo = true;
		Pattern pattern = Pattern.compile("(0|91)?[6-9][0-9]{9}");
		Matcher matcher = pattern.matcher(PhNo);
		 
		if (matcher.find()&&matcher.group().equalsIgnoreCase(PhNo))
		{
			System.out.println("it is valid ph no");
		}
		else
		{
			System.out.println("it is invalid ph no");
			isValidPhoneNo= false;
		}
		return isValidPhoneNo;
			}
	
	}
