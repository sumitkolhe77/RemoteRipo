package day06_cssSelector;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zpractice {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//maximize browser window
		driver.manage().window().maximize();
		//we don't have any minimize method in selenium, so will use setSize()
		driver.manage().window().setSize(new Dimension(450, 600));
		//maximize browser window
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

}
