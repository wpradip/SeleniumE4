package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsHome {
	public DwsHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(className = "ico-register")
	private WebElement register_button;
	@FindBy(className = "ico-login")
	private WebElement login_button;
	@FindBy(className = "//span[text()='Shopping cart']")
	private WebElement shopping_cart;
	@FindBy(className = "//span[text()='Wishlist']")
	private WebElement wishlist;
	@FindBy(id = "small-searchterms")
	private WebElement search_field;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement search_button;
	
	
	/*
	 * @FindBy(xpath = "//a[contains(text(),'Books')]") private WebElement books;
	 * 
	 * @FindBy(xpath = "//a[contains(text(),'Computers')]") private WebElement
	 * computer;
	 * 
	 * @FindBy(xpath = "//a[contains(text(),'Electronics')]") private WebElement
	 * electronics;
	 * 
	 * @FindBy(xpath = "//a[contains(text(),'Apparel & Shoes')]") private WebElement
	 * apparelShoes;
	 * 
	 * @FindBy(xpath = "//a[contains(text(),'Digital downloads')]") private
	 * WebElement digitalDownloads;
	 * 
	 * @FindBy(xpath = "//a[contains(text(),'Jewelry')]") private WebElement
	 * jewelry;
	 * 
	 * @FindBy(xpath = "//a[contains(text(),'Gift Cards')]") private WebElement
	 * giftscards;
	 */
	
	
	@FindBy(xpath = "//strong[contains(text(),'Community poll')]")
	private WebElement communityPoll;
	@FindBy(xpath = "//label[contains(text(),'Excellent')]")
	private WebElement excellent;
	@FindBy(xpath = "//label[contains(text(),'Good')]")
	private WebElement good;
	@FindBy(xpath = "//label[contains(text(),'Poor')]")
	private WebElement poor;
	@FindBy(xpath = "//label[contains(text(),'Very bad')]")
	private WebElement veryBad;
	
	@FindBy(xpath = "//h3[contains(text(),'Follow us')]")
	private WebElement followUs;
	@FindBy(xpath = "//a[contains(text(),'Facebook')]")
	private WebElement facebook;
	@FindBy(xpath = "//a[contains(text(),'Twitter')]")
	private WebElement twitter;
	@FindBy(xpath = "//a[contains(text(),'RSS')]")
	private WebElement rss;
	@FindBy(xpath = "//a[contains(text(),'YouTube')]")
	private WebElement youtube;
	@FindBy(xpath = "//a[contains(text(),'Google+')]")
	private WebElement google_plus;
	
	public void home() {
		register_button.click();
		login_button.click();
		shopping_cart.click();
		wishlist.click();
		search_field.sendKeys("mobile");
		search_button.click();
	}
	public void mid() {
		
	}
	public void followUs() {
		facebook.click();
		twitter.click();
		rss.click();
		youtube.click();
		google_plus.click();
	}
}
