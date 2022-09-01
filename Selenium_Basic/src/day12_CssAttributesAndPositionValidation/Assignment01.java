package day12_CssAttributesAndPositionValidation;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment01 {

	public static void main(String[] args) { // validate bakground colour,font size,location
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://courses.letskodeit.com/practice");
		//validate bakground colour,font size of radio-button
		WebElement RadioButton=driver.findElement(By.cssSelector("div#radio-btn-example>fieldset>legend"));
		String fontSize=RadioButton.getCssValue("font-size");
		String fontColor=RadioButton.getCssValue("color");
		String fontBackgroundColor=RadioButton.getCssValue("background");
		System.out.println("Font Size: "+fontSize);
		System.out.println("Font color: "+fontColor);
		System.out.println("Font Background Color: "+fontBackgroundColor);
		//validate location/position of radio-button
		int Rdobutton=driver.findElement(By.cssSelector("div#radio-btn-example>fieldset>legend")).getLocation().getY();
		System.out.println("Rdobutton y: "+Rdobutton);
		int BMW=driver.findElement(By.cssSelector("div#radio-btn-example>fieldset>label:nth-of-type(1)")).getLocation().getY();
		System.out.println("BMW Y: "+BMW);

		System.out.println("is Rdobutton getting displayed above the BMW field? "+(BMW>Rdobutton));

	}

}
