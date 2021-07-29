package com.carbonite.step.definitions;

import org.testng.Assert;

import com.carbonite.Pages.HomePage;
import com.carbonite.Pages.HomePage.Localisation;
import com.carbonite.base.CustomeBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageStepDefinitions extends CustomeBase {

	private CustomeBase base;
	private HomePage homepage;

	public HomePageStepDefinitions(CustomeBase base) {
		this.base = base;
		homepage = new HomePage(base.wd, false);
	}

	@Then("^Verify the title of (.+) page$")
	public void verify_the_title_of_home_page(String titleOfPage) {
		switch (titleOfPage) {
		case "home":
			System.out.println("Verifying Title");
			titleOfPage = homepage.titleofThePage();
			Assert.assertEquals(titleOfPage, Localisation.PAGE_TITLE.get());
			break;
		case "login":
			System.out.println("Implement this Functionality");
		case "buy":
			//TODO

		default:
			break;
		}

	}

	@Then("Verify the main Header Text of Home Page {string}")
	public void verify_the_main_header_text_of_home_page(String mainHeaderText) {
		System.out.println("Verifying Header");
		mainHeaderText = homepage.getMainHeaderText();
		Assert.assertEquals(mainHeaderText, Localisation.MAIN_HEADER_TEXT.get());
	}

	@Then("Verify the Sub Header Text of Home Page {string}")
	public void verify_the_sub_header_text_of_home_page(String subHeaderText) {
		System.out.println("Verifying SubHeader");
		subHeaderText = homepage.getSubHeaderText().replace("\n", "");
		Assert.assertEquals(subHeaderText, Localisation.SUB_HEADER_TEXT.get());
	}

	@Then("Verify the  carbonite Logo on Home Page")
	public void verify_the_carbonite_logo_on_home_page() {
		System.out.println("Verifying logo");
		Assert.assertTrue(homepage.isImageDisplayed());
	}

}
