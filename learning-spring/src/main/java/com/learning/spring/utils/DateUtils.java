package com.learning.spring.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class DateUtils {
	
	public Date createDateFromDateString(String dataString) {
		DateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date date = null;
		if(StringUtils.hasText(dataString)) {
			try {
				date = format.parse(dataString);
			} catch(ParseException e) {
				date = new Date();
			}
		}
		else {
			date = new Date();
		}
		return date;
	}
}
