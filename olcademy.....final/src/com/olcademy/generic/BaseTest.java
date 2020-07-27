package com.olcademy.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.olcademy.utilities.ReadConfig;

public class BaseTest implements IAutoConsts {
	public static WebDriver driver;
	@BeforeClass
	public void setUp() throws Throwable 
	 { 
		FileLib flib = new FileLib();
		String browserValue = flib.getPropkeyValue(PROP_PATH,"browser");
		if(browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_VALUE); 
			driver = new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("firefox")) {
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Enter correct browser name");
		}
		driver.get(flib.getPropkeyValue(PROP_PATH,"url"));
		}
		@AfterClass
		public void  tearDown() {
		 driver.quit();
		 
			
		}
	}