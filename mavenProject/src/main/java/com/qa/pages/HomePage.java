package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase
{
    
	@FindBy(xpath="//td[contains(text(),'User:')]")
	WebElement userNameLink;

	@FindBy(xpath="//a[text()='Contacts']")
    WebElement contactsLink;
    
    @FindBy(xpath="//a[text()='Deals']")
    WebElement dealsLink;
    
    public HomePage() throws IOException
    {
		PageFactory.initElements(driver, this);
	}
    
    public String validateHomePageTitle()
    {
    	String title=driver.getTitle();
    	return title;
    }
    
    public boolean validateUserName()
    {
    	boolean value=userNameLink.isDisplayed();
    	return value;
    }
    
    public ContactPage validateContactsPage() throws IOException
    {
		driver.switchTo().frame("mainpanel");
    	contactsLink.click();
    	return new ContactPage();
    }
    

    
    
    
    
    
    
    
}
