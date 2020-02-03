package com.jpetStore.Shopper.pages;

public class LoginPage extends BasePage {

	private static final String USERNAME_INPUT= "//div[@id='Catalog']//input[@name='username']";
	private static final String PASSWORD_INPUT= "//div[@id='Catalog']//input[@name='password']";
	private static final String BTN_INPUT= "//div[@id='Catalog']//input[@name='signon']";
	private static final String REGISTER_BTN= "//div[@id='Catalog']//a[contains(text(),'Register Now!')]";
	private static final String INVALID_MSG= "//div[@id='Content']/ul/li";
	private static final String LOGO_LINK="div[id='LogoContent'] a[href$='.action'";
	/**
	 * Method used to log in to store
	 * @param username
	 * @param password
	 * @return
	 */
	public DashBoardPage doLogin(String username, String password) {
		waitForTextToAppear("Please enter your username and password.");
		waitForTextToAppear("Need a user name and password?");
		
		waitFor(USERNAME_INPUT).$(USERNAME_INPUT).type(username);
		waitFor(PASSWORD_INPUT).$(PASSWORD_INPUT).type(password);
		waitFor(BTN_INPUT).$(BTN_INPUT).click();
		return this.switchToPage(DashBoardPage.class);
	}
	/**
	 * navigate to registration page
	 * @return
	 */
	public AccountsPage navToRegistrationPage() {
		waitForTextToAppear("Please enter your username and password.");
		waitForTextToAppear("Need a user name and password?");
		waitFor(REGISTER_BTN).$(REGISTER_BTN).click();
		return this.switchToPage(AccountsPage.class);
	}
	/**
	 * method to return invalid log in msg
	 * @return
	 */
	public String getMessageOnInvalidLogIn() {
		return waitFor(INVALID_MSG).$(INVALID_MSG).getText();
	}
	
}
