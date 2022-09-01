package day04_objValidation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zpractice01 {

	public static void main(String[] args) {
		String chromeExePath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		// creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		// to enter required application URL use get() of WebDriver interface
		driver.get("https://demo.actitime.com");
		String PageTitle=driver.getTitle();
		String ExpectedTitle="actiTIME - Login";
		System.out.println("PageTitle validation :"+PageTitle.equals(ExpectedTitle));
		
	}
}
