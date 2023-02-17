package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.Login;

public class BaseClass {
	 WebDriver driver;
	 Login lp;
	
	@BeforeSuite
	public void initbrowser()
	{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.saucedemo.com/");
	}
	
	@BeforeClass
	public void obj()
	{
		 lp = new Login(driver);
		
		
		
	}
	
	public void teardown()
	{
		driver.close();
		driver.quit();
	}
	
	

}
