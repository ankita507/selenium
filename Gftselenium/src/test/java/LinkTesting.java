
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //window will open in mimimise mode
		driver.manage().window().maximize();    //maximise the window
		driver.get("http://demoaut.com");
		 
		//to count no of links
		List<WebElement> linknames=driver.findElements(By.tagName("a"));
		System.out.println("The count of links is:"+linknames.size());
		
		
		
		//to get link names
		for (int i = 0; i < linknames.size(); i++) 
		{
			System.out.println(linknames.get(i).getText());
			//System.out.println(linknames.get(i).isDisplayed());
		}
		
		
		//to click a link
		
		driver.findElement(By.linkText("Flights")).click();
		String currentURL=driver.getCurrentUrl();
	    System.out.println("Current URL ->"+currentURL);
		
		
		

	}

}
