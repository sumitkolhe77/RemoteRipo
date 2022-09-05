package MavenPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utilities.DateUtility;
import Utilities.SeleniumUtility;

public class OpenChromeUsingUtility {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("Chrome","https://www.google.com");
		String date=DateUtility.getRequiredDateBasedOnNumberOfDays("ddMMyyyyHHmmss", 0);
		String fileName=".\\src\\test\\resources\\ScreenShots\\GoogleSearchPage"+date+".png";
		s1.takeScreenshot(fileName);
	}
}
