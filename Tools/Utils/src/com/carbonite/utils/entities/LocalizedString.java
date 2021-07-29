package com.carbonite.utils.entities;

import java.util.Locale;

import org.apache.commons.lang3.reflect.FieldUtils;

import com.carbonite.Browser.LocaleUtil;

public class LocalizedString {

	private String de_DE;
	private String en_US;

	public LocalizedString(String en_US) {
		this.en_US = en_US;
	}

	public LocalizedString(String en_US, String de_DE) {
		this.en_US = en_US;
		this.de_DE = de_DE;

	}
	public String get() {
		
		return this.get(LocaleUtil.getCurrentLocale());
	}
	public String get(Locale locale) {
		
		try {
			
			String localizedString=(String) FieldUtils.readField(this,locale.toString(),true);
			
			if(localizedString==null) {
				throw new RuntimeException(String.format("Localized '%s' string is undefined", locale.toString()));
			}
			return localizedString;
		} catch(IllegalArgumentException iaEx) {
			
			throw new RuntimeException(String.format("Unsupported locale: %s", locale.toString()));
		} catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	public String get(Locale locale,Object...args) {
		
		return String.format(this.get(locale), args);
	}

}
