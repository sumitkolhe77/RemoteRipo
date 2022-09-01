package day01.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeWithGenericWay06 {

	public static void main(String[] args) {
		//Absolute path
		String driverPath1="D:\\Acceleration\\May_13_Workspace\\Selenium_Basic\\executables\\chromedriver.exe";
		//or Relative path --> '.' indicate current working dir
		String driverPath2=".\\executables\\chromedriver.exe";
		//or using System class
		String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath3);
		//create an instance of required browser class
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
// program shows open chrome browser with generic way..see line 18(hint-Webdriver)
// AS Webdriver is an interface which is extend by chrome,firefox,ms edge.