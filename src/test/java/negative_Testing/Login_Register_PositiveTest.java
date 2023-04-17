package negative_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Positive Testing on Login Page and Register Page
 * **/

import org.testng.annotations.Test;

import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.Negative_Test_commfuns;

public class Login_Register_PositiveTest extends StartBrowser
{
	@Test(priority = 1)
	public static void LoginVerification() throws Throwable
 	{
		//Testing with correct creds
		Negative_Test_commfuns nfc = new Negative_Test_commfuns();
		nfc.logIn("deepamkgh11", "Deepam123");
		
		//verify login page is displayed with url
		String actualurl = driver.getCurrentUrl();
		String expectedurl = "https://parabank.parasoft.com/parabank/overview.htm";
		
		if(actualurl.equalsIgnoreCase(expectedurl))
		{
			System.out.println("Test Passed!, login success!");
		}else 
		{
			System.out.println("Test Failed!, login failed!");
		}
		
		nfc.logout();
	}
	
	@Test(priority = 0)
	public static void RegisterVerification() throws Throwable
 	{
		//Testing with correct creds
		Negative_Test_commfuns nfc = new Negative_Test_commfuns();
		nfc.Register("Deepam", "Deep", "secunderabad", "hyderabad", "TS", "500016", "9123456780", "123456", "deepamkgh11", "Deepam123", "Deepam123"); 
		
		//verifying Register page 
		WebElement Welcomemsg = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p")); 
		String actmsg = Welcomemsg.getText();
		String expmsg = "Your account was created successfully. You are now logged in.";
		
		if(actmsg.equalsIgnoreCase(expmsg))
		{
			System.out.println("Test Passed!"   + actmsg);
		}else 
		{
			System.out.println("Test Failed!, Register failed!");
		}
		nfc.logout();
	}
}