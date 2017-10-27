package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;		
	@Test 				
	public void testEasy() {	
		driver.get("http://www.google.com");  
		String title = driver.getTitle();	
		System.out.println("Testing the webdriver");
		Assert.assertTrue(title.contains("Google")); 		
	}	
	@BeforeTest
	public void beforeTest() {	
		System.setProperty("webdriver.chrome.driver","C:\\jars\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();  
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}	
}
