package XpathForRegister;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowHandleCanara {

	public static void main(String[] args) throws InterruptedException {

		WebDriver dre = new ChromeDriver();

		dre.get("https://www.canarabank.in/");
		dre.findElement(By.xpath("//button[(contains(text(),'Login to NetBanking'))]")).click();
		System.out.println("Window handle of parent " + dre.getWindowHandles());
		String ParentWindowhandle = dre.getWindowHandle();
		Set<String> all = dre.getWindowHandles();
		Iterator itr = all.iterator();
		for (String ch : all) {
			if (!ParentWindowhandle.equals(ch)) {
				dre.switchTo().window(ch);
				dre.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("Testing123");
				dre.findElement(By.xpath("//input[@name='fldPassword")).sendKeys("Test123");
				dre.findElement(By.xpath("//input[@value='SIGN IN']")).click();
			}
		}

	}

}
