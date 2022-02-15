import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
// import org.testng.annotations.Test;

public class Sync {
	//protected WebDriver driver;
	// @Test
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rogelio.aguilar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		// WebDriverWait wait=new WebDriverWait(driver, 20);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		String eTitle = "Demo Guru99 Page";
		String aTitle = "" ;
		// launch Chrome and redirect it to the Base URL
		driver.get("http://demo.guru99.com/test/guru99home/" );
		//Maximizes the browser window
		driver.manage().window().maximize() ;
		//get the actual value of the title
		aTitle = driver.getTitle();
		//compare the actual title with the expected title
		if (aTitle.contentEquals(eTitle))
		{
			System.out.println( "Test Passed") ;
		}else {
			System.out.println( "Test Failed" );
		}
//		WebElement guru99seleniumlink;
//		guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
//		guru99seleniumlink.click();
		
		driver.switchTo().frame(driver.findElement(By.id("ccpa-consent-notice")));
	    WebElement close = driver.findElement(By.xpath("//*[@id=\"saveAndExit\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(close));
		close.click();
	  
		driver.switchTo().defaultContent();
		
		driver.close();
	}
		
}
