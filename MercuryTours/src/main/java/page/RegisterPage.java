package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver=driver;
			}

	public void doRegister(String firstname,String lastname,String phone,String email,String address,String city,String state,String postalcode,String username,String password,String confirmpwd)
	{
		WebElement registerLink=driver.findElement(By.linkText("REGISTER"));
		registerLink.click();
		WebElement firstnamefield= driver.findElement(By.name("firstName"));
		 firstnamefield.sendKeys("Nysha");
		WebElement lastnamefield= driver.findElement(By.name("lastName"));
		lastnamefield.sendKeys("Manoj");
		WebElement phonefield=driver.findElement(By.name("phone"));
		phonefield.sendKeys("9495616988");
		WebElement emailfield=driver.findElement(By.name("userName"));
		emailfield.sendKeys("nyshamanojap@gmail.com");
		WebElement addressfield=driver.findElement(By.name("address1"));
		addressfield.sendKeys("kunnakadan house");
		WebElement cityfield=driver.findElement(By.name("city"));
		cityfield.sendKeys("Kalpetta");
		WebElement statefield=driver.findElement(By.name("state"));
		statefield.sendKeys("kerala");
		WebElement postalcodefield=driver.findElement(By.name("postalCode"));
		postalcodefield.sendKeys("673577");
		WebElement usernamefield=driver.findElement(By.name("email"));
		usernamefield.sendKeys("tutorial");
		WebElement passwordfield=driver.findElement(By.name("password"));
		passwordfield.sendKeys("tutorial");
		WebElement confirmpwdfield=driver.findElement(By.name("confirmPassword"));
		confirmpwdfield.sendKeys("tutorial");
		WebElement submitbutton=driver.findElement(By.name("submit"));
		submitbutton.click();


}
}