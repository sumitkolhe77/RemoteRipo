package day07_MultipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;               //flipkart main menu 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTC1 {
                                                 //flipkart main menu count and print name...done
	public static void main(String[] args) {
		String chromeExePath = System.getProperty("user.dir") + "\\Executables\\chromedriver.exe";
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		// creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		// maximize browser window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// to enter required application URL use get() of WebDriver interface
		// 1.open flipkart
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		// 2.validate home page
		String Actualurl = driver.getTitle();
		String Exptedurl = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		System.out.println("Home page validation : " + Exptedurl.equals(
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"));
		//3.Get main menu option count
		List<WebElement> MenuCount=driver.findElements(By.cssSelector(".xtXmba"));//dout
		System.out.println("main menu option count : "+MenuCount.size());
		//4.print all menu option name
		for(int i=0;i<MenuCount.size();i++) {
			System.out.println(MenuCount.get(i).getText());
	 }
  }
}
