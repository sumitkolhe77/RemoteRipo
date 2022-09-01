package day03_Lcators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zpractice02 {

	public static void main(String[] args) {
		//set the path of required browser executable file using System.setProperty(key, value)		          
		String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath3);
		//create an instance of required browser class
		WebDriver driver=new ChromeDriver();
		
		//need to enter application URL in the opened browser
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement username=driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		WebElement pwd=driver.findElement(By.id("password"));
		pwd.clear();
		pwd.sendKeys("Test@123");
		
		WebElement signInButton=driver.findElement(By.className("button"));
		signInButton.click();
		driver.close();
	}

}
