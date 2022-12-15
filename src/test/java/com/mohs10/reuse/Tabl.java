package com.mohs10.reuse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mohs10.ActionDriver.Action;
import com.mohs10.ActionDriver.XLUtils;
import com.mohs10.base.StartBrowser;

	public class Tabl extends StartBrowser{
		
		public Action aDriver;
		public WebDriver driver;
		public XLUtils xlUtils;
		
		public Tabl()
		{
			aDriver = new Action();
			driver = StartBrowser.driver;
		}
		
			
		public void failed() throws Exception {
//declaring allary variables
				List <String> failText = new ArrayList<String>();
				List <String> failException = new ArrayList<String>();
//opening file
				StartBrowser.childTest = StartBrowser.parentTest.createNode("Opening chrome for scraping");
				aDriver.navigateToApplication("file:///C:/Users/91703/eclipse-workspace/pAInITe-master/test-output/Default%20suite/Default%20test.html");
				//aDriver.navigateToApplication("file:///C:/Users/91703/Downloads/Sample%20Test%20Case1.html");

//Identifying box 2 rows
				List<WebElement> rows = driver.findElements(By.xpath("/html/body/p//table[@class=\"invocation-failed\"]/tbody/tr"));
							
				for(int i=2;i<rows.size();i++)
				{
//finding specific columns
						List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
						{
//finding first cell of first column
						List<WebElement> cols1 = cols.get(0).findElements(By.tagName("b"));
//finding first element of 1*1
						String title = cols1.get(0).getText();
						failText. add(title) ;
						}
//finding third column						
						String time=cols.get(1).getText();
						failException. add(time) ;
						
				}
						System.out.println("**** Failed Test cases ****" + failText);
						System.out.println("**** Failed testcases exception ****" + failException);
			}
		
public void passed() throws Exception {
			//declaring allary variables
							List <String> passText = new ArrayList<String>();
							List <String> passTime = new ArrayList<String>();
			//opening file
							StartBrowser.childTest = StartBrowser.parentTest.createNode("Opening chrome for scraping");
							aDriver.navigateToApplication("file:///C:/Users/91703/eclipse-workspace/pAInITe-master/test-output/Default%20suite/Default%20test.html");
							//aDriver.navigateToApplication("file:///C:/Users/91703/Downloads/Sample%20Test%20Case1.html");

			//Identifying box 2 rows
							List<WebElement> rows = driver.findElements(By.xpath("/html/body/p//table[@class=\"invocation-passed\"]/tbody/tr"));
										
							for(int i=2;i<rows.size();i++)
							{
			//finding specific columns
									List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
									{
			//finding first cell of first column
									List<WebElement> cols1 = cols.get(0).findElements(By.tagName("b"));
			//finding first element of 1*1
									String title = cols1.get(0).getText();
									passText. add(title) ;
									}
			//finding third column						
									String time=cols.get(2).getText();
									passTime. add(time) ;
							}
									System.out.println("**** Passed Test cases ****" + passText);
									System.out.println("**** Execution time of passed test cases ****" + passTime);
						}

public String status() throws Exception {
	StartBrowser.childTest = StartBrowser.parentTest.createNode("Opening chrome for scraping");
	aDriver.navigateToApplication("file:///C:/Users/91703/eclipse-workspace/pAInITe-master/test-output/Default%20suite/Default%20test.html");
	String status = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[2]")).getText();
	return status;
	
}
		
public void skipped() throws Exception {
	//declaring allary variables
					List <String> skippedText = new ArrayList<String>();
					List <String> skippedTime = new ArrayList<String>();
	//opening file
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Opening chrome for scraping");
					aDriver.navigateToApplication("file:///C:/Users/91703/eclipse-workspace/pAInITe-master/test-output/Default%20suite/Default%20test.html");
					//aDriver.navigateToApplication("file:///C:/Users/91703/Downloads/Sample%20Test%20Case1.html");

	//Identifying box 2 rows
					List<WebElement> rows = driver.findElements(By.xpath("/html/body/p//table[@class=\"invocation-skipped\"]/tbody/tr"));
								
					for(int i=2;i<rows.size();i++)
					{
	//finding specific columns
							List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
							{
	//finding first cell of first column
							List<WebElement> cols1 = cols.get(0).findElements(By.tagName("b"));
	//finding first element of 1*1
							String title = cols1.get(0).getText();
							skippedText. add(title) ;
							}
	//finding third column						
							String time=cols.get(1).getText();
							skippedTime. add(time) ;
					}
							System.out.println("**** Skipped testcases ****" + skippedText);
							System.out.println("**** Skipped testcases exception ****" + skippedTime);
				}

		}
											
				
												
		 	
	

