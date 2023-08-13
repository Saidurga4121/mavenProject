package com.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.ContactPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class ContactsPageTest extends TestBase
{
	HomePage homePage;
	ContactPage contactsPage;

	public ContactsPageTest() throws IOException {
		// super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
//		initialization();
//		LoginPage loginPage= new LoginPage();
//		HomePage homePage= new HomePage();
//		homePage = loginPage.login();
//		contactsPage=homePage.validateContactsPage();
	}
	@Test(enabled = false)
	public void clickContact()
	{
		// contactsPage.searchByName("Amar3 Singh3");
	}
	
	@AfterMethod
	public void tearDown() throws IOException
	{
		// driver.quit();
	}
  
}
