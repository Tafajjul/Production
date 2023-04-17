package negative_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.mohs10.ActionDriver.SSreuseclass;
import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.CommonFuns;

public class Login_DWS extends StartBrowser 
{
	//Testing with both Wrong credentials
	@Test(priority = 0)
	public static void bothWrongCreds() throws Throwable
 	{
		CommonFuns cnf = new CommonFuns();
		cnf.logIn("Deepika", "Deepika"); 
		
		//capturing screenshot
		SSreuseclass.SSReusablemethod(driver, "Both invalid values");
		
		//verify error message is displayed or not
		WebElement errorMsg = driver.findElement(By.xpath("//span[@for='Email']"));
		String actualErrormsg = errorMsg.getText();
		String expectederrormsg = "Please enter a valid email address.";
		
		if(actualErrormsg.equalsIgnoreCase(expectederrormsg))
		{
			System.out.println("Test Passed!, Scenario - both Wrong creds, Error Message:"+actualErrormsg);
		}else 
		{
			System.out.println("Test Failed!, Scenario - both Wrong creds, Error Message:"+actualErrormsg);
		}
	}
	
	
	//Testing with valid Email and invalid password
	@Test(priority = 2)
	public static void InvalidPassword() throws Throwable
 	{
		CommonFuns cnf = new CommonFuns();
 		cnf.logIn("deepikamohs1@gmail.com", "Deepika"); 
		
		//capturing screenshot
		SSreuseclass.SSReusablemethod(driver, "Invalid Password");
		
		//verify error message is displayed or not
		WebElement errorMsg = driver.findElement(By.xpath("//li[normalize-space()='The credentials provided are incorrect']"));
		String actualErrormsg = errorMsg.getText();
		String expectederrormsg = "The credentials provided are incorrect";
		
		if(actualErrormsg.equalsIgnoreCase(expectederrormsg))
		{
			System.out.println("Test Passed!, Scenario - both Wrong creds, Error Message:"+actualErrormsg);
		}else 
		{
			System.out.println("Test Failed!, Scenario - both Wrong creds, Error Message:"+actualErrormsg);
		}
	}
	
	
	//Testing with invalid Email and valid password
	@Test(priority = 1)
	public static void InvalidUsername() throws Throwable
 	{
		CommonFuns cnf = new CommonFuns();
 		cnf.logIn("deepika", "DKG@123"); 
		
		//capturing screenshot
		SSreuseclass.SSReusablemethod(driver, "Invalid Password");
		
		//verify error message is displayed or not
		WebElement errorMsg = driver.findElement(By.xpath("//span[@for='Email']"));
		String actualErrormsg = errorMsg.getText();
		String expectederrormsg = "Please enter a valid email address.";
		
		if(actualErrormsg.equalsIgnoreCase(expectederrormsg))
		{
			System.out.println("Test Passed!, Scenario - both Wrong creds, Error Message:"+actualErrormsg);
		}else 
		{
			System.out.println("Test Failed!, Scenario - both Wrong creds, Error Message:"+actualErrormsg);
		}
	}

		//Testing with Empty Username 
		@Test(priority = 3)
		public static void EmptyUsername() throws Throwable
	 	{
			CommonFuns cnf = new CommonFuns();
	 		cnf.logIn("deepika", "DKG@123"); 
			
			//capturing screenshot
			SSreuseclass.SSReusablemethod(driver, "Invalid Password");
			
			//verify error message is displayed or not
			WebElement errorMsg = driver.findElement(By.xpath("//span[@for='Email']"));
			String actualErrormsg = errorMsg.getText();
			String expectederrormsg = "Please enter a valid email address.";
			
			if(actualErrormsg.equalsIgnoreCase(expectederrormsg))
			{
				System.out.println("Test Passed!, Scenario - both Wrong creds, Error Message:"+actualErrormsg);
			}else 
			{
				System.out.println("Test Failed!, Scenario - both Wrong creds, Error Message:"+actualErrormsg);
			}
		}
}
