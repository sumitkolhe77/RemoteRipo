package day07_MultipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zpractice01 {

	public static void main(String[] args) throws InterruptedException {
		String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https:www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("selenium interview questions");
		List<WebElement>ListOfsugg=driver.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>div:nth-of-type(1)>span"));
		System.out.println("Suggestion count:" +ListOfsugg.size());
        for(int i=0;i<ListOfsugg.size();i++) {
        System.out.println(ListOfsugg.get(i).getText());
        }
	}
}
