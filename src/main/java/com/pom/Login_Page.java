package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public static WebDriver driver;
	@FindBy(id="email") 
	private WebElement email;
	
	public Login_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmail() {
		return email;
	}
	
	@FindBy(id="passwd")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}

	
	@FindBy(id="SubmitLogin")
	private WebElement login;
	
	public WebElement getLogin() {
		return login;
	}

	public void click() {
		// TODO Auto-generated method stub
		
	}

	
	
	

}
