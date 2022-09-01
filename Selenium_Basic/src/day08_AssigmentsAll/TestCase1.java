package day08_AssigmentsAll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;            //Automate first menu link of amazone.in and print page titles....done
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {               // Automate first menu link of amazon.in
                                             
	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		//1.launch browser
		WebDriver driver=new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//2.open url
		driver.get("https:www.amazon.in");
		//3.maximize browser size
		driver.manage().window().maximize();
		//4.Get page title and print it.
		String PageTitle=driver.getTitle();
		System.out.println("Page title is : "+PageTitle);
		//5.click on todays deals
		driver.findElement(By.cssSelector("a[data-csa-c-slot-id='nav_cs_1']")).click();
		//6.Get page title and print it.
		String PageTitle1=driver.getTitle();
		System.out.println("Page title is : "+PageTitle1);
		//7.navigate back to the home page
		driver.navigate().back();
		//8.Get page title and print it and virify with 4th test case page title
		String PageTitle3=driver.getTitle();
		System.out.println("Page title is : "+PageTitle3);
		System.out.println("Page title verification : "+PageTitle.equals(PageTitle3));
		//9.closed browser
		driver.close();
	}
}
