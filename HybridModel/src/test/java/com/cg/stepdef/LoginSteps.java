package com.cg.stepdef;

import org.junit.Assert;

import com.cg.pages.LoginPage;
import com.cg.util.TestUtil;

import cucumber.api.java.en.*;

public class LoginSteps {
	
	LoginPage login;
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    login=new LoginPage();
	    TestUtil.getData();
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
	    login.enterUn(arg1);
	    login.enterPw(arg2);
	}

	@When("^clicks on signin$")
	public void clicks_on_signin() throws Throwable {
	   login.clickSignIn();
	}

	@Then("^login is unsuccessful$")
	public void login_is_unsuccessful() throws Throwable {
	   TestUtil.takeSS();
		Assert.assertEquals(login.getTitle(),"Online Shopping India - Shop for clothes, shoes, Bags, watches @ Shoppersstop.com");
	}



}
