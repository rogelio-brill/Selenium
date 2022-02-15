import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BySelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rogelio.aguilar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    String baseUrl = "http://output.jsbin.com/usidix/1";
	    //"http://output.jsbin.com/usidix/1";
	    //"http://facebook.com";
//	    String tagName = "";
//	    
	    driver.get(baseUrl);
//	    
//	    //get tageName
//	    tagName = driver.findElement(By.id("email")).getTagName();
//	    System.out.println("TagName: " + tagName);
	    
	    String alertMsg = "";
	    driver.findElement(By.cssSelector("body > input[type=button]")).click();
	    alertMsg = driver.switchTo().alert().getText();		
		
        // Capturing alert message.    
        driver.switchTo().alert().accept();		
        		
        // Displaying alert message		
        System.out.println(alertMsg);
	    driver.close();
	}

}
