package com.carbonite.testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.carbonite.Browser.BrowserUtils;
import com.carbonite.Browser.ProxyDriver;
import com.carbonite.device.Device;
import com.carbonite.device.DeviceUtil;

public class BaseTest {

	protected WebDriver wd;

	@BeforeMethod(alwaysRun = true)
	public void before() {

		
	}

	@AfterMethod(alwaysRun = true)
	public void after() {
		if (wd != null) {
			((ProxyDriver) wd).quit();
		}
	}

}
