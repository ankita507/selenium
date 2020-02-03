import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElemementPathCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //window will open in mimimise mode
		driver.manage().window().maximize();    //maximise the window
		driver.get("http://demoaut.com");
		
		
		
		
		//COMPLETERXPATH
	//	driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("remi");
	//	driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")).sendKeys("remi");
	//	driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();

	   //partial 1
		
		
		
		//driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("remi");
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("remi");
		//driver.findElement(By.xpath("//input[@name='login']")).click();
      
		
		
	   //partial 2
		
		
		driver.findElement(By.xpath("//td//input[@name='userName']")).sendKeys("remi");
		driver.findElement(By.xpath("//td//input[@name='password']")).sendKeys("remi");
		driver.findElement(By.xpath("//td//input[@name='login']")).click();
	
	
	
	}

}
