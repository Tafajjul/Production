package negative_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.mohs10.ActionDriver.SSreuseclass;
import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.Negative_Test_commfuns;

public class Register_Neg_Test extends StartBrowser
{
	@Test(priority = 0)
	public static void Reg_Skipping_mandatory_Fields() throws Throwable 
	{
		//Testing by skipping the mandatory fields
				Negative_Test_commfuns nfc = new Negative_Test_commfuns();
				nfc.Register("", "", "", "", "", "", "9098374349", "", "", "", "");
				
				//verify error message for first name
				WebElement errorMsg = driver.findElement(By.id("customer.firstName.errors"));
				String actualErrormsg = errorMsg.getText();
				String expectederrormsg = "First name is required.";
				SSreuseclass.SSReusablemethod(driver, "firstname");
				if(actualErrormsg.equalsIgnoreCase(expectederrormsg))
				{
					System.out.println("Test Passed!, Scenario - skipping the mandatory fields,  "  +actualErrormsg);
				}else 
				{
					System.out.println("Test Failed!, Scenario - skipping the mandatory fields,  "  + actualErrormsg);
				}
				
				//verify error message for last name
				WebElement errorMsg1 = driver.findElement(By.id("customer.lastName.errors"));
				String actualErrormsg1 = errorMsg1.getText();
				String expectederrormsg1 = "Last name is required.";
				SSreuseclass.SSReusablemethod(driver, "last name");
				if(actualErrormsg1.equalsIgnoreCase(expectederrormsg1))
				{
					System.out.println("Test Passed!, Scenario - skipping the mandatory fields,  "  +actualErrormsg1);
				}else 
				{
					System.out.println("Test Failed!, Scenario - skipping the mandatory fields,  "  + actualErrormsg1);
				}
				
				//verify error message for Address
				WebElement errorMsg2 = driver.findElement(By.id("customer.address.street.errors"));
				String actualErrormsg2 = errorMsg2.getText();
				String expectederrormsg2 = "Address is required.";
				SSreuseclass.SSReusablemethod(driver, "Address");
				if(actualErrormsg2.equalsIgnoreCase(expectederrormsg2))
				{
					System.out.println("Test Passed!, Scenario - skipping the mandatory fields,  "  +actualErrormsg2);
				}else 
				{
					System.out.println("Test Failed!, Scenario - skipping the mandatory fields,  "  + actualErrormsg2);
				}
				
				//verify error message for city
				WebElement errorMsg3 = driver.findElement(By.id("customer.address.city.errors"));
				String actualErrormsg3 = errorMsg3.getText();
				String expectederrormsg3 = "City is required.";
				SSreuseclass.SSReusablemethod(driver, "city");
				if(actualErrormsg3.equalsIgnoreCase(expectederrormsg3))
				{
					System.out.println("Test Passed!, Scenario - skipping the mandatory fields,  "  +actualErrormsg3);
				}else 
				{
					System.out.println("Test Failed!, Scenario - skipping the mandatory fields,  "  + actualErrormsg3);
				}
				
				//verify error message for state
				WebElement errorMsg4 = driver.findElement(By.id("customer.address.state.errors"));
				String actualErrormsg4 = errorMsg4.getText();
				String expectederrormsg4 = "State is required.";
				SSreuseclass.SSReusablemethod(driver, "state");
				if(actualErrormsg4.equalsIgnoreCase(expectederrormsg4))
				{
					System.out.println("Test Passed!, Scenario - skipping the mandatory fields,  "  +actualErrormsg4);
				}else 
				{
					System.out.println("Test Failed!, Scenario - skipping the mandatory fields,  "  + actualErrormsg4);
				}
				
				
				//verify error message for zip code
				WebElement errorMsg5 = driver.findElement(By.id("customer.address.zipCode.errors"));
				String actualErrormsg5 = errorMsg5.getText();
				String expectederrormsg5 = "Zip Code is required.";
				SSreuseclass.SSReusablemethod(driver, "zipcode");
				if(actualErrormsg5.equalsIgnoreCase(expectederrormsg5))
				{
					System.out.println("Test Passed!, Scenario - skipping the mandatory fields,  "  +actualErrormsg5);
				}else 
				{
					System.out.println("Test Failed!, Scenario - skipping the mandatory fields,  "  + actualErrormsg5);
				}
				
				
				//verify error message for social security number
				WebElement errorMsg6 = driver.findElement(By.id("customer.ssn.errors"));
				String actualErrormsg6 = errorMsg6.getText();
				String expectederrormsg6 = "Social Security Number is required.";
				SSreuseclass.SSReusablemethod(driver, "ssn");
				if(actualErrormsg6.equalsIgnoreCase(expectederrormsg6))
				{
					System.out.println("Test Passed!, Scenario - skipping the mandatory fields,  "  +actualErrormsg6);
				}else 
				{
					System.out.println("Test Failed!, Scenario - skipping the mandatory fields,  "  + actualErrormsg1);
				}
				
				
				
				//verify error message for username
				WebElement errorMsg7 = driver.findElement(By.id("customer.username.errors"));
				String actualErrormsg7 = errorMsg7.getText();
				String expectederrormsg7 = "Username is required.";
				SSreuseclass.SSReusablemethod(driver, "User name");
				if(actualErrormsg7.equalsIgnoreCase(expectederrormsg7))
				{
					System.out.println("Test Passed!, Scenario - skipping the mandatory fields,  "  +actualErrormsg7);
				}else 
				{
					System.out.println("Test Failed!, Scenario - skipping the mandatory fields,  "  + actualErrormsg7);
				}
				
				
				
				//verify error message for password
				WebElement errorMsg8 = driver.findElement(By.id("customer.password.errors"));
				String actualErrormsg8 = errorMsg8.getText();
				String expectederrormsg8 = "Password is required.";
				SSreuseclass.SSReusablemethod(driver, "password");
				
				if(actualErrormsg8.equalsIgnoreCase(expectederrormsg8))
				{
					System.out.println("Test Passed!, Scenario - skipping the mandatory fields,  "  +actualErrormsg8);
				}else 
				{
					System.out.println("Test Failed!, Scenario - skipping the mandatory fields,  "  + actualErrormsg8);
				}
				
				
				//verify error message for confirm password
				WebElement errorMsg9 = driver.findElement(By.id("repeatedPassword.errors"));
				String actualErrormsg9 = errorMsg9.getText();
				String expectederrormsg9 = "Password confirmation is required.";
				SSreuseclass.SSReusablemethod(driver, "confirm password");
				
				if(actualErrormsg9.equalsIgnoreCase(expectederrormsg9))
				{
					System.out.println("Test Passed!, Scenario - skipping the mandatory fields,  "  +actualErrormsg9);
				}else 
				{
					System.out.println("Test Failed!, Scenario - skipping the mandatory fields,  "  + actualErrormsg9);
				}
	}
	
