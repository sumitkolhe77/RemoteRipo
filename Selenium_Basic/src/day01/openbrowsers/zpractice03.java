package day01.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zpractice03 {

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
				String ExpectedUrl="https://www.google.com";
				String appCurrentUrl=driver.getCurrentUrl();

				System.out.println("Actaul URL:"+appCurrentUrl);
				System.out.println("Expected URL: "+ExpectedUrl);
				if(appCurrentUrl.contains(ExpectedUrl)) {
					System.out.println("Current URL validation is passed");
				}else {
					System.out.println("Current URL validation is Failed");
				}


	}

}
