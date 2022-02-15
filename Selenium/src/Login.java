import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Login{

	   public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\rogelio.aguilar\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://demo.guru99.com/test/login.html");
	   
		   WebElement email = driver.findElement(By.id("email"));
		   WebElement password = driver.findElement(By.id("passwd"));
	
		   email.sendKeys("rogelio@gmail.com");
		   password.sendKeys("password");
		   
		   email.clear();
		   password.clear();
		   System.out.println("Text cleared");
		   
		   // Login again
		   WebElement submitlogin = driver.findElement(By.id("SubmitLogin"));
		   email.sendKeys("rogelio@gmail.com");
		   password.sendKeys("password");
		   driver.switchTo().frame(driver.findElement(By.id("ccpa-consent-notice")));
		   WebElement close = driver.findElement(By.xpath("//*[@id=\"saveAndExit\"]"));
		   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		   wait.until(ExpectedConditions.elementToBeClickable(close));
		   close.click();
		   driver.switchTo().defaultContent();
		   submitlogin.click(); 
		   
		   System.out.println("Logged In");
		   
		   driver.close();
	   }

}