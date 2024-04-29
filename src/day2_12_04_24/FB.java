package day2_12_04_24;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FB {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Create new account")).click();
      // pausing the execution for 2sec    
	    driver.findElement(By.name("firstname")).sendKeys("CHANDINI");
        driver.findElement(By.name("lastname")).sendKeys("Appikonda");
        driver.findElement(By.name("reg_email__")).sendKeys("chandini@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("chandini@gmail.com");
		driver.findElement(By.partialLinkText("Forgotten")).click();
		

	}

}
