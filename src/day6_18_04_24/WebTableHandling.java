package day6_18_04_24;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args) {
		//1.get all rows
		//2.get all columns
		//3.iterate rows and columns & get the text
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
	       driver.get("https://www.asx.com.au/");
	       
	}
	
	
}











