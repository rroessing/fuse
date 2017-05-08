package com.mgm.efooddemo.mapping;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;



public class Transformations {

	private static final String DATE_FORMAT_OUT = "yyyymmdd";

	public java.lang.String stripNonNumericParts(java.lang.String input) {
		if ( StringUtils.isNotEmpty(input))	{
			return input.replaceAll("\\D+","");
		}
		
		return "";
	}

	
	public String dateFormat(String input){
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-ddTHH:mm:ssZ");
		SimpleDateFormat outputFormat = new SimpleDateFormat(DATE_FORMAT_OUT);
		try {
			Date inputDate = inputFormat.parse(input);
			return outputFormat.format(inputDate);
			
		} catch (ParseException e) {
			return "";
		}
		
	}
	
	public String currentDate(String input){
			Date now = new Date();
			SimpleDateFormat outputFormat = new SimpleDateFormat(DATE_FORMAT_OUT);
			return outputFormat.format(now);
	}
	
	
	public String cut70(String input){
		
		return StringUtils.left(input, 67).concat("...");
	}

	
}

