package day07_MultipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;                   //samsung phone count & print name....done
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
                                                     //gsmarena pagination pgae for realme...done
public class AssignmentTC4 {

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
		// 1.open cricinfo
		driver.get("https://www.gsmarena.com/");
		// 2.validate home page
		String Actualurl = driver.getCurrentUrl();
		String Exptedurl = "https://www.gsmarena.com/";
		System.out.println("Home page validation : " + Exptedurl.equals(
				"https://www.gsmarena.com/"));
		//3.click on realme phone link present in phone finder
		driver.findElement(By.cssSelector("a[href='realme-phones-118.php']")).click();
		//4.Check wheather page is pagination or not.
		WebElement IsPagePagination=driver.findElement(By.cssSelector(".nav-pages"));
		System.out.println("is page is pagination : "+IsPagePagination.isDisplayed());
		//5.print pagination links names
		List<WebElement> PaginationLinksName=driver.findElements(By.cssSelector(
				"div[class='review-nav pullNeg col pushT10 ']>div[class='nav-pages']>a"));
		System.out.println("pagination links count : "+PaginationLinksName.size());
		//4.print all menu option name
		for(int i=0;i<PaginationLinksName.size();i++) {
			System.out.println(PaginationLinksName.get(i).getText());
		}
		//5.navigate to each page and get each page url
		driver.findElement(By.linkText("2")).click();
		String page2url=driver.getCurrentUrl();
		System.out.println("Page 2 url is : "+page2url);
		//explicit wait(static wait)
	    Thread.sleep(2000);
		driver.findElement(By.linkText("3")).click();
		String page3url=driver.getCurrentUrl();
		System.out.println("Page 3 url is : "+page3url);		
	}
 }
