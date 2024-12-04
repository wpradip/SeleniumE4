package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsRegistration {
	public DwsRegistration(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "ico-register")
	private WebElement register_button;
	@FindBy(id = "gender-male")
	private WebElement gender;
	@FindBy(id = "FirstName")
	private WebElement firstName;
	@FindBy(id = "LastName")
	private WebElement lastName;
	@FindBy(id = "Email")
	private WebElement email;
	@FindBy(id = "Password")
	private WebElement password;
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPassword;
	@FindBy(id = "register-button")
	private WebElement register;
	
	public void register_button() {
	}
	public void gender() {
	}
	public void firstName(String string) {
	}
	public void lastName(String string) {
	}
	public void email(String string) {
	}
	public void password(String string) {
	}
	public void confirmPassword(String string) {
	}
	public void register() {
	}
	

}
