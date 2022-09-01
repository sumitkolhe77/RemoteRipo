package day08_AssigmentsAll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;              // Automate all menu links of amazon.in
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		// 1.launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// 2.open url
		driver.get("https:www.amazon.in");
		// 3.maximize browser size
		driver.manage().window().maximize();
		// 4.Get page title and print it.
		String PageTitle = driver.getTitle();
		System.out.println("Page title is : " + PageTitle);
		// 5.click on todays deals
		driver.findElement(By.cssSelector("a[data-csa-c-slot-id='nav_cs_1']")).click();
		// 6.Get page title and verify it with expected title
		String TodayDealsTitle1 = driver.getTitle();
		System.out.println(
				"Today Deals Page title Verification is : " + TodayDealsTitle1.equals("Amazon.in - Today's Deals"));
		// 7.navigate back to the home page
		driver.navigate().back();
		// 8.Get page title and print it and virify with 4th test case page title
		String PageTitle2 = driver.getTitle();
		System.out.println("Page title verification after navigate to back from Today Deals page is : "
				+ PageTitle2.equals(PageTitle));
		// 9.click on Best sellers
		driver.findElement(By.cssSelector("a[data-csa-c-slot-id='nav_cs_0']")).click();
		String BestSellersTitle1 = driver.getTitle();
		System.out.println("Best Sellers Page title Verification is : "
				+ BestSellersTitle1.equals("Amazon.in Bestsellers: The most popular items on Amazon"));
		driver.navigate().back();
		String PageTitle3 = driver.getTitle();
		System.out.println("Page title verification after navigate to back from Best Sellers page is : "
				+ PageTitle3.equals(PageTitle));
		// 9.click on mobiles
		driver.findElement(By.cssSelector("a[data-csa-c-content-id='nav_cs_mobiles']")).click();
		String MobilesPageTitle1 = driver.getTitle();
		System.out.println("Mobiles"
				+ " Page title Verification is : "
				+ MobilesPageTitle1.equals("Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in"));
		driver.navigate().back();
		String PageTitle4 = driver.getTitle();
		System.out.println("Page title verification after navigate to back from Mobiles page is : "
				+ PageTitle4.equals(PageTitle));
		//10.click on Customers services
		driver.findElement(By.cssSelector("a[data-csa-c-content-id='nav_cs_help']")).click();
		String CustemorPageTitle1 = driver.getTitle();
		System.out.println("Customer Services"
				+ " Page title Verification is : "
				+ CustemorPageTitle1.equals("Help - Amazon Customer Service"));
		driver.navigate().back();
		String PageTitle5 = driver.getTitle();
		System.out.println("Page title verification after navigate to back from Customer Services page is : "
				+ PageTitle5.equals(PageTitle));
		//11.click on books
		driver.findElement(By.cssSelector("a[data-csa-c-content-id='nav_cs_books']")).click();
		String BookPageTitle1 = driver.getTitle();
		System.out.println("Book"
				+ " Page title Verification is : "
				+ BookPageTitle1.equals("Book Store Online : Buy Books Online at Best Prices in India | Books Shopping @ Amazon.in"));
		driver.navigate().back();
		String PageTitle6 = driver.getTitle();
		System.out.println("Page title verification after navigate to back from Book page is : "
				+ PageTitle6.equals(PageTitle));
		driver.close();
	}
}
