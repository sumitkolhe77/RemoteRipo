package day08_AssigmentsAll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; //Automate all menu links of techlistic.com
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {           // Automate all menu links of techlistic.com

	public static void main(String[] args) {
		String path = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		// 1.launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// 2.open url
		driver.get("https:www.techlistic.com");
		// 3.maximize browser size
		driver.manage().window().maximize();
		// 4.click on java link and validate page title
		driver.findElement(By.cssSelector(
				"div.overflowable-container.overflowable-3>div.overflowable-contents>div>ul>li:nth-of-type(1)>a"))
				.click();
		String JavaPageTitle = driver.getTitle();
		// String ExptedPageTitle="";
		System.out.println("Page title Validations : " + JavaPageTitle);
		// 5.navigate back to home page
		driver.navigate().back();
		// 6.click on selenium link and validate page title
		driver.findElement(By.cssSelector(
				"div.overflowable-container.overflowable-3>div.overflowable-contents>div>ul>li:nth-child(2)> div > a"))
				.click();
		String SeleniumPageTitle = driver.getTitle();
		// String ExptedPageTitle="";
		System.out.println("Page title Validations : " + SeleniumPageTitle);
		//7.navigate back to home page
		driver.navigate().back();
		//8.click on BOD link and validate page title
		driver.findElement(By.cssSelector(
				"div.overflowable-container.overflowable-3>div.overflowable-contents>div>ul>li:nth-child(7)> div > a"))
				.click();
		String BodPageTitle = driver.getTitle();
		// String ExptedPageTitle="";
		System.out.println("Page title Validations : " + BodPageTitle);
		//9.navigate back to home page
		driver.navigate().back();
		//8.click on Testing link and validate page title
		driver.findElement(By.cssSelector(
				"div.overflowable-container.overflowable-3 > div.overflowable-contents > div > ul > li:nth-child(9) > div > a"))
				.click();
		String TestingPageTitle = driver.getTitle();
		// String ExptedPageTitle="";
		System.out.println("Page title Validations : " + TestingPageTitle);		
	}
}
