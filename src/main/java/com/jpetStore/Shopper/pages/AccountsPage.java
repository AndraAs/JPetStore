package com.jpetStore.Shopper.pages;

import net.thucydides.core.webelements.Checkbox;

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
	
	
	/**
	 * Add new user info
	 * @param userName
	 * @param password
	 * @param repeatePassword
	 * @return
	 */
		public AccountsPage addNewUserInfo(String userName, String password, String repeatePassword) {
		waitForTextToAppear("User Information");
		waitFor(USER_ID).$(USER_ID).type(userName);
		waitFor(NEW_PASSWORD).$(NEW_PASSWORD).type(password);
		waitFor(CONFIRM_PASSWORD).$(CONFIRM_PASSWORD).type(repeatePassword);
		
		return this;
	}
		
		/**
		 * add account info method
		 * @param firstName
		 * @param lastName
		 * @param email
		 * @param phone
		 * @param add1
		 * @param add2
		 * @param city
		 * @param state
		 * @param zip
		 * @param country
		 * @return
		 */
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
			waitForTextToAppear("Account Information");
			waitFor(FIRST_NAME).$(FIRST_NAME).type(firstName);
			waitFor(LAST_NAME).$(LAST_NAME).type(lastName);
			waitFor(INPUT_EMAIL).$(INPUT_EMAIL).type(email);
			waitFor(INPUT_PHONE).$(INPUT_PHONE).type(phone);
			waitFor(INPUT_ADD1).$(INPUT_ADD1).type(add1);
			waitFor(INPUT_ADD2).$(INPUT_ADD2).type(add2);
			waitFor(INPUT_CITY).$(INPUT_CITY).type(city);
			waitFor(INPUT_STATE).$(INPUT_STATE).type(state);
			waitFor(INPUT_ZIP).$(INPUT_ZIP).type(zip);
			waitFor(INPUT_COUNTRY).$(INPUT_COUNTRY).type(country);
			
			return this;
		}
		
		/**
		 * method for adding profile info
		 * @param language
		 * @param category
		 * @param myList
		 * @param myBanner
		 * @return
		 */
		
		public AccountsPage addProfileinfo(String language, String category, boolean myList, boolean myBanner) {
			waitForTextToAppear("Profile Information");
			waitFor(LANGUAGE_DROP).$(LANGUAGE_DROP).selectByVisibleText(language);
			waitFor(CATEGORY_DROP).$(CATEGORY_DROP).selectByVisibleText(category);
			
			Checkbox myListCheckBox = new Checkbox( $(MYLIST_RADIO) );
			myListCheckBox.setChecked(myList);
			
			Checkbox myBannerCheckBox = new Checkbox( $(MYBANNER_RADIO) );
			myBannerCheckBox.setChecked(myBanner);
			
			
			return this;
		}
		
	
		public DashBoardPage saveInformation() {
			waitFor(SAVE_ACC_BTN).$(SAVE_ACC_BTN).click();
			return this.switchToPage(DashBoardPage.class);
		}
}
