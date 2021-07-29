package com.carbonite.Pages;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.carbonite.Browser.ProxyDriver;
import com.carbonite.utils.entities.LocalizedString;


public class HomePage extends Page {

	public HomePage(WebDriver wd, boolean waitForPageToLoad) {

		super(wd, waitForPageToLoad);

	}

	private static By HOME_BACKUP = By.cssSelector("div[id=mainnav]>nav:last-of-type>ul>li:nth-of-type(1)");
	private static By BUISNESS_SOLUTION = By.cssSelector("div[id=mainnav]>nav:last-of-type>ul>li:nth-of-type(2)");
	private static By COMPARE_BACKUP_PLAN = By.cssSelector("div[id=mainnav]>nav:last-of-type>ul>li:nth-of-type(3)");
	private static By ALL_PRODUCT = By.cssSelector("div[id=mainnav]>nav:last-of-type>ul>li:nth-of-type(4)");
	private static By FREE_TRIAL = By.cssSelector("div[id=mainnav]>nav:last-of-type>ul>li:nth-of-type(5)");
	private static By CLOSE_COOKIE_DIALOG=By.cssSelector("button[class=circle]");

	private static By MAIN_HEADER = By.cssSelector("div>h1");
	private static By SUB_HEADER = By.cssSelector("div[class=flex-col-6]>div>p[class=text-18]");
	private static By IMAGE = By.cssSelector(
			"div[id='mainnav']>nav>a>div[class=responsive-image]>img[src='/globalassets/images/logos/logo-carbonite-opentext.svg']");
	
	public static class Localisation{
		public static final LocalizedString PAGE_TITLE=new LocalizedString("Cloud backup solutions for home and business | Carbonite");
		public static final LocalizedString MAIN_HEADER_TEXT=new LocalizedString("Huge Holiday Savings!");
		public static final LocalizedString SUB_HEADER_TEXT=new LocalizedString("One year of Carbonite Safe® now with antivirus protection.");	
		
	}

	public HomeBackUpPage homeBackUpPage() {
		((ProxyDriver) wd).click(HOME_BACKUP);
		return new HomeBackUpPage(wd, false);
	}

	public BuisnessSolutionPage buisnessSolutionPage() {
		((ProxyDriver) wd).click(BUISNESS_SOLUTION);
		return new BuisnessSolutionPage(wd, false);
	}

	public CompareBackUpPlanPage compareBackUpPlanPage() {
		((ProxyDriver) wd).click(COMPARE_BACKUP_PLAN);
		return new CompareBackUpPlanPage(wd, false);
	}

	public AllProductPage allProductPage() {
		((ProxyDriver) wd).click(ALL_PRODUCT);
		return new AllProductPage(wd, false);
	}

	public FreeTrialPage freeTrialPage() {
		((ProxyDriver) wd).click(FREE_TRIAL);
		return new FreeTrialPage(wd, false);
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
	
	public void cookieDialogCloseButton() {
		((ProxyDriver) wd).click(CLOSE_COOKIE_DIALOG);
	}

	@Override
	public String getPageURL() {
		return getDomain();
	}

	@Override
	public HomePage get() {
		return (HomePage) super.get();
	}

	@Override
	public void load() {
		super.load();
	}

	@Override
	public void isLoaded() {

		try {
			((ProxyDriver) wd).waitForElementToBeVisible(MAIN_HEADER, 5);

		} catch (Exception e) {
			String failMsg=wd.getCurrentUrl();
			fail(failMsg);
		}

	}

}
