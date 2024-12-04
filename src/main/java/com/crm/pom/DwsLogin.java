package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsLogin {
	
	public DwsLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
@FindBy(className = "ico-login")
private WebElement login_link;
@FindBy(id = "Email")
private WebElement email;
@FindBy(name = "Password")
private WebElement password;
@FindBy(css = "input[id='RememberMe']")
private WebElement remember_me;
@FindBy(xpath = "//input[value='Log in']")
private WebElement login_button;

public void login_link() {
	
}
public void email(String string) {

}
public void password(String string) {
	
}
public void rememberme() {
	
}
public void login_button() {
	
}
public void login(String email1, String password1) {
	login_link.click();
	email.sendKeys(email1);
	password.sendKeys(password1);
	remember_me.click();
	login_button.click();
}

}

