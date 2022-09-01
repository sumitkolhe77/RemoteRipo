package day07_MultipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignmentTC6 {
                                              // facebook operations....doubt
	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//1.open facebook
		driver.get("https:www.facebook.com");
		//2.validate home page
		String ExpectedTitle="Facebook – log in or sign up";
		String ActualTitle=driver.getTitle();
		System.out.println("home page validation : "+ActualTitle.equals(ExpectedTitle));
		//3.click on creat account button
		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		//4.perform operations on date,month,year.
		//1.for date : check it is visible,enables,multiselect,option count,name,default value,changed value & check updated value.
		WebElement date=driver.findElement(By.cssSelector("#day"));
		System.out.println("is date is visibles : "+date.isDisplayed());
		System.out.println("is date is enables : "+date.isEnabled());
		List<WebElement> OptionCount=driver.findElements(By.cssSelector("span>span>select:first-child>option"));
		System.out.println("Option count : "+OptionCount.size());
		WebElement Name=driver.findElement(By.cssSelector("select[id='day']>option[selected='1']"));
		//5.name
		System.out.println(Name.getAttribute("selected"));
		
		
		
		
		

	}

}
