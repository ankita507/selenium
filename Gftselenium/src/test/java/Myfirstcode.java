import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Myfirstcode {
     
	@AfterMethod
	public void login()
	{
		System.out.println("login......");
	}
	
	
   @Test
	public void regi()
	{
		System.out.println("regi......");
	}

   @Test
	public void regio()
	{
		System.out.println("sdhsafbsafksdj......");
	}
	
	
	
     @BeforeMethod
	public void internetcheck() {
		System.out.println("check internet connectivity......");
		
	}
}
