package com.jpetStore.Shopper.pages;

import org.openqa.selenium.By;

import com.jpetStore.Shopper.utils.PetCategories;

import net.serenitybdd.core.pages.PageObject;
import net.sourceforge.htmlunit.corejs.javascript.ast.SwitchCase;

public class BasePage extends PageObject {
	private static final String ENTER_THE_STORE_LINK="//a[@href='actions/Catalog.action']";
	private static final String SIGN_IN_LINK="//*[@id='MenuContent']/a[contains(text(),'Sign In')]";
	private static final String LOGO_LINK="div[id='LogoContent'] a[href$='.action'";
	private static final String SIGN_OUT_LINK="//*[@id='MenuContent']/a[contains(text(),'Sign Out')]";
	private static final String MY_ACCOUNT_LINK="//*[@id='MenuContent']/a[contains(text(),'My Account')]";
	private static final String HELP_LINK="div[id='MenuContent'] a[href$='/help']"; //might not work
	private static final String SHOPPING_CART="div[id='MenuContent'] a[href$='Cart.action']";  //not sure
	private static final String SEARCH_INPUT="//input[@name='keyword']";
	private static final String SEARCH_BUTTON="//input[@name='searchProducts']";
	
	private static final String FISH_LINK="div[id='QuickLinks'] a[href$='FISH']";
	private static final String DOGS_LINK="div[id='QuickLinks'] a[href$='DOGS']";
	private static final String REPTILES_LINK="div[id='QuickLinks'] a[href$='REPTILES']";
	private static final String CATS_LINK="div[id='QuickLinks'] a[href$='CATS']";
	private static final String BIRDS_LINK="div[id='QuickLinks'] a[href$='BIRDS']";
	private static final String BANNER_IMG="//*[@id='Banner']/img";
	
	
	
	public LoginPage navigateToSignOnPage() {
		open();
		waitForTextToAppear("Welcome to JPetStore 6");
		waitFor(ENTER_THE_STORE_LINK).$(ENTER_THE_STORE_LINK).click();
		
		waitFor(SIGN_IN_LINK).$(SIGN_IN_LINK).click();
		
		return this.switchToPage(LoginPage.class);
	}
	
	/**
	 * Clicks on sign in link
	 * @return
	 */
	public LoginPage clickOnSignInLink() {
	
		waitFor(SIGN_IN_LINK).find(By.xpath(SIGN_IN_LINK)).click();
		
		return this.switchToPage(LoginPage.class);
	}
	
	/**
	 * Navigate to dashBoard page
	 * @return
	 */
	public DashBoardPage navigateToDashBoard() {
		waitFor(LOGO_LINK).$(LOGO_LINK).click();
		return this.switchToPage(DashBoardPage.class);
	}
	
	/**
	 * sign out of the store
	 * @return
	 */
	
	public DashBoardPage signOut() {
		waitFor(SIGN_OUT_LINK).$(SIGN_OUT_LINK).click();
		
		waitForAbsenceOf(SIGN_OUT_LINK).shouldNotBeVisible(By.xpath(SIGN_OUT_LINK));
		return this.switchToPage(DashBoardPage.class);
	}
	
//	public DashBoardPage clickOnLogo() {
//		waitFor(LOGO_LINK).$(LOGO_LINK).click();
//	return this.switchToPage(DashBoardPage.class);
//	}
	
	/**
	 * nav to accounts page
	 * @return
	 */
	public AccountsPage navToAccountPage() {
		waitFor(MY_ACCOUNT_LINK).$(MY_ACCOUNT_LINK).click();
		return this.switchToPage(AccountsPage.class);
	}
	
	/**
	 * search for products
	 * @return
	 */
	public ProductsPage searchForProd(String searchVal) {
		waitFor(SEARCH_INPUT).$(SEARCH_INPUT).type("bulldog");
		waitFor(SEARCH_BUTTON).$(SEARCH_BUTTON).click();
		return this.switchToPage(ProductsPage.class);
	}
	/**
	 * nav to help page
	 * @return
	 */
	
	public HelpPage navToHelpPage() {
		waitFor(HELP_LINK).$(HELP_LINK).click();
		
		return this.switchToPage(HelpPage.class);
	}
	/**
	 * click on shopping cart link
	 * @return
	 */
	
	public ProductsPage clickOnShoppingCart() {
		waitFor(SHOPPING_CART).$(SHOPPING_CART).click();
		return this.switchToPage(ProductsPage.class);
	}
	/**
	 * method to select product category
	 * @param productCategory
	 * @return
	 */
	
	public ProductsPage navToProductCateg(PetCategories productCategory) {
		switch (productCategory) {
		case FISH:
			waitFor(FISH_LINK).$(FISH_LINK).click();
			return this.switchToPage(ProductsPage.class);
		case DOGS:
			waitFor(DOGS_LINK).$(DOGS_LINK).click();
			return this.switchToPage(ProductsPage.class);
		case REPTILES:
			waitFor(REPTILES_LINK).$(REPTILES_LINK).click();
			return this.switchToPage(ProductsPage.class);
		case CATS:
			waitFor(CATS_LINK).$(CATS_LINK).click();
			return this.switchToPage(ProductsPage.class);
		case BIRDS:
			waitFor(BIRDS_LINK).$(BIRDS_LINK).click();
			return this.switchToPage(ProductsPage.class);

		default:
			break;
		}
		return null;
		
		
		
	}
}
