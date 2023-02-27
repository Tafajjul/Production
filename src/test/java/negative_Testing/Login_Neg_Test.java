package negative_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.mohs10.ActionDriver.SSreuseclass;
import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.Negative_Test_commfuns;

public class Login_Neg_Test extends StartBrowser
{
	@Test(priority = 0)
	public static void bothWrongCreds() throws Throwable
 	{
		//Testing with both Wrong credentials
		Negative_Test_commfuns nfc = new Negative_Test_commfuns();
		
		nfc.logIn("deep", "Deep");
		SSreuseclass.SSReusablemethod(driver, "login negative testing");
		//verify error message is displayed
		WebElement errorMsg = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p"));
		String actualErrormsg = errorMsg.getText();
		String expectederrormsg = "An internal error has occurred and has been logged.";
		
		if(actualErrormsg.equalsIgnoreCase(expectederrormsg))
		{
			System.out.println("Test Passed!, Scenario - both Wrong creds, Error Message Displayed properly!");
		}else 
		{
			System.out.println("Test Failed!, Scenario - both Wrong creds, Error message not displayed!");
		}
	}
	
	@Test(priority = 1)
	public static void invalidPassword() throws Throwable
 	{
		//Testing with invalid password
		Negative_Test_commfuns nfc = new Negative_Test_commfuns();
		nfc.logIn("deepam", "De@123");
		
		//verify error message is displayed
		WebElement errorMsg = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p"));
		String actualErrormsg = errorMsg.getText();
		String expectederrormsg = "An internal error has occurred and has been logged.";
		SSreuseclass.SSReusablemethod(driver, "login negative testing2");
		if(actualErrormsg.equalsIgnoreCase(expectederrormsg))
		{
			System.out.println("Test Passed!, Scenario - Wrong Password - Error message displayed!");
		}else 
		{
			System.out.println("Test Failed!, Scenario - Wrong Password - Error message not displayed!");
		}
	}
	
	@Test(priority = 2)
	public static void invalidUsername() throws Throwable
 	{
		//Testing with invalid Username
		Negative_Test_commfuns nfc = new Negative_Test_commfuns();
		nfc.logIn("deepam", "De@123");
		
		//verify error message is displayed
		WebElement errorMsg = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p"));
		String actualErrormsg = errorMsg.getText();
		String expectederrormsg = "An internal error has occurred and has been logged.";
		SSreuseclass.SSReusablemethod(driver, "login negative testing1");
		if(actualErrormsg.equalsIgnoreCase(expectederrormsg))
		{
			System.out.println("Test Passed!, Scenario - incorrect Username - Error message displayed!");
		}else 
		{
			System.out.println("Test Failed!, Scenario - incorrect Username - Error message not displayed!");
		}
	}
	
	@Test(priority = 3)
	public static void bothemptycreds() throws Throwable
 	{
		//Testing with both textbox empty
		Negative_Test_commfuns nfc = new Negative_Test_commfuns();
		nfc.logIn("", "");
		
		//verify error message is displayed
		WebElement errorMsg = driver.findElement(By.xpath("//p[@class='error']"));
		String actualErrormsg = errorMsg.getText();
		String expectederrormsg = "Please enter a username and password.";
		SSreuseclass.SSReusablemethod(driver, "login negative testing3");
		if(actualErrormsg.equalsIgnoreCase(expectederrormsg))
		{
			System.out.println("Test Passed!, Scenario - empty username and passwords - Error message displayed!");
		}else 
		{
			System.out.println("Test Failed!, Scenario - empty username and passwords - Error message not displayed!");
		}
	}
	
	@Test(priority = 4)
	public static void emptyUsername() throws Throwable
 	{
		//Testing with emptyUsername
		Negative_Test_commfuns nfc = new Negative_Test_commfuns();
		nfc.logIn("", "Deepam@123");
		
		//verify error message is displayed
		WebElement errorMsg = driver.findElement(By.xpath("//p[@class='error']"));
		String actualErrormsg = errorMsg.getText();
		String expectederrormsg = "Please enter a username and password.";
		SSreuseclass.SSReusablemethod(driver, "login negative testing4");
		if(actualErrormsg.equalsIgnoreCase(expectederrormsg))
		{
			System.out.println("Test Passed!, Scenario - empty Username - Error message displayed!");
		}else 
		{
			System.out.println("Test Failed!, Scenario - empty Username - Error message not displayed!");
		}
	}
	
	@Test(priority = 5)
	public static void emptyPassword() throws Throwable
 	{
		//Testing with emptyPassword
		Negative_Test_commfuns nfc = new Negative_Test_commfuns();
		nfc.logIn("deepam", "");
		
		//verify error message is displayed
		WebElement errorMsg = driver.findElement(By.xpath("//p[@class='error']"));
		String actualErrormsg = errorMsg.getText();
		String expectederrormsg = "Please enter a username and password.";
		SSreuseclass.SSReusablemethod(driver, "login negative testing5");
		if(actualErrormsg.equalsIgnoreCase(expectederrormsg))
		{
			System.out.println("Test Passed!, Scenario - emptyPassword - Error message displayed!");
		}else 
		{
			System.out.println("Test Failed!, Scenario - emptyPassword - Error message not displayed!");
		}
	}	
	
	@Test(priority = 6)
	public static void NumericUsername() throws Throwable
 	{
		//Testing with NumericUsername
		Negative_Test_commfuns nfc = new Negative_Test_commfuns();
		nfc.logIn("123456", "Deepam@123");
		
		//verify error message is displayed
		WebElement errorMsg = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p"));
		String actualErrormsg = errorMsg.getText();
		String expectederrormsg = "An internal error has occurred and has been logged.";
		SSreuseclass.SSReusablemethod(driver, "login negative testing6");
		if(actualErrormsg.equalsIgnoreCase(expectederrormsg))
		{
			System.out.println("Test Passed!, Scenario - NumericUsername - Error message displayed!");
		}else 
		{
			System.out.println("Test Failed!, Scenario - NumericUsername - Error message not displayed!");
		}
	}	
	
	@Test(priority = 7)
	public static void sizeofUsername() throws Throwable
 	{
		//Testing by entering long alphanumeric username
		Negative_Test_commfuns nfc = new Negative_Test_commfuns();
		nfc.logIn("abc456", "Deepam@123");
		
		//verify error message is displayed
		WebElement errorMsg = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p"));
		String actualErrormsg = errorMsg.getText();
		String expectederrormsg = "An internal error has occurred and has been logged.";
		SSreuseclass.SSReusablemethod(driver, "login negative testing7");
		if(actualErrormsg.equalsIgnoreCase(expectederrormsg))
		{
			System.out.println("Test Passed!, Scenario - sizeofUsername - Error message displayed!");
		}else 
		{
			System.out.println("Test Failed!, Scenario - sizeofUsername - Error message not displayed!");
		}
	}	
}
