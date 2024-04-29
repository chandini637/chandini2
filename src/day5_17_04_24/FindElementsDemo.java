package day5_17_04_24;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FindElementsDemo {

	

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com/");
	       List<WebElement> allLinks=driver.findElements(By.tagName("a"));
	       int count= allLinks.size();
	       System.out.println("Total no of Links:"+count);
	       for(int i=0;i<count;i++) {
		System.out.println(allLinks.get(i).getText());
	       }

	}

}
