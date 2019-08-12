package XpathForRegister;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitInSelenium {
	public static void main(String[] args) {
		WebDriver ele;
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.facebook.com/");
//		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement firstName = dr.findElement(By.name("firstname")); 
		WebElement lastName = dr.findElement(By.name("lastname"));
		WebElement email = dr.findElement(By.name("reg_email__"));
		WebElement reg_email_confirmation__=dr.findElement(By.name("reg_email_confirmation__"));
		WebElement reg_passwd__ = dr.findElement(By.name("reg_passwd__"));
		WebElement ac=dr.findElement(By.linkText("Forgotten account?"));
		clickOn(dr, ac, 10);
		sendKey(dr, firstName, 10, "Tom");
		sendKey(dr, lastName, 5, "Henry");
		sendKey(dr, email, 3, "testingshastra@gmail.com");
		sendKey(dr, reg_email_confirmation__, 20, "testingshastra@gmail.com");
		sendKey(dr, reg_passwd__, 6, "MeKaykaru0101");
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public static void sendKey(WebDriver driver, WebElement ele, int timeout, String value) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys(value);
	}
	public static void clickOn(WebDriver dr,WebElement ele,int timeout) {
		new WebDriverWait(dr, timeout).until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();

	}

	private void Until(ExpectedCondition<WebElement> visibilityOf) {
		// TODO Auto-generated method stub

	}

}
