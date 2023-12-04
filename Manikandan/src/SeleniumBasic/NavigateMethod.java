package SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
public static void main(String[] args) throws InterruptedException {
	String s="https://www.qspiders.com/";//given URL
	//open our Chrome Browser
	WebDriver driver=new ChromeDriver();
	//maximize The Browser
	driver.manage().window().maximize();
	//enter into WebSite
	driver.get("https://www.google.com/");
	Thread.sleep(1000);
	driver.navigate().to("https://demowebshop.tricentis.com/");
	String page = driver.getPageSource();
	System.out.println(page);
	driver.close();
}
}
