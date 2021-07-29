package com.carbonite.test.suites;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "features/HomePageFeature", glue = { "com.carbonite.step.definitions",
		"com.carbonite.hooks" }, monochrome = true, dryRun = false,publish = true, tags = "@Smoke")

public class HomePageTest extends AbstractTestNGCucumberTests {

}
