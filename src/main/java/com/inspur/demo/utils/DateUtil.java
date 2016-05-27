package com.inspur.demo.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public static String getCurrentTime() {
		return sdf.format(new Date());
	}

	public static long getTimestamp() {
		return new Date().getTime();
	}
}
