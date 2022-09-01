package day01.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenEdgeWithGenericWay08 {

	public static void main(String[] args) {
		//Absolute path
		String driverPath1="D:\\Acceleration\\May_13_Workspace\\Selenium_Basic\\executables\\msedgedriver.exe";
		//or Relative path --> '.' indicate current working dir
		String driverPath2=".\\executables\\IEDriverServer.exe";
		//or using System class
		String driverPath3=System.getProperty("user.dir")+"\\executables\\msedgedriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.Edge.driver", driverPath3);
		//create an instance of required browser class
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
	}
}
// here program not run bcz Edge in not extend by Webdriver see image for that in selenium notes.
