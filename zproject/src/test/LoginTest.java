package test;

import org.testng.annotations.Test;

public class LoginTest  extends BaseClass{

	@Test(priority=1)
	public void validatedetails()
	{
	  lp.enterdetails();
	  
	}
	@Test(priority=2,dependsOnMethods="validatedetails")
	public void validateTitle()
	{
		lp.title();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
