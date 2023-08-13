package com.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.ContactPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class HomePageTest extends TestBase
{
    HomePage homepage;
    
    ContactPage contactPage;
	public HomePageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException
	{
		initialization();
		LoginPage rv1= new LoginPage();
		homepage=rv1.login();
	}
	
	@Test(priority=1, enabled = false)
	public void validateUserName()
	{
		driver.switchTo().frame("mainpanel");
		boolean value=homepage.validateUserName();
		Assert.assertTrue(value,"no name");
	}
	
	@Test(priority=2, enabled = false)
	public void clickOnContacts() throws IOException
	{
		driver.switchTo().frame("mainpanel");
		contactPage=homepage.validateContactsPage();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	
	
	
	
}
