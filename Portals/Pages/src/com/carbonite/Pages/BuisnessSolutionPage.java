package com.carbonite.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.carbonite.Browser.ProxyDriver;

public class BuisnessSolutionPage extends Page {

	public BuisnessSolutionPage(WebDriver wd, boolean waitForPageToLoad) {
		super(wd, waitForPageToLoad);
	}

	private static By MAIN_HEADER = By.cssSelector("div>h1");
	private static By IMAGE = By.cssSelector("div[class='flex-col-6']>div[class='responsive-image']>img");
	private static By SUB_HEADER = By.cssSelector("div[class='col-md-12']>div[class='media media-sectionHeader']>h2");

	public String getMainHeaderText() {
		return ((ProxyDriver) wd).getText(MAIN_HEADER);
	}

	public String getSubHeaderText() {
		return ((ProxyDriver) wd).getText(SUB_HEADER);
	}

	public Boolean isImageDisplayed() {
		return ((ProxyDriver) wd).findElement(IMAGE).isDisplayed();
	}
	
	public String titleofThePage(){
		return ((ProxyDriver) wd).getTitle();
	}
}
