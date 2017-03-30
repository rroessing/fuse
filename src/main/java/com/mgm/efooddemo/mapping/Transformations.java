package com.mgm.efooddemo.mapping;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;



public class Transformations {

	public java.lang.String stripNonNumericParts(java.lang.String input) {
		if ( StringUtils.isNotEmpty(input))	{
			return input.replaceAll("\\D+","");
		}
		
		return "";
	}

	
	public String dateFormat(String input){
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-ddTHH:mm:ssZ");
		SimpleDateFormat outputFormat = new SimpleDateFormat("yyyymmdd");
		try {
			Date inputDate = inputFormat.parse(input);
			return outputFormat.format(inputDate);
			
		} catch (ParseException e) {
			return "";
		}
		
	}
	
	

	
}

