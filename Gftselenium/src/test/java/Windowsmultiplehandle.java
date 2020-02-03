import java.util.Iterator;
import java.util.Set;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowsmultiplehandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //window will open in mimimise mode
	
		Set<String> winIDs = driver.getWindowHandles();
		
		System.out.println("Total windows -> " +winIDs.size());
		
		//to extract windows ids and print
		
		Iterator<String> s = winIDs.iterator();
		System.out.println("Windows ID -> " +s.next());
		
		driver.get("https://www.naukri.com");
		System.out.println("...........");
		winIDs = driver.getWindowHandles();
		 System.out.println("Total window ->" +winIDs.size());
		 s= winIDs.iterator();
		 
		 
		 String mainwindow = s.next();
		 String firstwindow = s.next();
		 String secondwindow = s.next();
		 
		 System.out.println(mainwindow);
		 System.out.println(firstwindow);
		 System.out.println(secondwindow);
		 
		 
		 driver.switchTo().window(firstwindow);
		 driver.close();
		 
		 driver.switchTo().window(secondwindow);
		 driver.close();
		 
		 driver.switchTo().window(mainwindow);
		 driver.close();
		
		
		
		
	}

}
