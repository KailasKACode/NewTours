package XpathForRegister;

import java.awt.AWTException;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebElement ele;
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.shutterfly.com/");
		dr.manage().timeouts().implicitlyWait(1000, TimeUnit.NANOSECONDS);
		
		dr.findElement(By.xpath("//button[@class=\"modal-close\"]")).click();
		Actions action = new Actions(dr);
		WebElement photo = dr.findElement(By.xpath("//span[contains(text(),'Photo Books')][1]"));
		action.moveToElement(photo).perform();
		action.contextClick(photo).perform();
		WebElement Prints = dr.findElement(By.xpath("//span[contains(text(),'Prints')][1]"));
		

	}
}