package day01.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zpractice04 {

	public static void main(String[] args) {
		String driverPath1="D:\\Acceleration\\May_13_Workspace\\Selenium_Basic\\executables\\chromedriver.exe";
		//or Relative path --> '.' indicate current working dir
		String driverPath2=".\\executables\\chromedriver.exe";
		//or using System class
		String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath3);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		String pageTitle=driver.getTitle();
	}

}
