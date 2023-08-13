package com.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginTest extends TestBase
{
	LoginPage rv1;
	HomePage homePage;
	
	// before initialization method we have to initialize all the properties so we have to call super keyword
	// super calls the parent class constructor ---initialize all the properties
	public LoginTest() throws IOException  {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException
	{
		initialization();
	    rv1= new LoginPage();
	    
	}
	
	@Test(priority = 1)
	public void loginPageTitle() throws IOException
	{
	   String title= rv1.validateLoginPageTitle();
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.", "Title matched");
	}
	
	@Test(priority = 2)
	public void crmLogo() throws IOException
	{
	   boolean title= rv1.validateCrmImage();
		Assert.assertTrue(title, "image matched");
	}
	
	@Test(priority = 1)
	public void login() throws IOException
	{
		homePage=rv1.login();
	}
	
	
	@AfterMethod
	public void tearDown() throws IOException
	{
		 driver.quit();
	}
	
	
	
	
}
