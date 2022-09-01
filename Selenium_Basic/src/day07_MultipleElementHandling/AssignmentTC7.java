package day07_MultipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;
                                           //gsmarena pagination page for samsung....
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTC7 {            // gsmarena pagination 15-16 page ....dout

	public static void main(String[] args) throws InterruptedException  {
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
		// 1.open cricinfo
		driver.get("https://www.gsmarena.com/");
		// 2.validate home page
		String Actualurl = driver.getCurrentUrl();
		String Exptedurl = "https://www.gsmarena.com/";
		System.out.println("Home page validation : " + Exptedurl.equals(
				"https://www.gsmarena.com/"));
		//3.click on samsung phone link present in phone finder
		driver.findElement(By.cssSelector("a[href='samsung-phones-9.php']")).click();
		//4.Check wheather page is pagination or not.
		WebElement IsPagePagination=driver.findElement(By.cssSelector(".review-nav.pullNeg"));
		System.out.println("is page is pagination : "+IsPagePagination.isDisplayed());
		//5.print pagination links names
		List<WebElement> PaginationLinksName=driver.findElements(By.cssSelector(
				"div[class='nav-pages']>a"));
		System.out.println("pagination links count : "+PaginationLinksName.size());
		//4.print all menu option name
		for(int i=0;i<PaginationLinksName.size();i++) {
			System.out.print(" "+PaginationLinksName.get(i).getText()+" ");
		}
		System.out.println();
		//5.navigate to each page and get each page url
		for(int i=0;i<PaginationLinksName.size();i++) {
		System.out.println(driver.getCurrentUrl());
		PaginationLinksName.get(i).click();	
		Thread.sleep(2000);
		PaginationLinksName=driver.findElements(By.cssSelector("div[class='nav-pages']>a"));
		
		}		
	 }
  }

