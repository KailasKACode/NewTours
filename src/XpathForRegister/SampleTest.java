package XpathForRegister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
public static void main(String[] args) {
	WebDriver ele;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kailas\\Downloads\\Compressed\\chromedriver.exe");
	ChromeDriver dri=new ChromeDriver();
	dri.get("https://icmt.unionbankofindia.co.in/account/");
	dri.manage().window().maximize();
	dri.findElement(By.xpath("//select[@name='ddlTitle']")).sendKeys("Miss");
	dri.findElement(By.xpath("//select[@name=\"ddlTitle\"]")).sendKeys("Mr.");;
	dri.findElement(By.xpath("//input[@name='txt_Name']")).sendKeys("Kailas Vaijanath Andhalkar");
	dri.findElement(By.xpath("//label[@for='rd_male']")).click();
	//dri.findElement(By.xpath("//label[@for='rd_female']")).click();
	dri.findElement(By.xpath("//input[@name='txt_Father_Name']")).sendKeys("Vaijanath");
	dri.findElement(By.xpath("//input[@name=\"txt_Mother_Name\"]")).sendKeys("Mahadevi");
	dri.findElement(By.xpath("//span[@id=\"PopCalendar1_Control\"]")).click();
	dri.findElement(By.xpath("//span[@id=\"PopCalendar1_Control\"]"));

}
}
