package day07_MultipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
                                     //cricinfo main menu count & print name.....done
public class AssignmentTC2 {

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
		// 1.open cricinfo
		driver.get("https://www.cricinfo.com/");
		// 2.validate home page
		String Actualurl = driver.getTitle();
		String Exptedurl = "Live cricket scores, match schedules, latest cricket news, cricket videos";
		System.out.println("Home page validation : " + Exptedurl.equals(
				"Live cricket scores, match schedules, latest cricket news, cricket videos"));
		//3.Get main menu option count
		List<WebElement> MenuCount=driver.findElements(By.cssSelector("div[class='ds-flex ds-flex-row']>div>a"));
		System.out.println("main menu option count : "+MenuCount.size());//dout on line 33
		//4.print all menu option name
		for(int i=0;i<MenuCount.size();i++) {
			System.out.println(MenuCount.get(i).getText());
	}
  }
}
