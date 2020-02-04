package com.jpetStore.Shopper.pages;

import com.jpetStore.Shopper.utils.PetCategories;

public class DashBoardPage extends BasePage {

	private static final String WELCOMME_MSG = "//div[@id='WelcomeContent']";
	private static final String SIDEBAR_FISH="*[id='SidebarContent'] a[href$='FISH']";
	private static final String SIDEBAR_DOGS="[id='SidebarContent'] a[href$='DOGS']";
	private static final String SIDEBAR_CATS="//div[@id='SidebarContent']/a[contains(@href, 'CATS')]";
	private static final String SIDEBAR_REPTILES="div[id='SidebarContent'] a[href$='REPTILES']";
	private static final String SIDEBAR_BIRDS="//*[@id='SidebarContent']/a[contains(@href, 'BIRDS')]";
//	
//	private static final String QUICKLINK_FISH="//div[@id='QuickLinks']/a[href$='FISH']";
//	private static final String QUICKLINK_DOGS="//div[@id='QuickLinks']/a[href$='DOGS']";
//	private static final String QUICKLINK_CATS="//div[@id='QuickLinks']/a[href$='CATS']";
//	private static final String QUICKLINK_REPTILES="//div[@id='QuickLinks']/a[href$='REPTILES']";
//	private static final String QUICKLINK_BIRDS="//div[@id='QuickLinks']/a[href$='BIRDS']";
	
	private static final String CENTER_CENTER_BIRD="div[id='MainImageContent'] area[href$='BIRDS']:nth-child(1)";
	private static final String CENTER_FISH="div[id='MainImageContent'] area[href$='FISH']";
	private static final String CENTER_DOGS="div[id='MainImageContent'] area[href$='DOGS']";
	private static final String CENTER_REPTILES="div[id='MainImageContent'] area[href$='REPTILES']";
	private static final String CENTER_CATS="div[id='MainImageContent'] area[href$='CATS']";
	private static final String CENTER_BIRDS="div[id='MainImageContent'] area[href$= 'CATS']+ area[href$='BIRDS']";
	
	
	
	/**
	 * method for getting greeting message
	 * @return
	 */
	public String getWelcommeMsg() {
		return waitFor(WELCOMME_MSG).$(WELCOMME_MSG).getText();	
		
	}
	
	
/**
 * METHOD for selecting pet category from side bar 
 * @param petCategories
 * @return
 */
	public ProductsPage selectProductFromCenter(PetCategories petCategories) {
		
		 switch (petCategories) {
		case FISH:
			$(CENTER_FISH).click();
			return this.switchToPage(ProductsPage.class);
		case DOGS:
			$(CENTER_DOGS).click();
			return this.switchToPage(ProductsPage.class);
		case CATS:
			$(CENTER_CATS).click();
			return this.switchToPage(ProductsPage.class);
		case REPTILES:
			$(CENTER_REPTILES).click();
			return this.switchToPage(ProductsPage.class);
		case BIRDS:
			$(CENTER_BIRDS).click();
			return this.switchToPage(ProductsPage.class);
			

		default:
			break;
		}
		return null;
	
	}
	
	
	public ProductsPage selectProductFromSideBar(PetCategories petCategories) {
		 
		 switch (petCategories) {
		case FISH:
			$(SIDEBAR_FISH).click();
			return this.switchToPage(ProductsPage.class);
		case DOGS:
			$(SIDEBAR_DOGS).click();
			return this.switchToPage(ProductsPage.class);
		case CATS:
			$(SIDEBAR_CATS).click();
			return this.switchToPage(ProductsPage.class);
		case REPTILES:
			$(SIDEBAR_REPTILES).click();
			return this.switchToPage(ProductsPage.class);
		case BIRDS:
			$(SIDEBAR_BIRDS).click();
			return this.switchToPage(ProductsPage.class);
			

		default:
			break;
		}
		return null;
	
	}
	
  
}
