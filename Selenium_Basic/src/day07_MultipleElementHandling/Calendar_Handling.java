package day07_MultipleElementHandling;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Calendar_Handling {
	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		//1.open actitime
		driver.get("https://demo.actitime.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//2.Login with valid username and password
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton")).click();
		//3.click on task tab
		driver.findElement(By.id("container_tasks")).click();
		//4.click on add new button and select New Tasks
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		driver.findElement(By.cssSelector(".item.createNewTasks")).click();
		//5.Select customer
		driver.findElement(By.cssSelector(
				"tr>td>div.customerSelector>div>div:first-child>div:nth-of-type(3)")).click();
		driver.findElement(By.cssSelector(
				"tr.selectCustomerRow>td>div>div>div:nth-of-type(2)>div>div>div>div:nth-of-type(4)")).click();
		//6.Select project
		driver.findElement(By.cssSelector(
				"tr>td>div.projectSelector>div>div:first-child>div:nth-of-type(3)")).click();
		driver.findElement(By.cssSelector(
				"tr>td>div.projectSelector>div>div:last-child>div>div>div>div:nth-of-type(6)")).click();
		//7.Enter task name as a Testing
		driver.findElement(By.cssSelector("tbody>tr:first-child>td.nameCell.first")).sendKeys("Testing");
		

	}

}
