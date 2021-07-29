package com.carbonite.step.definitions;

import com.carbonite.Pages.HomeBackUpPage;
import com.carbonite.Pages.HomePage;
import com.carbonite.base.CustomeBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CommonSteps extends CustomeBase {
	
	private CustomeBase base;
	private HomePage homepage;
	private HomeBackUpPage homeBackUpPage;
	
	public CommonSteps(CustomeBase base) {
	this.base=base;
	homepage=new HomePage(base.wd, false);
	}
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
		System.out.println("Loading Home Page");
		homepage = new HomePage(base.wd, false).get();

	}
	
	@Then("User closes cookie dialog box")
	public void user_closes_cookie_dialog_box() {
		System.out.println("Closing Cookie Dialog Box");
		homepage.cookieDialogCloseButton();
	}

}
