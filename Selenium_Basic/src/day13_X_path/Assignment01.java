package day13_X_path;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment01 {

	public static void main(String[] args) throws InterruptedException {
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
		driver.get("https://www.amzon.com");
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
		driver.findElement(By.xpath("//a[@data-ref-tag='nav_em_1_1_1_6']")).click();
		Thread.sleep(20);
		driver.findElement(By.xpath("//a[text()='Cell Phones & Accessories']")).click();
		WebElement MobileName=driver.findElement(By.xpath("//span[text()='iPhone 11 ProMax Screen Protector 2 Pack']"));
		System.out.println(MobileName.getText());
	}

}
