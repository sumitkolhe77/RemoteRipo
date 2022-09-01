package day11_ClenderHandling;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment01 {     //Calender Handling Redbus.in

	public static void main(String[] args) {    
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//1.Open Redbus.in
		driver.get("https://www.Redbus.in");
		//2.select from pune
		driver.findElement(By.cssSelector("#src")).sendKeys("Pune");
		driver.findElement(By.cssSelector(".autoFill>li:nth-of-type(17)")).click();
		//3.select to Goa
		driver.findElement(By.cssSelector("#dest")).sendKeys("Goa");
		driver.findElement(By.cssSelector(".autoFill>li:nth-of-type(5)")).click();
		//4.Date in future
		driver.findElement(By.className("next")).click();
		driver.findElement(By.cssSelector("div.rb-calendar>table>tbody>tr:nth-of-type(4)>td:nth-of-type(3)")).click();
		//5.click on search button
		driver.findElement(By.id("search_btn")).click();	
		//6.Deprature time should be after 6pm
		driver.findElement(By.cssSelector(".details>ul:nth-of-type(2)>li:nth-of-type(4)")).click();
		//7.bus type AC
		driver.findElement(By.cssSelector(".details>ul:nth-of-type(3)>li:nth-of-type(3)>label:nth-of-type(2)")).click();
		// to closed advertisment
		driver.findElement(By.cssSelector("div.close-primo>i.icon")).click();
		//8.Get bus name along with its price	
	}
}
