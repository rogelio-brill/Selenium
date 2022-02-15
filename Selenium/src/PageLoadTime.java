import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rogelio.aguilar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    String baseUrl = "https://www.cnn.com";
	    	    
	    long start = System.currentTimeMillis();
	    driver.get(baseUrl);
	    
	    long finish = System.currentTimeMillis();
	    
	    long totalTime = finish - start;
	    System.out.println("Page load time " + totalTime + "milliseconds");
	    //driver.manage().deleteAllCookies();
	    
	    // Page load Timeout
	    //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	    driver.close();
	}

}
