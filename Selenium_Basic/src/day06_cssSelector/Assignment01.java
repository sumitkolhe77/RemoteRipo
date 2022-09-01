package day06_cssSelector;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment01 {

	public static void main(String[] args) {
		//1. Open chrome browser and enter url as https://demosite.executeautomation.com/Login.html
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//maximize browser window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//2.enter application url
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//3.verify login page
		String loginPageUrl=driver.getCurrentUrl();
		String ExpectedPageUrl="https://demo.vtiger.com/vtigercrm/index.php";
		System.out.println("login page validation :"+loginPageUrl.equals(ExpectedPageUrl));
		//4.Enter username and password & click in sign in button
		WebElement UserName = driver.findElement(By.cssSelector("input#username"));
		UserName.clear();
		UserName.sendKeys("admin");
		WebElement Passward = driver.findElement(By.cssSelector("input[id='password']"));
		Passward.clear();
		Passward.sendKeys("Test@123");
		WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
		loginButton.click();
		//5.home page validation
		String HomePageUrl=driver.getCurrentUrl();
		String ExpectedHomePageUrl="https://demo.vtiger.com/vtigercrm/index.php";
		System.out.println("home page validation :"+HomePageUrl.equals(ExpectedHomePageUrl));
		// click on Widget button
		driver.findElement(By.cssSelector(".btn.btn-default.addButton.dropdown-toggle")).click();
		driver.findElement(By.cssSelector("a[data-name='TopPotentials']")).click();
				
		//logout from application
		driver.findElement(By.cssSelector(".userName.dropdown-toggle")).click();
		driver.findElement(By.cssSelector("#menubar_item_right_LBL_SIGN_OUT")).click();
		//driver.close();
	}
}
