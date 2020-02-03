package com.jpetStore.Shopper.steps;

import com.jpetStore.Shopper.pages.AccountsPage;
import com.jpetStore.Shopper.pages.BasePage;
import com.jpetStore.Shopper.pages.DashBoardPage;
import com.jpetStore.Shopper.pages.HelpPage;
import com.jpetStore.Shopper.pages.LoginPage;
import com.jpetStore.Shopper.pages.ProductsPage;
import com.jpetStore.Shopper.utils.PetCategories;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class PetStoreSteps extends ScenarioSteps {
	BasePage basepage;
	LoginPage loginpage;
	
	
	/*************************************
	 * 
	 * BASE PAGE STEPS
	 * 
	 *************************************/
	@Step("signing out from the store")
	public DashBoardPage signOut() {
		return basepage.signOut();
	}
	@Step("nav to sign on page")
	public LoginPage navigateToSignOnPage() {
		
		return basepage.navigateToSignOnPage();
	}
	@Step("Navigate to Login Page")
	public LoginPage clickOnSignInLink() {
		
		return basepage.clickOnSignInLink();
	}
	@Step("Navigate to products page by clicking on: {0} link on header")
	public ProductsPage navToProductCateg(PetCategories productCategory) {
		return basepage.navToProductCateg(productCategory);
	}
	@Step("Nav to product page by clicking on shopping cart")
	public ProductsPage clickOnShoppingCart() {
		return basepage.clickOnShoppingCart();
	}
	@Step("Navigate to help page")
	public HelpPage navToHelpPage() {
		return basepage.navToHelpPage();
	}
	@Step("Click on company logo and nav to dashboard")
	public DashBoardPage navigateToDashBoard() {
		return basepage.navigateToDashBoard();
	}
	@Step("Nav to accounts page")
	public AccountsPage navToAccountPage() {
		return basepage.navToAccountPage();
	}
	@Step("Search for product: {0}")
	public ProductsPage searchForProd(String searchVal) {
		return basepage.searchForProd(searchVal);
	}
	
	
	/*************************************
	 * 
	 * LOGIN PAGE STEPS
	 * 
	 *************************************/
	@Step("invalid log in")
	public String getMessageOnInvalidLogIn() {
		return loginpage.getMessageOnInvalidLogIn();
	}
	
	@Step("navigating to user reg page")
	public AccountsPage navToRegistrationPage() {
		return loginpage.navToRegistrationPage();
	}
	@Step("logging into the app with username: {0} & password: {1}")
	public DashBoardPage doLogin(String username, String password) {
		return loginpage.doLogin(username, password);
	}
	
}