package com.mohs10.scripts;

import org.testng.annotations.Test;

import com.mohs10.ActionDriver.Action;
import com.mohs10.ActionDriver.SSreuseclass;
import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.CommonFuns;

	public class HomeTest extends StartBrowser
	{
		
//	//Verify Project Title
//	@Test(priority = 6)
//	public void Verifyingapplicationtitle() throws Exception 
//	{
//		CommonFuns ver = new CommonFuns();
//		ver.VerifyingWebsiteTitle();
//		//capturing the screen shot
//		SSreuseclass.SSReusablemethod(driver, "VerifyingTilte");
//		Thread.sleep(2000);
//	}
//	
	//Clicking on Categories links 
	@Test(priority = 3)
	public void CategoriesTest() throws Exception 
	{
		SSreuseclass.SSReusablemethod(driver, "CategoryTest");
		CommonFuns cat = new CommonFuns();
	    cat.Categories();
		Thread.sleep(5000);
	}
//	
//	//Clicking on news link 
//	@Test(priority = 4)
//	public void NewsbtnTestCase() throws Exception 
//	{
//		CommonFuns News = new CommonFuns();
//	    News.Pagedown();
//	    Thread.sleep(2000);
//	    News.Newsbtn();
//	   // SSreuseclass.SSReusablemethod(driver, "NewsbtnTestCase");
//		Thread.sleep(5000);
//	}
//	
//	//blog Link 
//	@Test(priority = 3)
//	public void BlogbtnTestCase() throws Exception 
//	{
//		CommonFuns blog = new CommonFuns();
//	    blog.Pagedown();
//	    Thread.sleep(2000);
//	    blog.Blogbtn();
//	    //SSreuseclass.SSReusablemethod(driver, "BlogbtnTestCase");
//		Thread.sleep(5000);
//	}
		
	//Registration of new user 
//	@Test(priority = 2)
//	public void RegisterPageTestCase() throws Exception 
//	{
//		CommonFuns hm = new CommonFuns();
//		 //SSreuseclass.SSReusablemethod(driver, "RegisterPage");
//			  hm.Register("GKD", "GKDMohs10", "abcdefgijk;km@gmail.com", "Twerfghjkest@444", "Twerfghjkest@444");
//			 
//			  Thread.sleep(5000);
//	}
	
	//Testing with invalid inputs 
	@Test(priority = 1)
	public void InvalidLogInTestCase() throws Exception 
	{
		//SSreuseclass.SSReusablemethod(driver, "InvalidLogIn");
		CommonFuns hm1 = new CommonFuns();
			  hm1.invalidLogIn("Invalidlogininputs@gmail.com", "Test@1114");
			  Thread.sleep(5000);
	
	}             
	
////	//Testing with Valid inputs 
		@Test(priority = 0)
		  public void LoginPageTestCase() throws Exception 
		{
			CommonFuns hm2 = new CommonFuns();
			  hm2.logIn("anishapatel44@gmail.com", "anishapatel123");
			  Thread.sleep(5000);
		}	
	}
