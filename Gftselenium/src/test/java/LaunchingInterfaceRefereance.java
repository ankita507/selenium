import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class LaunchingInterfaceRefereance {
		@Test
		public void check()
		{
		      System.setProperty("webdriver.chrome.driver", "C:\\selenium_drivers\\chromedriver\\chromedriver.exe");
		      System.setProperty("webdriver.ie.driver", "C:\\selenium_drivers\\iedriver\\IEDriverServer.exe");
		      
		      
		      String browser="Chrome";
		      WebDriver driver=null;
		      if (browser.contentEquals("Chrome")) {
		    	  driver = new ChromeDriver();
		      }
		      else if  (browser.contentEquals("IE")) {
					driver = new InternetExplorerDriver();
				}
		      
			
		      driver.get("https://www.google.com");
		      driver.close();
		      
		      
		}
	

}
