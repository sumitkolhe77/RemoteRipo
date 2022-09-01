package day01.openbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser01 {

	public static void main(String[] args) {
		/**
		 * Step1: set the path of required browser executable file using System.setProperty(key, value)
		 * Step2: create an instance of required browser class
		 */
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Acceleration\\May_13_Workspace\\Selenium_Basic\\Exicutable\\chromedriver.exe");
		System.out.println(System.getProperty("webdriver.chrome.driver"));
		ChromeDriver cdriver=new ChromeDriver();
		//to enter the url on the open browser
		cdriver.get("https://www.google.com");
		//close the current browser
		cdriver.close();
	}
}
// proghram shows how to open chrome browser automatically using java.