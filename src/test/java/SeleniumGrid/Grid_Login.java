package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid_Login 
{
		public static RemoteWebDriver driver;
		public static DesiredCapabilities dc;
		
		@Parameters({"browser", "huburl"})
		@BeforeClass
		public void launchApp(String browser, String url) throws MalformedURLException
		{
		
			dc = new DesiredCapabilities();
			switch (browser.toLowerCase()) 
			{
			case "chrome":
				dc.setBrowserName("chrome");
				break;
			case "firefox":
				dc.setBrowserName("firefox");
				break;
			case "Edge":
				dc.setBrowserName("Edge");
				break;
			default:
				System.out.println("browser not found!");
				break;
			}
			
			URL huburl = new URL(url);		
			driver = new RemoteWebDriver(huburl, dc);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
		
		
		@Test
		public void checkAdminLogin() throws MalformedURLException
		{
			
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();	
			
		}
		
//		@AfterClass
//	    public void afterclass() 
//	    {
//			driver.close();
//	    }
//		
//		@BeforeMethod
//	    public void beforeMethod()
//	    {
//	        driver.manage().window().maximize();
//	        driver.manage().deleteAllCookies();
//	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	    }
	}