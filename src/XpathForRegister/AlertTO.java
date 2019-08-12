package XpathForRegister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertTO {
public static void main(String[] args) {
	WebDriver dr=new ChromeDriver();
	dr.get("https://www.irctc.co.in/nget/train-search");
	dr.manage().window().maximize();
	dr.findElement(By.xpath("//a[contains(text(),' REGISTER ')]")).click();

}
}
