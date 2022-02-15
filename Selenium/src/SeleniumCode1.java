import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumCode1 {


	public static void main(String[] args) {
	    // declaration and instantiation of objects/variables
		// System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		//WebDriver driver = new WebDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rogelio.aguilar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    String baseUrl = "https://demo.guru99.com/test/newtours/";
	    String expectedTitle = "Welcome: Mercury Tours";
	    String actualTitle = "";
	    
	    // launch Fire fox and direct it to the Base URL
	    driver.get(baseUrl);
	
	    // get the actual value of the title
	    actualTitle = driver.getTitle();
	    
	    /*
	     * driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	     * compare the actual title of the page with the
	* the result as "Passed" or "Failed"
	     */
	    if (actualTitle.contentEquals(expectedTitle)){
	        System.out.println("Test Passed!");
	    } else {
	        System.out.println("Test Failed");
	    }

	    //close Fire fox
	     /* *
	     */
	    driver.close();
	   System.exit(0);
	}

}

