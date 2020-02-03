import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alerthandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //window will open in mimimise mode
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();    //maximise the window
		driver.get("http://10.232.237.143:443/TestMeApp/");
		
		driver.findElement(By.xpath("//[@value='FIND DETAILS']")).click();
	//	driver.findElement(By.name("submit")).click();
		Alert al=driver.switchTo().alert();
	    al.accept();
	   // driver.switchTo().defaultContent();
	}
}
