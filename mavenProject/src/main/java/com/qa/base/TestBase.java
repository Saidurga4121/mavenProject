package com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public TestBase() throws IOException
	{
		prop = new Properties();
		File f= new File("C:\\Users\\003KT8744\\Downloads\\mavenProject\\mavenProject\\src\\main\\java\\com\\qa\\config\\Config.properties");
		FileInputStream fis= new FileInputStream(f);
		prop.load(fis);
	}
	
	
	// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		public static void initialization()
		{
			// if u want to change the value which we are getting from properties file 
			// when executing from terminal ....then we can change and run
			// if u dont mention anything in the maven then it will take from the properties file
			// cmd to change and execute from terminal 
			// mvn test -Dbrowser=firefox
			String browser=System.getProperty("browser")!=null ? System.getProperty("browser") :prop.getProperty("browser");
			//String browser=prop.getProperty("browser");
			//////////////////////////////////////////////////
			ChromeOptions options= new ChromeOptions();
			options.addArguments("headless");
			//////////////////////////////////////////////////
			if(browser.contains("chrome"))
			{
				if(browser.contains("headless"))
				{
					System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
					// we cannot create object for interface ...thats why we will create obj for chrome driver
					// web driver is an interface
					driver= new ChromeDriver(options);
					driver.manage().window().setSize(new Dimension(1440,900)); // opens in full screen
				}
			}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		
	}

}
