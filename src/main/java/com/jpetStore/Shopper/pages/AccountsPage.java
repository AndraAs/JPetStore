package com.jpetStore.Shopper.pages;

public class AccountsPage extends BasePage {

	private static final String USER_ID="//div[@id='Catalog']//input[@name='username']";
	private static final String NEW_PASSWORD="//div[@id='Catalog']//input[@name='password']";
	private static final String CONFIRM_PASSWORD="//div[@id='Catalog']//input[@name='repeatedPassword']";
	private static final String FIRST_NAME="//div[@id='Catalog']//input[@name='account.firstName']";
	private static final String LAST_NAME="//div[@id='Catalog']//input[@name='account.lastName']";
	private static final String INPUT_EMAIL="//div[@id='Catalog']//input[@name='account.email']";
	private static final String INPUT_PHONE="//div[@id='Catalog']//input[@name='account.phone']";
	private static final String INPUT_ADD1="//div[@id='Catalog']//input[@name='account.address1']";
	private static final String INPUT_ADD2="//div[@id='Catalog']//input[@name='account.address2']";
	private static final String INPUT_CITY="//div[@id='Catalog']//input[@name='account.city']";
	private static final String INPUT_STATE="//div[@id='Catalog']//input[@name='account.state']";
	private static final String INPUT_ZIP="//div[@id='Catalog']//input[@name='account.zip']";
	private static final String INPUT_COUNTRY="//div[@id='Catalog']//input[@name='account.country']";
	
	private static final String LANGUAGE_DROP="//div[@id='Catalog']//select[@name='account.languagePreference']";
	private static final String CATEGORY_DROP="//div[@id='Catalog']//select[@name='account.favouriteCategoryId']";
	private static final String MYLIST_RADIO="//div[@id='Catalog']//input[@name='account.listOption']";
	private static final String MYBANNER_RADIO="//div[@id='Catalog']//input[@name='account.bannerOption']";
	private static final String SAVE_ACC_BTN="//div[@id='Catalog']//input[@name='newAccount']";
	
	public AccountsPage addNewUserInfo(String userName, String password, String repeatePassword) {
		waitForTextToAppear("User Information");
		waitFor(USER_ID).$(USER_ID).type(userName);
		waitFor(NEW_PASSWORD).$(NEW_PASSWORD).type(password);
		waitFor(CONFIRM_PASSWORD).$(CONFIRM_PASSWORD).type(repeatePassword);
		
		return this;
	}
	

}
