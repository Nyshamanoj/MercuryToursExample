package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ElementUtility;
import utility.WaitUtility;


public class LoginPage {
	WebDriver driver;
	ElementUtility elementUtil;
	WaitUtility waitUtil;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		elementUtil=new ElementUtility(driver);
		waitUtil=new WaitUtility(driver);
	}

	public void doLogin(String username,String password) {
		WebElement usernamefield=driver.findElement(By.name("userName"));
		waitUtil.waitForVisibility(usernamefield);
		elementUtil.dosendKeys(usernamefield, username);
		
		WebElement passwordfield=driver.findElement(By.name("password"));
		waitUtil.waitForVisibility(passwordfield);
		elementUtil.dosendKeys(passwordfield, password);
		
		WebElement submitbutton=driver.findElement(By.name("submit"));
		waitUtil.waitForVisibility(submitbutton);
		elementUtil.doClick(submitbutton);
			
	}

}
