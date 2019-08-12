package WindowAndDoc;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSEDemo {
public static void main(String[] args) {
	System.out.println("\"kailas\"");
	WebDriver dr=new ChromeDriver();
	dr.get("https://www.facebook.com/");
	JavascriptExecutor js=(JavascriptExecutor)dr;
	js.executeAsyncScript("window.scrollTo(0,1000)");
	js.executeAsyncScript("document.getElementById(\"u_0_8\").click()");
	js.executeAsyncScript("window.scrollBy(0,-1000)");

	//js.executeAsyncScript("window.screenTop(0,-1000)");
	
	//js.executeScript(arg0, arg1)
	
	

	
	
}
}
