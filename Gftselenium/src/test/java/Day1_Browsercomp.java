import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Day1_Browsercomp {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "C:\\selenium_drivers\\chromedriver\\chromedriver.exe");
      ChromeDriver c = new ChromeDriver();
      c.get("https://www.google.com");
      
      System.setProperty("webdriver.ie.driver", "C:\\selenium_drivers\\iedriver\\IEDriverServer.exe");
     InternetExplorerDriver i= new InternetExplorerDriver();
      i.get("https://www.google.com");
      
	}

}
