package utility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtility {
	WebDriver driver;
	

	public ElementUtility(WebDriver driver) {
		this.driver=driver;
		
			}
	public void dosendKeys(WebElement element,String value) {
		element.sendKeys(value);
	}
	public void doClick(WebElement element) {
		element.click();
	}
	public void clickRadioButton(List<WebElement>element,int index) {
		element.get(index).click();
		
	}

}
