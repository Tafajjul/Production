package negative_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.Negative_Test_commfuns;

public class Neg_Forget_Password extends StartBrowser
{
	@Test(priority = 0)
	public static void fp_Invalid_data() throws Throwable 
	{
		//Testing by entering invalid data
				Negative_Test_commfuns nfc = new Negative_Test_commfuns();
				nfc.ForgetPassword("12345", "12345", "1234drd", "csdasdca", "cdcdcd", "cccccc", "cccccc");
				
				//verify error Msg display or not
				WebElement errorMsg = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p"));
				String actualErrormsg = errorMsg.getText();
				String expectederrormsg = "The customer information provided could not be found.";
				
				if(actualErrormsg.equalsIgnoreCase(expectederrormsg))
				{
					System.out.println("Test Passed!, Scenario - Entering Invalid details,  "  +actualErrormsg);
				}else 
				{
					System.out.println("Test Failed!, Scenario - Entering Invalid details,  "  + actualErrormsg);
				}
	}
	
	@Test(priority = 1)
	public static void fp_Skipping_mandatory_Fields() throws Throwable 
	{
		//Testing by skipping the mandatory fields
				Negative_Test_commfuns nfc = new Negative_Test_commfuns();
				nfc.ForgetPassword("","","","","","","");
				
				//verify error message for first name
				WebElement errorMsg = driver.findElement(By.id("firstName.errors"));
				String actualErrormsg = errorMsg.getText();
				String expectederrormsg = "First name is required.";
				
				if(actualErrormsg.equalsIgnoreCase(expectederrormsg))
				{
					System.out.println("Test Passed!, Scenario - skipping the mandatory fields,  "  +actualErrormsg);
				}else 
				{
					System.out.println("Test Failed!, Scenario - skipping the mandatory fields,  "  + actualErrormsg);
				}
				
				//verify error message for last name
				WebElement errorMsg1 = driver.findElement(By.id("lastName.errors"));
				String actualErrormsg1 = errorMsg1.getText();
				String expectederrormsg1 = "Last name is required.";
				
				if(actualErrormsg1.equalsIgnoreCase(expectederrormsg1))
				{
					System.out.println("Test Passed!, Scenario - skipping the mandatory fields,  "  +actualErrormsg1);
				}else 
				{
					System.out.println("Test Failed!, Scenario - skipping the mandatory fields,  "  + actualErrormsg1);
				}
				
				//verify error message for Address
				WebElement errorMsg2 = driver.findElement(By.id("address.street.errors"));
				String actualErrormsg2 = errorMsg2.getText();
				String expectederrormsg2 = "Address is required.";
				
				if(actualErrormsg2.equalsIgnoreCase(expectederrormsg2))
				{
					System.out.println("Test Passed!, Scenario - skipping the mandatory fields,  "  +actualErrormsg2);
				}else 
				{
					System.out.println("Test Failed!, Scenario - skipping the mandatory fields,  "  + actualErrormsg2);
				}
				
				//verify error message for city
				WebElement errorMsg3 = driver.findElement(By.id("address.city.errors"));
				String actualErrormsg3 = errorMsg3.getText();
				String expectederrormsg3 = "City is required.";
				
				if(actualErrormsg3.equalsIgnoreCase(expectederrormsg3))
				{
					System.out.println("Test Passed!, Scenario - skipping the mandatory fields,  "  +actualErrormsg3);
				}else 
				{
					System.out.println("Test Failed!, Scenario - skipping the mandatory fields,  "  + actualErrormsg3);
				}
				
				//verify error message for state
				WebElement errorMsg4 = driver.findElement(By.id("address.state.errors"));
				String actualErrormsg4 = errorMsg4.getText();
				String expectederrormsg4 = "State is required.";
				
				if(actualErrormsg4.equalsIgnoreCase(expectederrormsg4))
				{
					System.out.println("Test Passed!, Scenario - skipping the mandatory fields,  "  +actualErrormsg4);
				}else 
				{
					System.out.println("Test Failed!, Scenario - skipping the mandatory fields,  "  + actualErrormsg4);
				}
				
				
				//verify error message for zip code
				WebElement errorMsg5 = driver.findElement(By.id("address.zipCode.errors"));
				String actualErrormsg5 = errorMsg5.getText();
				String expectederrormsg5 = "Zip Code is required.";
				
				if(actualErrormsg5.equalsIgnoreCase(expectederrormsg5))
				{
					System.out.println("Test Passed!, Scenario - skipping the mandatory fields,  "  +actualErrormsg5);
				}else 
				{
					System.out.println("Test Failed!, Scenario - skipping the mandatory fields,  "  + actualErrormsg5);
				}
				
				
				//verify error message for social security number
				WebElement errorMsg6 = driver.findElement(By.id("ssn.errors"));
				String actualErrormsg6 = errorMsg6.getText();
				String expectederrormsg6 = "Social Security Number is required.";
				
				if(actualErrormsg6.equalsIgnoreCase(expectederrormsg6))
				{
					System.out.println("Test Passed!, Scenario - skipping the mandatory fields,  "  +actualErrormsg6);
				}else 
				{
					System.out.println("Test Failed!, Scenario - skipping the mandatory fields,  "  + actualErrormsg1);
				}
				
	}
	
}
