package day01.openbrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser03 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"D:\\Acceleration\\May_13_Workspace\\Selenium_Basic\\Exicutable\\geckodriver.exe");
		FirefoxDriver fdriver = new FirefoxDriver();
		fdriver.get("https://www.google.com");
		fdriver.close();
	}
}
