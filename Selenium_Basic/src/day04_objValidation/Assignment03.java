package day04_objValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment03 {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//login page validation
		String pageTitle=driver.getTitle();
		System.out.println("Page title is: "+pageTitle);//OrangeHRM
		System.out.println("Page title length: "+pageTitle.length());//9
		System.out.println("Page title status: "+pageTitle.equals("OrangeHRM"));//t
		String pageURL=driver.getCurrentUrl();
		System.out.println("Page URL is: "+pageURL);//opensource-demo.orangehrmlive.com/
		System.out.println("Page URL status: "+pageURL.equals("https://opensource-demo.orangehrmlive.com/"));//t
		String pageContent=driver.getPageSource();
		//System.out.println("Page Source is: "+pageContent);
		System.out.println("Page Source length: "+pageContent.length());//43972
		
		//identify and type user name as Admin
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		String homePageUrl=driver.getCurrentUrl();
		System.out.println("Home validation status: "+homePageUrl.contains("dashboard"));
		
		//identify user profile and click on it
		driver.findElement(By.id("welcome")).click();
		//identify Logout link and click on it
		driver.findElement(By.linkText("Logout")).click();
		driver.close();		
	}
}