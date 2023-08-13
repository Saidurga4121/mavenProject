package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class ContactPage extends TestBase 
{

	@FindBy(xpath = "//td[text()='Contacts']")
	WebElement contacts;

	public ContactPage() throws IOException 
	{
		PageFactory.initElements(driver, this);
	}

	public void searchByName(String name) 
	{
		driver.findElement(By.xpath("//a[text()='" + name + "']")).click();
	}

}
