package day03_Lcators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;            //orangehrm
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
                                         //actitime
public class Zassignment02 {

	public static void main(String[] args) {
		String currentWorkingDir=System.getProperty("user.dir");/*F:\\JavaWorkspace\\SeleniumTesting*/
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//ChromeDriver cdriver=new ChromeDriver(); //or
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();		
		driver.get("https://demo.actitime.com/");
		
		/*Identify User name field*/
		WebElement username=driver.findElement(By.name("username"));
		/*perform require operation in the username field*/
		username.clear();
		username.sendKeys("admin");
		
		/*Identify password field*/
		WebElement pwd=driver.findElement(By.name("pwd"));
		/*perform require operation in the pwd field*/
		pwd.clear();
		pwd.sendKeys("manager");
		
		/*Identify check[] in Button*/
		WebElement check=driver.findElement(By.name("remember"));
		/*perform require operation in the Sign in Button*/
		check.click();
				
		/*Identify login in Button*/
		WebElement login=driver.findElement(By.id("loginButton"));
		/*perform require operation in the log in Button*/
		login.click();
		driver.close();
		
		/*Identify forgot password link */
		//WebElement forgot=driver.findElement(By.id("toPasswordRecoveryPageLink"));
		//forgot.click();
	}
}