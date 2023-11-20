package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	WebDriver driver;
 
	
	@BeforeTest
	  public void beforeTest() {
		  driver=new ChromeDriver();//launch browser
			driver.manage().window().maximize();//maximize the window
			driver.get("https://demo.guru99.com/test/newtours/");//launch url

	  }

	  @AfterTest
	  public void afterTest() {
		  driver.close();
	  }

}