	@Test(priority = 1)
	public static void Reg_All_InvalidCreds() throws Throwable 
	{
		//Testing by entering all invalid data
				Negative_Test_commfuns nfc = new Negative_Test_commfuns();
				nfc.Register("134234313434", "134234313434", "12345", "12312312", "123213", "12312312", "9098374349", "12312", "Deepma500", "Deepam@123", "Deepam@123");
				
				//verify by entering all invalid data
				WebElement check = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p"));
				String actualmsg = check.getText();
				String expectedmsg = "Your account was created successfully. You are now logged in.";
				SSreuseclass.SSReusablemethod(driver, "invalid creds");
				
				if(actualmsg.equalsIgnoreCase(expectedmsg))
				{
					System.out.println("Test Passed!, Scenario - Enterning all invalid data,  "  +actualmsg);
				}else 
				{
					System.out.println("Test Failed!, Scenario - Enterning all invalid data,  "  + actualmsg);
				}
				
				nfc.logout();
	}
	
	@Test(priority = 2)
	public static void Reg_Existing_Username() throws Throwable 
	{
		//Testing by entering registered user details
				Negative_Test_commfuns nfc = new Negative_Test_commfuns();
				nfc.Register("134234313434", "134234313434", "12345", "12312312", "123213", "12312312", "9098374349", "12312", "Deepma500", "Deepam@123", "Deepam@123");
				
				//verify by entering all invalid data
				WebElement check = driver.findElement(By.id("customer.username.errors"));
				String actualmsg = check.getText();
				String expectedmsg = "This username already exists.";
				SSreuseclass.SSReusablemethod(driver, "already exist");
				
				if(actualmsg.equalsIgnoreCase(expectedmsg))
				{
					System.out.println("Test Passed!, Scenario - Entering existing user details,  "  +actualmsg);
				}else 
				{
					System.out.println("Test Failed!, Scenario - Entering existing user details,  "  + actualmsg);
				}
				
	}
}











