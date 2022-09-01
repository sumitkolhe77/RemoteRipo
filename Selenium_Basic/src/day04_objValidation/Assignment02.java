package day04_objValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment02 {                // 11_Aug

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://demo.actitime.com");
		
		// identify UserName field
		WebElement userNameInputField = driver.findElement(By.id("username"));
		System.out.println("User name is displayed or not? " + userNameInputField.isDisplayed());
		System.out.println("User name is functional or not? " + userNameInputField.isEnabled());

		String defaultValueInUserNameInputField = userNameInputField.getAttribute("placeholder");
		System.out.println("Default value of user name input field: " + defaultValueInUserNameInputField);
		System.out.println("Default value validation for user name input field status: "
				+ defaultValueInUserNameInputField.equals("Username"));

		// identify password field
		WebElement PwdInputField = driver.findElement(By.name("pwd"));
		System.out.println(" password name is displayed or not :" + PwdInputField.isDisplayed());
		System.out.println(" password name is functional or not :" + PwdInputField.isEnabled());

		String defaultValueInPwdNameInputField = PwdInputField.getAttribute("placeholder");
		System.out.println("Default value of password input field: " + defaultValueInPwdNameInputField);
		System.out.println("Default value validation for password name input field status: "
				+ defaultValueInPwdNameInputField.equals("Password"));

		// login button
		WebElement loginInputField = driver.findElement(By.id("loginButton"));
		System.out.println(" Login Buton is displayed or not :" + loginInputField.isDisplayed());
		System.out.println(" Login Buton is functional or not :" + loginInputField.isEnabled());

		String defaultValueInloginInputField = loginInputField.getText();
		System.out.println("Default value of Login Button field: " + defaultValueInloginInputField);
		System.out.println("Default value validation for Login Button field status: "
				+ defaultValueInloginInputField.equals("Login"));

		// check box
		WebElement checkbox = driver.findElement(By.name("remember"));
		System.out.println(" check Buton is displayed or not :" + checkbox.isDisplayed());
		System.out.println(" check Buton is functional or not :" + checkbox.isEnabled());

		// identify keepLoggedInLabel
		WebElement keepLoggedInLabelCheckBoxText = driver.findElement(By.id("keepLoggedInLabel"));
		System.out.println(keepLoggedInLabelCheckBoxText.isDisplayed());
		System.out.println(keepLoggedInLabelCheckBoxText.isEnabled());
		String checkBoxTextName = keepLoggedInLabelCheckBoxText.getText();
		System.out.println(checkBoxTextName);
	}

}
