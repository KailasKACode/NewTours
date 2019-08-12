package XpathForRegister;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingShareMarket {
	public static void main(String[] args) throws InterruptedException {
		WebDriver drc = new ChromeDriver();
		drc.get("https://www.bseindia.com/markets/Equity/newsensexstream.aspx");
		drc.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		drc.switchTo().frame("ContentPlaceHolder1_sensex");
		int totalrowp = drc.findElements(By.xpath("//body//tr//tr//tr")).size();
		for (int i = 1; i <= totalrowp; i++) {
			int subrows = drc.findElements(By.xpath("//body//tr//tr//tr[" + i + "]/td")).size();
			for (int j = 1; j <= subrows; j++) {
				System.out.print(
						drc.findElement(By.xpath("//body//tr//tr//tr[" + i + "]/td[" + j + "]")).getText() + "  ");
			}
			System.out.println();
		}
		//drc.close();
	}
}
