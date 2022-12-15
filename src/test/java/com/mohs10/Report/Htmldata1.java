package com.mohs10.Report;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Htmldata1 {
	
	public static void main(String[] args) {
		
		List <String> failText = new ArrayList<String>();
		List <String> failException = new ArrayList<String>();
		List <String> passText = new ArrayList<String>();
		List <String> passTime = new ArrayList<String>();
		List <String> skippedText = new ArrayList<String>();
		List <String> skippedTime = new ArrayList<String>();
		
		WebDriverManager.chromedriver().setup( ) ;
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/91703/eclipse-workspace/pAInITe-master/test-output/Default%20suite/Default%20test.html");

		String status = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[2]")).getText();
		
		List<WebElement> rows = driver.findElements(By.xpath("/html/body/p//table[@class=\"invocation-passed\"]/tbody/tr"));
						for(int i=2;i<rows.size();i++)
						{
								List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
								{
								List<WebElement> cols1 = cols.get(0).findElements(By.tagName("b"));
								String title = cols1.get(0).getText();
								passText. add(title) ;
								}
								String time=cols.get(2).getText();
								passTime. add(time) ;
						}
						
		List<WebElement> rowsS = driver.findElements(By.xpath("/html/body/p//table[@class=\"invocation-skipped\"]/tbody/tr"));
						for(int i=2;i<rowsS.size();i++)
						{
								List<WebElement> colsS = rowsS.get(i).findElements(By.tagName("td"));
								{
								List<WebElement> cols1S = colsS.get(0).findElements(By.tagName("b"));
								String title = cols1S.get(0).getText();
								skippedText. add(title) ;
								}	
								String time=colsS.get(2).getText();
								skippedTime. add(time) ;
						}
		List<WebElement> rowsF = driver.findElements(By.xpath("/html/body/p//table[@class=\"invocation-failed\"]/tbody/tr"));
						for(int i=2;i<rowsF.size();i++)
						{
								List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
								{
								List<WebElement> cols1 = cols.get(0).findElements(By.tagName("b"));
								String title = cols1.get(0).getText();
								failText. add(title) ;
								}
								String time=cols.get(2).getText();
								failException. add(time) ;
						}
						System.out.println(status);
						System.out.println(passText.size());
						System.out.println("**** Failed Test cases ****" + failText);
						System.out.println("**** Failed testcases exception ****" + failException);
						System.out.println("**** Skipped testcases ****" + skippedText);
						System.out.println("**** Skipped testcases exception ****" + skippedTime);
						System.out.println("**** Passed Test cases ****" + passText);
						System.out.println("**** Execution time of passed test cases ****" + passTime);
						
		driver.quit();
}
}




		
		
		
		
		
		