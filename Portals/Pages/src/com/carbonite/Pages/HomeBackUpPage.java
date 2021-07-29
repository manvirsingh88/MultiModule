package com.carbonite.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.carbonite.Browser.ProxyDriver;
import com.carbonite.utils.entities.LocalizedString;

public class HomeBackUpPage extends Page {

	public HomeBackUpPage(WebDriver wd, boolean waitForPageToLoad) {
		super(wd, waitForPageToLoad);
	}

	private static By MAIN_HEADER = By.cssSelector("div>h1");
	private static By IMAGE = By.cssSelector("div[class=flex-col-6]>div>img");
	private static By SUB_HEADER = By.cssSelector("p[class=content]");
	
	public static class Localisation{
		public static final LocalizedString PAGE_TITLE=new LocalizedString("Back up and protect files with Carbonite Safe | Carbonite");
		public static final LocalizedString MAIN_HEADER_TEXT=new LocalizedString("The #1 way to secure your files just got better");
		public static final LocalizedString SUB_HEADER_TEXT=new LocalizedString("Carbonite Safe® Plus and Prime backup plans now include Webroot's award-winning virus protection ");	
		
	}

	public String getMainHeaderText() {
		return ((ProxyDriver) wd).getText(MAIN_HEADER);
	}

	public String getSubHeaderText() {
		return ((ProxyDriver) wd).getText(SUB_HEADER);
	}

	public Boolean isImageDisplayed() {
		return ((ProxyDriver) wd).findElement(IMAGE).isDisplayed();
	}

	public String titleofThePage() {
		return ((ProxyDriver) wd).getTitle();
	}

}
