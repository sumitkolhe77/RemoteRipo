package MavenPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenChromeUsingWebDriverManager {

	public static void main(String[] args) {
		// System.setProprty(key,value);
		// browser instance

		WebDriverManager.chromedriver().setup();
		// create an instance of required browser class
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

	}

}
