package com.carbonite.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.carbonite.Browser.ProxyDriver;

public class AllProductPage extends Page {

	public AllProductPage(WebDriver wd, boolean waitForPageToLoad) {
		super(wd, waitForPageToLoad);

	}

	private static By MAIN_HEADER = By.cssSelector("div>h1");
	private static By SUB_HEADER = By.cssSelector("div>div[class='flex-col-10']>p[class='text-22 p-right-60 m-bot-0']");
	private static By IMAGE = By.cssSelector("div>a>div>img[loading='lazy']");

	public String getMainHeaderText() {
		return ((ProxyDriver) wd).getText(MAIN_HEADER);
	}

	public String getBoostText() {
		return ((ProxyDriver) wd).getText(SUB_HEADER);
	}

	public Boolean isImageDisplayed() {
		return ((ProxyDriver) wd).findElement(IMAGE).isDisplayed();
	}

	public String titleofThePage() {
		return ((ProxyDriver) wd).getTitle();
	}

	public void harpreet() {

	}

}
