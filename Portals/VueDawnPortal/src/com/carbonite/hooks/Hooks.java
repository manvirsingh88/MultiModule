package com.carbonite.hooks;

import com.carbonite.Browser.BrowserUtils;
import com.carbonite.Browser.ProxyDriver;
import com.carbonite.base.CustomeBase;
import com.carbonite.device.Device;
import com.carbonite.device.DeviceUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CustomeBase {

	private CustomeBase base;

	public Hooks(CustomeBase base) {
		this.base = base;
	}

	@Before()
	public void before() {

		Device device = DeviceUtil.getDevice();

		if (device.equals(Device.DESKTOP)) {
			base.wd = new ProxyDriver(BrowserUtils.getWebDriver());
		}
	}

	@After
	public void tearDown() {
		if (base.wd != null) {

			((ProxyDriver) base.wd).quit();
		}

	}

}
