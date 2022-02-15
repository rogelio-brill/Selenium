import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class FetchAttribute{

   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\rogelio.aguilar\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   driver.get("https://www.tutorialspoint.com/about/about_team.htm");
	   // identify element
	   WebElement l = driver.findElement(By.linkText("Team"));
	   // href value from getAttribute()
	   String v = l.getAttribute("href");
	   System.out.println("Href value of link: "+ v);
	   driver.close();
   }
   
}