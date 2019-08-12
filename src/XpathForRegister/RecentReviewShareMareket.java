package XpathForRegister;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RecentReviewShareMareket {
public static void main(String[] args) throws InterruptedException {
	WebDriver dew=new ChromeDriver();
	dew.get("https://www.bseindia.com/markets.html");
	Thread.sleep(10000);
	
	WebDriverWait waite=new WebDriverWait(dew, 10);
	waite.pollingEvery(100,TimeUnit.SECONDS);
	waite.until(ExpectedConditions.alertIsPresent());
	
	
	dew.findElement(By.xpath("(//a[contains(text(),'Losers')])[3]")).click();
	dew.findElement(By.xpath("//a[contains(text(),'SURYALAXMI')]")).click();
	Thread.sleep(10000);
	String parent=dew.getWindowHandle();
	dew.switchTo().window(parent);
	System.out.println(parent);
	Thread.sleep(10000);
	dew.findElement(By.xpath("(//a[contains(text(),'Recently Viewed')])[1]")).click();
/*	Set<String> allwindow=dew.getWindowHandles();
	
	for(String child:allwindow)
	{
		if(!parent.equals(child))
		{
			dew.switchTo().window(child);

		}
	}*/
	

	
	
}
}
