import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Mousepositionevent {
	
	

	@Test
	public void checkmouseposition() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //window will open in mimimise mode
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();    //maximise the window
		driver.get("http://demowebshop.tricentis.com/");
		
		WebElement element = driver.findElement(By.xpath("//a[@href = '/computers']"));
		WebElement sub = driver.findElement(By.xpath("//a[@href = '/notebooks']"));
		
		Actions a= new Actions(driver);

		a.moveToElement(element).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(sub));
		 a.moveToElement(sub).click().build().perform();
		 Thread.sleep(5000);
		 System.out.println("URL -> "+driver.getCurrentUrl());
		 driver.close();
		
	}

}
