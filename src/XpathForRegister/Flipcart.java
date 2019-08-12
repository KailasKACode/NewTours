package XpathForRegister;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipcart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("7040007049");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kailas0101");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[contains(text(),'Login')])[1]")).click();
		
		
		
		
		
	}
	
	
	

}
