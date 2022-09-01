package day02_Assignment;

import org.openqa.selenium.WebDriver;            //automation Register page
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment05 {

	public static void main(String[] args) {
		
		//Set the driver executable path using System.setProperty(String key,String value)
		String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";		
	    System.setProperty("webdriver.chrome.driver", path);
	    //create an instance of required browser class
		WebDriver driver = new ChromeDriver();
		//need to enter application URL in the opened browser
		driver.get("https://demo.automationtesting.in/Register.html");
		
		// print page title and validate it
		String ActualTitle=driver.getTitle();
		String ExpectedTitle = "Register";
		System.out.println("ActualTitle :" + ActualTitle);
		System.out.println("ExpectedTitle :" + ExpectedTitle);
		System.out.println("page Title validation: "+ActualTitle.equals(ExpectedTitle));
		int titleLength = driver.getTitle().length();
		System.out.println("title length :" + titleLength);
		
		//print page url and validate it
		String Actualurl=driver.getCurrentUrl();
		String Expectedurl = "https://demo.automationtesting.in/Register.html";
		System.out.println("ActualUrl :" + Actualurl);
		System.out.println("ExpectedUrl :" + Expectedurl);
		System.out.println("page url validation: "+Actualurl.equals(Expectedurl));
		int UrlLength = driver.getCurrentUrl().length();
		System.out.println("url length :" + UrlLength);
		
		//get page source and prints its length.
		String PageSource=driver.getPageSource();
		System.out.println("Source content lenght:"+PageSource.length());
		//close current browser
		driver.close();
	}

}
