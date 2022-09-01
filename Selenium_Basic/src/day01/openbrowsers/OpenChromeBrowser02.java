package day01.openbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser02 {

	public static void main(String[] args) {
		//Absolute path
		String driverPath1="D:\\Acceleration\\May_13_Workspace\\Selenium_Basic\\Exicutable\\chromedriver.exe";
		//or Relative path --> '.' indicate current working dir
		String driverPath2=".\\executables\\chromedriver.exe";
		//or using System class
		String driverPath3=System.getProperty("user.dir")+"\\Exicutable\\chromedriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath3);
		//create an instance of required browser class
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.get("https://www.google.com");

	}

}