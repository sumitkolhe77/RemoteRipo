package day03_Lcators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;            //orangehrm
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
                                            //orangehrm
public class Zassignment01 {

	public static void main(String[] args) {
		String currentWorkingDir=System.getProperty("user.dir");/*F:\\JavaWorkspace\\SeleniumTesting*/
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//ChromeDriver cdriver=new ChromeDriver(); //or
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		/*Identify User name field*/
		WebElement username=driver.findElement(By.id("txtUsername"));
		/*perform require operation in the username field*/
		username.clear();
		username.sendKeys("Admin");
		
		/*Identify password field*/
		WebElement pwd=driver.findElement(By.id("txtPassword"));
		/*perform require operation in the pwd field*/
		pwd.clear();
		pwd.sendKeys("admin123");
		
		/*Identify Sign in Button*/
		WebElement login=driver.findElement(By.name("Submit"));
		/*perform require operation in the Sign in Button*/
		login.click();
		driver.close();
		
		/*Identify forgot password link */
		//WebElement forgot=driver.findElement(By.linkText("Forgot your password?"));
		//forgot.click();

	}
}
