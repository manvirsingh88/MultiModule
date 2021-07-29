package com.carbonite.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtils {

	private static Browser browser;
	private static final Browser DEFAULT_BROWSER = Browser.GOOGLE_CHROME;
	public static final String USER_DIR = System.getProperty("user.dir");

	public static Browser getBrowser() {

		browser = Browser.getByName(System.getProperty("browser", DEFAULT_BROWSER.toString()));
		return browser;
	}

	public static WebDriver getChromeDriver() {

		WebDriverManager.chromedriver().setup();

		return new ChromeDriver();
	}

	public static WebDriver getEdgeDriver() {

		WebDriverManager.edgedriver().setup();

		return new EdgeDriver();
	}

	public static WebDriver getfirefoxDriver() {

		WebDriverManager.firefoxdriver().setup();

		return new FirefoxDriver();
	}

	public static WebDriver getWebDriver(Browser browser) {

		WebDriver wd = null;

		if (Browser.EDGE.equals(browser)) {
			wd = getEdgeDriver();

		} else if (Browser.GOOGLE_CHROME.equals(browser)) {

			wd = getChromeDriver();
		}

		else if (Browser.FIREFOX.equals(browser)) {
			wd = getfirefoxDriver();
		}

		maximizeWindow(wd);

		return wd;

	}
	
	public static WebDriver getWebDriver() {
		return BrowserUtils.getWebDriver(BrowserUtils.getBrowser());
	}

	public static void maximizeWindow(WebDriver wd) {

		wd.manage().window().maximize();

	}

}
