import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropdownElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //window will open in mimimise mode
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		driver.manage().window().maximize();    //maximise the window
		driver.get("http://demowebshop.tricentis.com/");
		
		//driver.findElement(By.xpath("//input[@name=]"))
		
		
		driver.findElement(By.xpath("//a[@href='/books']")).click();
		WebElement dropdown = driver.findElement(By.name("products-orderby"));
		Select s = new Select(dropdown);
		//s.selectByIndex(0);
		//s.selectByVisibleText("Created on");
		//s.selectByValue("");
		
		
		//count items
		List <WebElement> options=s.getOptions();
		System.out.println("Total items are: " +options.size());
		
		//print options in dropdown
		
		for (WebElement e : options) {
			System.out.println(e.getText());
		}

		
		
	}

}
