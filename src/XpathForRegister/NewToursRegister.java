package XpathForRegister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.WebDriverHandler;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.io.ManagedSelector.Selectable;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewToursRegister {
	
	WebElement ele;
	static ChromeDriver driver = new ChromeDriver();
	public static void reGister() {
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='REGISTER']/parent::td")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("vaibhav");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Sarode");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9822415544");
		driver.findElement(By.xpath("//input[@name='userName' and @id='userName']")).sendKeys("Vaibh01@gmai.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("somatane phate");
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("Near a, dattamandir");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("pune");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Maharastra");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("411039");
		driver.findElement(By.xpath("//select[@name='country']")).sendKeys("Pakistan");
		driver.findElement(By.xpath("//input[@name='email' and @id='email']")).sendKeys("Vaibhav0101");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ME01011");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("ME01011");
		driver.findElement(By.xpath("//input[@type='image']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'sign-in')]")).click();
		driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("Vaibhav0101");

	}
	
	public static void loGin() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("ME01011");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		driver.findElement(By.xpath("//input[@value=\"oneway\"]")).click();
	}
	public static void toClickDropDown() {
		WebElement st1 = driver.findElement(By.xpath("//select[@name=\"passCount\"]"));
		Select passenger = new Select(st1);
		passenger.selectByVisibleText("3");
	}

	public static void main(String[] args) {
		
		NewToursRegister dm = new NewToursRegister();
		dm.reGister();
		dm.loGin();
		dm.toClickDropDown();
	

	}
}
 