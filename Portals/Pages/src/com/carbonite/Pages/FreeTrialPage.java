package com.carbonite.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.carbonite.Browser.ProxyDriver;

public class FreeTrialPage extends Page {

	public FreeTrialPage(WebDriver wd, boolean waitForPageToLoad) {
		super(wd, waitForPageToLoad);
	}

	private static By MAIN_HEADER = By.cssSelector("div>h1");
	private static By SUB_HEADER = By.cssSelector("div[class=header-subhead]");

	public String getMainHeaderText() {
		return ((ProxyDriver) wd).getText(MAIN_HEADER);
	}

	public String getBoostText() {
		return ((ProxyDriver) wd).getText(SUB_HEADER);
	}

	public String titleofThePage() {
		return ((ProxyDriver) wd).getTitle();
	}

}
