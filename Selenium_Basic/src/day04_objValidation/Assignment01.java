package day04_objValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
                                      // 11_Aug
public class Assignment01 {

	public static void main(String[] args) {
		String chromeExePath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		// creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		// to enter required application URL use get() of WebDriver interface
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//verify login page elements
		
		//verify usename is display,check its functionality, its attributes,put Username=Admin.
		WebElement UserName=driver.findElement(By.name("txtUsername"));
		System.out.println(" Is Username is display : "+UserName.isDisplayed());
		System.out.println(" Is Username is functional : "+UserName.isEnabled());
		String UserValue=UserName.getText();
		System.out.println(" username default value is :"+UserValue);// dout..
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		System.out.println("***********************************************************");
		//verify password is display,check its functionality, its attributes,put Username=admin123.
		WebElement PassWord=driver.findElement(By.name("txtPassword"));
		System.out.println(" Is PassWord is display : "+PassWord.isDisplayed());
		System.out.println(" Is PassWord is functional : "+PassWord.isEnabled());
		String Pwd=PassWord.getAttribute("form");
		System.out.println(" PassWord default value is :"+Pwd); //dout..
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		System.out.println("***********************************************************");
		//verify login BUtton is display,check its functionality, its attributes,click login button
		WebElement loginButton=driver.findElement(By.name("Submit"));
		System.out.println(" Is loginButton is display : "+loginButton.isDisplayed());
		System.out.println(" Is loginButton is functional : "+loginButton.isEnabled());
		String loginButtonValue=loginButton.getAttribute("value");
		System.out.println(" loginButton default value is :"+loginButtonValue); //dout..
		//loginButton.click();
		System.out.println("***********************************************************");
		//verify forgot password link is display,check its functionality.
		WebElement Forgot=driver.findElement(By.linkText("Forgot your password?"));
		System.out.println(" Is forgotLink is display : "+Forgot.isDisplayed());
		System.out.println(" Is forgotLink is functional : "+Forgot.isEnabled());
		String ForgotValue=Forgot.getAttribute("value");
		System.out.println("forgot link default value is :"+ForgotValue); //dout..
		//Forgot.click();
		System.out.println("***********************************************************");
		
	}

}
