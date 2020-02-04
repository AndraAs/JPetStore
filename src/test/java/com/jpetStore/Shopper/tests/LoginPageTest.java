package com.jpetStore.Shopper.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.jpetStore.Shopper.steps.PetStoreSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class LoginPageTest {
	@Managed
	WebDriver driver;
	@Steps
	PetStoreSteps shopper;
	@Test
	@Title("Verify if user can login successfully")
	public void verifyLoginSuccess() {
		
		shopper.navigateToSignOnPage();
		shopper.doLogin("john.doe", "test123");
		String welcomeMsg=shopper.getWelcommeMsg();
		assertEquals("Welcome John!", welcomeMsg);
	}
	@Test
	@Title("Verify if the user can sign out succesfully")
	public void verifyUserLogOutSuccess() {
		
		shopper.navigateToSignOnPage();
		shopper.doLogin("john.doe", "test123");
		shopper.signOut();
		
		
	}
	@Test
	@Title("Verify if invalid login message is displayed")
	public void verifyIfInvalidLoginMsgIsDisplayed() {
		shopper.navigateToSignOnPage();
		shopper.doLogin("pie", "chart");
		String invalidLogInMsg=shopper.getMessageOnInvalidLogIn();
		assertEquals("Invalid username or password. Signon failed.", invalidLogInMsg);
	}

}
