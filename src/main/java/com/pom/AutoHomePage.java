package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoHomePage {

	public static WebDriver driver;
	@FindBy(xpath="//a[@class='login']")
	private WebElement signIn;

	public AutoHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignIn() {
		return signIn;
	}
	
}
