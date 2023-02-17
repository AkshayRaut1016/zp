package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='user-name']") WebElement username;
	
	@FindBy(xpath="//*[@id='password']") WebElement pass;
	 
	 public Login(WebDriver driver)
	 {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	
	
	
	
	public void enterdetails()
	{
		username.sendKeys("standard_user");
		pass.sendKeys("secret_sauce");
	}
	
	public void title()
	{
	 String  Title =  driver.getTitle();
	     System.out.println(Title);
	}
	
	
	
	
	
	
	
	
	
	
	

}
