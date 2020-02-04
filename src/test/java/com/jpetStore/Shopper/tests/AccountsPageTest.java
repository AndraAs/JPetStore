package com.jpetStore.Shopper.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;
import com.jpetStore.Shopper.steps.PetStoreSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class AccountsPageTest {
@Managed
WebDriver driver;

@Steps
PetStoreSteps shopper;


@Test
@Title("User registration, new credentials log in")
public void newRegistrationCredentialsLogIn() {
	Faker faker= new Faker();
	String userName= "test" + faker.number().randomNumber(100, false);
	String password= faker.internet().password();
	String repeatePassword= password;
	String firstName = faker.name().firstName();
	String lastName= faker.name().lastName();
	String email= faker.internet().emailAddress();
	String phone= faker.phoneNumber().cellPhone();
	String add1= faker.address().buildingNumber();
	String add2= faker.address().streetAddress();
	String city= faker.address().city();
	String state= faker.address().state();
	String zip=faker.address().zipCode();
	String country=faker.address().country();
	
	
	shopper.navigateToSignOnPage();
	shopper.clickOnSignInLink();
	shopper.navToRegistrationPage();
	shopper.addNewUserInfo(userName, password, repeatePassword);
	shopper.addAccountInformation(firstName, lastName, email, phone, add1, add2, city, state, zip, country);
	shopper.addProfileinfo("english", "DOGS", true, true);
	shopper.saveInformation();
	shopper.clickOnSignInLink();
	shopper.doLogin(userName, password);
	String WelcomeMsg=shopper.getWelcommeMsg();
	assertEquals("Welcome "+ firstName + "!", WelcomeMsg);
	
}
	
}
