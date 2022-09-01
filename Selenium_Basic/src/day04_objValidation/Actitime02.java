package day04_objValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
                                         //program shows use of implicit wait ...it is use for home page validaton.
public class Actitime02 {

	public static void main(String[] args) throws InterruptedException {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://demo.actitime.com");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//to get title from the application use getTitle() of WebDriver interface
		String pageTitle=driver.getTitle();
				
		System.out.println("Page title is: "+pageTitle);
		System.out.println("Page title length: "+pageTitle.length());
		String expectedTitle="actiTIME - Login";
		//validating login page
		System.out.println("Title validation status: "+pageTitle.equals(expectedTitle));
		
		//identify and perform required operation
		driver.findElement(By.id("username")).sendKeys("admin");
		//type password as manager
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//click on login button
		driver.findElement(By.id("loginButton")).click();
		
		//explicit wait(static wait)
		Thread.sleep(2000);
			
		//verify home page
		String homePageTitle=driver.getTitle();
		System.out.println("Home page title: "+homePageTitle);
		System.out.println("Home page validation status: "+homePageTitle.equals("actiTIME - Enter Time-Track"));
		//click on logout link
		driver.findElement(By.id("logoutLink")).click();
		//verify login page
		System.out.println("Title validation status: "+pageTitle.equals(expectedTitle));
		//close the browser
		driver.close();
	}
}
/*
1. Open any browser
2. Enter the url as https://demo.actitime.com/login.do
3. Verify login page
3. Username as admin
4. password as manager
5. click on Login button 
6. verify home page
7. click on logout link
8. verify login page is opened or not
9. close the browser
*/