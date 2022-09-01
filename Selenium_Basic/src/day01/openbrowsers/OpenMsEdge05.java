package day01.openbrowsers;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenMsEdge05 {

	public static void main(String[] args) {
		//Absolute path
		String driverPath1="D:\\Acceleration\\May_13_Workspace\\Selenium_Basic\\Exicutable\\msedgedriver.exe";
		//or Relative path --> '.' indicate current working dir
		String driverPath2=".\\Exicutable\\msedgedriver.exe";
		//or using System class
		String driverPath3=System.getProperty("user.dir")+"\\Exicutable\\msedgedriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.edge.driver", driverPath3);
		//create an instance of required browser class
		EdgeDriver edriver=new EdgeDriver();
		edriver.get("https://www.google.com");		
	}
}
