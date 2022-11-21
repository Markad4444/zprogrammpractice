package seleniumpkgpractice;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumpractice {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\selenium2\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://www.google.com");
System.out.println(driver.getTitle());
//driver.switchTo().newWindow(WindowType.TAB);// open a new blank tab
driver.switchTo().newWindow(WindowType.WINDOW);
Set<String>  handle= driver.getWindowHandles();
ArrayList<String> ls = new ArrayList<String>(handle);
String parent = ls.get(0);
String child =ls.get(1);
System.out.println(parent);
System.out.println(child);

driver.get("http://www.facebook.com");
System.out.println(driver.getTitle());

driver.close(); 
driver.switchTo().window(parent);
System.out.println(driver.getTitle());
driver.close();
}
}
