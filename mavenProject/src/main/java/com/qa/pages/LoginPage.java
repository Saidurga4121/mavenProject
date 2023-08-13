package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.base.TestBase;

public class LoginPage extends TestBase 
{
	WebDriver pagedriver;

	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[text()='Sign Up']")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive']")
	WebElement crmLogo;
	
	
	// to initialize all the elements in the page factory
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	// Actions
	public String validateLoginPageTitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}
	
	public boolean validateCrmImage()
	{
		return crmLogo.isDisplayed();
	}
	
	public HomePage login() throws IOException
	{
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginBtn.click();
		
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
