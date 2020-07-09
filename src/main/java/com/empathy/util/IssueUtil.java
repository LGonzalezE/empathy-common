package com.empathy.util;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class IssueUtil {

	public static double calculateProgress(Date date1, Date date2) throws Exception {
		// calculate progress
		LocalDateTime startDate = DateTime.convertToLocalDateTimeViaSqlTimestamp(date1);
		LocalDateTime endDate = DateTime.convertToLocalDateTimeViaSqlTimestamp(date2);
		LocalDateTime now = LocalDateTime.now();
		long totalDays = startDate.until(endDate, ChronoUnit.DAYS);
		long elapsedDays = startDate.until(now, ChronoUnit.DAYS);

		if (totalDays < 0) {
			StringBuilder strBuilder = new StringBuilder("invalid date range: [").append(date1).append(", ")
					.append(date2).append("]");

			throw new Exception(strBuilder.toString());
		}
		if (totalDays == 0)
			return 0;
		double progress = ((double) elapsedDays / totalDays) * 100;

		return progress;
	}
}
