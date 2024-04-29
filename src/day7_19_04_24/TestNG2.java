package day7_19_04_24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG2
{
	WebDriver driver;
	@BeforeMethod
      public void openBrowser() {
		 driver=new ChromeDriver();
	      
	    
    	  System.out.println("browser is opened");
      }
	  @AfterMethod
      public void colseBrowser() {
    	  System.out.println("browser is closed");
    	 
    	driver.close();
		
      }
	  @Test
	  public void enterUrl()  {
		  System.out.println("enter url");
		;
		  driver.get("https://www.facebook.com/");
	  }
	  @Test
	  public void enterUrl2()  {
		  System.out.println("enter url");
		 
		  driver.get("https://www.instagram.com/?hl=en");
	  
	  
	  } 
}
