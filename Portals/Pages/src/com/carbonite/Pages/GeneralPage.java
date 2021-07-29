package com.carbonite.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;

public abstract class GeneralPage extends LoadableComponent<GeneralPage> {

	private static final int DEFAULT_TIME_TO_WAIT_FOR_PAGE = 50;
	protected WebDriver wd;

	public GeneralPage(WebDriver wd, boolean waitForPageToLoad) {

		this.wd=wd;
		if (waitForPageToLoad) {
			this.waitforPageToload();
		}
	}

	@Override
	protected void load() {
		String pageURL = getPageURL();
		wd.get(pageURL);

	}
	
	@Override
	public GeneralPage get() {
		
		GeneralPage page=super.get();
		this.waitforPageToload();
		return page;
	}

	@Override
	protected abstract void isLoaded() throws Error;

	protected abstract String getPageURL();

	public void waitforPageToload() {
		this.waitForDocumentCompleteststate();

	}

	public void waitForDocumentCompleteststate() {
		waitForDocumentCompleteState(DEFAULT_TIME_TO_WAIT_FOR_PAGE);

	}

	public void waitForDocumentCompleteState(int secondsToWait) {
		wd.manage().timeouts().implicitlyWait(secondsToWait, TimeUnit.SECONDS);

	}

}
