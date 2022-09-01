package day01.openbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser04 {

	public static void main(String[] args) {
		//Absolute path
		String driverPath1="D:\\Acceleration\\May_13_Workspace\\Selenium_Basic\\Exicutable\\geckodriver.exe";
		//or Relative path --> '.' indicate current working dir
		String driverPath2=".\\Exicutable\\geckodriver.exe";
		//or using System class
		String driverPath3=System.getProperty("user.dir")+"\\Exicutable\\geckodriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.gecko.driver", driverPath3);
		//create an instance of required browser class
		FirefoxDriver fdriver=new FirefoxDriver();
		fdriver.get("https://www.google.com");
	}

}
