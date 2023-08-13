package com.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginTest4 
{
	

	
	@Test(priority = 3)
	public void loginPageTitle() throws IOException
	{
	   System.out.println("iam 7th");
	}
	@Test(priority = 6)
	public void crmLogo() throws IOException
	{
		 System.out.println("iam 8th");
	}
	
	
	
	
	
	
}
