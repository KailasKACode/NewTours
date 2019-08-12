package XpathForRegister;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ShareMarketDynamicXpathFor {
public static void main(String[] args) {
WebDriver ele;
WebDriver dre=new ChromeDriver();
dre.get("https://www.bseindia.com/markets.html");
dre.manage().window().maximize();
dre.findElement(By.xpath("(//a[contains(text(),'Gainers')])[3]")).click();
//System.out.println(dre.findElement(By.xpath("//div[@class=\"tab-content\"]")).getText());
dre.manage().timeouts().implicitlyWait(4, TimeUnit.MILLISECONDS);

	
		dre.findElement(By.xpath("(//a[contains(text(),'Top Turnover')])[1]")).click();
	int totalrow = dre.findElements(By.xpath("//div[@id='late2']//tbody")).size();
	System.out.println(totalrow);
	for (int i = 1; i < totalrow; i++) {
			System.out.print(dre.findElement(By.xpath("//div[@id='late2']//tbody["+i+"]/tr/td[1]")).getText()+":     ");
			System.out.print(dre.findElement(By.xpath("//div[@id='late2']//tbody["+i+"]/tr/td[2]")).getText()+":     ");
			System.out.print(dre.findElement(By.xpath("//div[@id='late2']//tbody["+i+"]/tr/td[3]")).getText()+":     ");
			System.out.print(dre.findElement(By.xpath("//div[@id='late2']//tbody["+i+"]/tr/td[4]")).getText()+"      ");
			System.out.println();
	}
	System.out.println("\n\n\n");

	WebDriverWait wait=new WebDriverWait(dre,30);
	wait.pollingEvery(100, TimeUnit.MILLISECONDS);
	wait.ignoring(TimeoutException.class);
	wait.until(ExpectedConditions.alertIsPresent());
	
int s=dre.findElements(By.xpath("//div[@id='gain1']/table/tbody//td")).size();
System.out.println(" size "+s);
	int tabledata=dre.findElements(By.xpath("//div[@id='gain1']/table/tbody")).size();
	System.out.println("Size: "+tabledata);
	for (int i = 1; i < tabledata; i++) {
		for (int j = 1; j <=4; j++) {
			System.out.print(dre.findElement(By.xpath("//div[@id='gain1']/table/tbody["+i+"]//td["+j+"]")).getText()+"   ");
 
			//System.out.println(dre.findElement(By.xpath("//div[@id='gain1']/table/tbody["+i+"]//td["+j+"]")).getSize()+" ");
		}
System.out.println();		
		
	}
dre.close();	
}
}
 