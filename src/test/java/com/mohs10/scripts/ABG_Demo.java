package com.mohs10.scripts;

import org.testng.annotations.Test;

import com.mohs10.ActionDriver.SSreuseclass;
import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.CommonFuns;

public class ABG_Demo extends StartBrowser
{
	
	//Registration of new user 
		@Test(priority = 0)
		public void RegisterPageTestCase() throws Exception 
		{
			CommonFuns hm = new CommonFuns();
			hm.Register("GKD", "GKDMohs10", "ABGDemo123@gmail.com", "sushi@444", "sushi@444");
			SSreuseclass.SSReusablemethod(driver, "RegisterPage");
				 
				  Thread.sleep(5000);
		}
		
		//Testing by login and ordering a product 
		@Test(priority = 1)
		public void OrderProduct() throws Throwable 
		{
			CommonFuns hm1 = new CommonFuns();
			Thread.sleep(5000);
			hm1.OrderProd("deepikamohs1@gmail.com", "DKG@123");
			SSreuseclass.SSReusablemethod(driver, "End to End Testing");
		
		}             
		
		//Testing with invalid inputs 
		@Test(priority = 2)
		public void InvalidUsername() throws Exception 
		{
			SSreuseclass.SSReusablemethod(driver, "Negative Testing");
			CommonFuns hm1 = new CommonFuns();
				  hm1.invalidLogIn("wrongcreds@gmail.com", "DKG@123");
				  Thread.sleep(5000);
		
		}       
		
		//Testing with invalid inputs 
				@Test(priority = 3)
				public void BothInvalidCreds() throws Exception 
				{
					SSreuseclass.SSReusablemethod(driver, "Negative Testing");
					CommonFuns hm1 = new CommonFuns();
						  hm1.invalidLogIn("wrongcreds@gmail.com", "wrongcreds");
						  Thread.sleep(5000);
				
				} 
				
		//Intentionally generating error to show failed test cases 
				@Test(priority = 4)
				public void FailedTestCase() throws Exception 
				{
					CommonFuns hm1 = new CommonFuns();
					SSreuseclass.SSReusablemethod(driver, "Showing Failed Test Case");
						 hm1.Aboutus();
						  Thread.sleep(5000);
				
				} 
				
}
