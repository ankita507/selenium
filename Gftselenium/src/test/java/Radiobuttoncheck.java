import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Radiobuttoncheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //window will open in mimimise mode
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		driver.manage().window().maximize();    //maximise the window
		driver.get("http://demowebshop.tricentis.com/");
		
		
		List<WebElement> allradiobutton = driver.findElements(By.name("pollanswers-1"));
		System.out.println("Total radio button are -> "+allradiobutton.size());
		allradiobutton.get(1).click();
		
		
		System.out.println(allradiobutton.get(0).getAttribute("selected"));
		System.out.println(allradiobutton.get(1).getAttribute("selected"));
		System.out.println(allradiobutton.get(2).getAttribute("selected"));
		System.out.println(allradiobutton.get(3).getAttribute("selected"));
		
		
		
		
		

	}

}
