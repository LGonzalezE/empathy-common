package com.empathy.util;

import java.time.LocalDateTime;
import java.util.Date;

public class DateTime {

	
	public static LocalDateTime convertToLocalDateTimeViaSqlTimestamp(Date dateToConvert) {
	    return new java.sql.Timestamp(
	      dateToConvert.getTime()).toLocalDateTime();
	}
}
