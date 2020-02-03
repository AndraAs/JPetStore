package com.jpetStore.Shopper.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.jpetStore.Shopper.steps.PetStoreSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class Sample {
	@Managed
	WebDriver driver;
	@Steps
	PetStoreSteps shopper;
	
	@Test
	@Title("Navigating to sign on page")
	public void navigateToSignOnPage() {
		
		shopper.navigateToSignOnPage();
		shopper.doLogin("john.doe", "test123");
		
	}
	

}
