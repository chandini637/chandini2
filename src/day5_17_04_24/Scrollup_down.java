package day5_17_04_24;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollup_down {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com/");
	    JavascriptExecutor js=((JavascriptExecutor)driver);
	    js.executeScript("windows.scrollBy(0,350)","");
	    Thread.sleep(2000);
	    
	    js.executeScript("windows.scrollBy(0,-350)","");
	    
	}

}
