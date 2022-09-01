package day16_Mouse_Operations;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ZAssignment01 {

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
		//1.open flipkart
		driver.get("https://www.flipkart.com/");
		//to avoid login popup
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		//
		//2.main menu options count
		List<WebElement> MainMenu=driver.findElements(By.xpath("//div[@class='xtXmba']"));
		List<WebElement> SubMenu=driver.findElements(By.xpath("//div[@class='_2IjXr8']/div[@class='_3XS_gI _7qr1OC']/a"));
		System.out.println("Main menu count :"+MainMenu.size());
		System.out.println("Main menu count :"+SubMenu.size());
		//3.Mousehovor on each main menu and print its menu name
		Actions actions=new Actions(driver);
		WebElement TopOffer=driver.findElement(By.xpath("//img[@alt='Top Offers']"));
//		List<WebElement> SubMenu=driver.findElements(By.xpath("//div[@class='_2IjXr8']/div[1]/a"));
//		actions.moveToElement(MainMenu.get(0)).perform();
//		for(int i=0;i<MainMenu.size();i++){
//			WebElement option=MainMenu.get(i);
//			actions.moveToElement(option).perform();
//			System.out.println(option.getText());
//		}	
//		List<WebElement> SubMenu=driver.findElements(By.xpath("//div[@class='_2IjXr8']/div[1]/a"));
//		AnyMenu(actions,MainMenu.get(3),SubMenu.get(1));
		
	}
	static void AnyMenu(Actions act,WebElement element1,WebElement element2)  {
		act.moveToElement(element1).perform();
		System.out.println("selected main menu name :"+element1.getText());
		act.moveToElement(element2).perform();
		System.out.println("selected sub menu name :"+element2.getText());
	    
	}
}
