package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FlightPage {
	WebDriver driver;
	public FlightPage(WebDriver driver) {
		this.driver=driver;

	}
	
	public void doFlight() {
		List<WebElement>trip=driver.findElements(By.name("tripType"));
		trip.get(0).click();
		WebElement passenger=driver.findElement(By.name("passCount"));
		Select passengerdrp=new Select(passenger);
		passengerdrp.selectByValue("2");
		WebElement depart=driver.findElement(By.name("fromPort"));
		Select departdrp=new Select(depart);
		departdrp.selectByValue("Acapulco");
		WebElement onMonth=driver.findElement(By.name("fromMonth"));
		Select onMonthdrp=new Select(onMonth);
		onMonthdrp.selectByVisibleText("January");
		WebElement onDate=driver.findElement(By.name("fromDay"));
		Select onDatedrp=new Select(onDate);
		onDatedrp.selectByIndex(2);
		WebElement arrive=driver.findElement(By.name("toPort"));
		Select arrivedrp=new Select(arrive);
		arrivedrp.selectByValue("Frankfurt");
		WebElement returnmonth=driver.findElement(By.name("toMonth"));
		Select rtrnmnthdrp=new Select(returnmonth);
		rtrnmnthdrp.selectByVisibleText("November");
		WebElement returndate=driver.findElement(By.name("toDay"));
		Select returndatedrp=new Select(returndate);
		returndatedrp.selectByValue("1");
		List<WebElement>travelclass=driver.findElements(By.name("servClass"));
		travelclass.get(1).click();
		WebElement airline=driver.findElement(By.name("airline"));
		Select airlinedrp=new Select(airline);
		airlinedrp.selectByVisibleText("Blue Skies Airlines");
		WebElement continuebutton=driver.findElement(By.name("findFlights"));
		continuebutton.click();

		
	}
	

}
