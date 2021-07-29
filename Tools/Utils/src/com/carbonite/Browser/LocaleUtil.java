package com.carbonite.Browser;

import java.util.Locale;

import org.apache.commons.lang3.LocaleUtils;

public class LocaleUtil {

	private static Locale _locale=null;
	
	public static Locale getCurrentLocale() {
		if(LocaleUtil._locale==null) {
			LocaleUtil._locale=LocaleUtils.toLocale(System.getProperty("locale","en_US"));
		}
		
		return LocaleUtil._locale;
	}
	
	public static Locale getLocale(String locale) {
		return LocaleUtils.toLocale(locale);
	}
	
	public static void setCurrentLocale(Locale locale) {
		
		LocaleUtil._locale=locale;
	}
}
