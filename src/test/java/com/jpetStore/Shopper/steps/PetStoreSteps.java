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
	AccountsPage accountspage;
	DashBoardPage dashBoardPage;
	
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
	
	/*************************************
	 * 
	 * ACCOUNT PAGE STEPS
	 * 
	 *************************************/
	@Step("Add new user with userName:{0}, password: {1}, repeatePassword:{2} ")
	public AccountsPage addNewUserInfo(String userName, String password, String repeatePassword) {
		
		return accountspage.addNewUserInfo(userName, password, repeatePassword);
	}
	
	@Step("Adding Account Information")
	public AccountsPage addAccountInformation(String firstName,
			  String lastName,
			  String email,
			  String phone,
			  String add1,
			  String add2,
			  String city,
			  String state,
			  String zip,
			  String country) {
		return accountspage.addAccountInformation(firstName, lastName, email, phone, add1, add2, city, state, zip, country);
	}
	
	@Step("Adding Profile Information")
	public AccountsPage addProfileinfo(String language, String category, boolean myList, boolean myBanner) {
		return accountspage.addProfileinfo(language, category, myList, myBanner);
	}
	
	@Step("Save Account Information")
	public DashBoardPage saveInformation() {
		return accountspage.saveInformation();
	}
	/**********************************
	 * DASHBOARD PAGE STEPS
	 * @return
	 *********************************/
	@Step("Getting Welcomme Message")
	public String getWelcommeMsg() {
		return dashBoardPage.getWelcommeMsg();
	}
	@Step("Select pet categories from SideBar")
	public ProductsPage selectProductFromSideBar(PetCategories petCategories) {
		return dashBoardPage.selectProductFromSideBar(petCategories);
	}
	@Step("Select {0} pet categories from Center")
	public ProductsPage selectProductFromCenter(PetCategories petCategories) {
		return dashBoardPage.selectProductFromCenter(petCategories);
	}
	
	
	
	/*************************************
	 * 
	 * BASE PAGE STEPS
	 * 
	 *************************************/
}
