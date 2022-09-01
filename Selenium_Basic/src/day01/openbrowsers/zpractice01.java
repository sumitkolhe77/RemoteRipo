package day01.openbrowsers;

import org.openqa.selenium.edge.EdgeDriver;

public class zpractice01 {

	public static void main(String[] args) {
		/**
		 * Step1: set the path of required browser executable file using System.setProperty(key, value)
		 * Step2: create an instance of required browser class
		 */
		System.setProperty("webdriver.edge.driver", 
				"D:\\Acceleration\\May_13_Workspace\\Selenium_Basic\\Exicutable\\msedgedriver.exe");
		
		EdgeDriver cdriver=new EdgeDriver();
		//to enter the url on the open browser
		cdriver.get("https://www.google.com");
		//close the current browser
		cdriver.close();
	}
}
