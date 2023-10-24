package project3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

public class TestCase1 extends Parameters {

	@BeforeMethod
	public void mySetup() {
		driver.get(Url);
	}

	@Test()

	public void LoginWithStandardUser() throws InterruptedException {
		loginFunction(StandardUserName, passWord);
		Thread.sleep(3000);

//	public void LoginWithStandardUSer() throws InterruptedException {
//		WebElement userNameInputField = driver.findElement(By.id("user-name"));
//		userNameInputField.sendKeys(StandardUserName);
//		WebElement passwordInputField = driver.findElement(By.id("password"));
//		passwordInputField.sendKeys(passWord);
//		driver.findElement(By.id("login-button")).click();
//		driver.findElement(By.id("react-burger-menu-btn")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("logout_sidebar_link")).click();

	}

	@Test()

	public void LoginWithProblemUser() throws InterruptedException {
		loginFunction(ProblemUserName, passWord);
		Thread.sleep(3000);
//	public void LoginWithProblemUser() throws InterruptedException {
//		WebElement userNameInputField = driver.findElement(By.id("user-name"));
//		userNameInputField.sendKeys(ProblemUserName);
//		WebElement passwordInputField = driver.findElement(By.id("password"));
//		passwordInputField.sendKeys(passWord);
//		driver.findElement(By.id("login-button")).click();
//		driver.findElement(By.id("react-burger-menu-btn")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("logout_sidebar_link")).click();
	}

	@Test()

	public void LoginWithPerformanceUser() throws InterruptedException {
		loginFunction(ProblemUserName, passWord);
		Thread.sleep(3000);

//	public void LoginWithPerformanceUser() throws InterruptedException {
//		WebElement userNameInputField = driver.findElement(By.id("user-name"));
//		userNameInputField.sendKeys(PerformanceUserName);
//		WebElement passwordInputField = driver.findElement(By.id("password"));
//		passwordInputField.sendKeys(passWord);
//		driver.findElement(By.id("login-button")).click();
//		driver.findElement(By.id("react-burger-menu-btn")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("logout_sidebar_link")).click();
//		

	}

	@AfterTest
	public void myPostTesting() {
	}
}

//	@BeforeTest
//	public void mySetup() {
//		driver.get(Url);
//		WebElement userNameInputField = driver.findElement(By.id("user-name"));
//	}
//
//	@Test()
//	public void LoginWithStandardUSer() {
//		WebElement userNameInputField = driver.findElement(By.id("user-name"));
//		userNameInputField.sendKeys(StandardUserName);
//		userNameInputField.sendKeys(passWord);
//		driver.findElement()
//	}
//
//	@Test()
//	public void LoginWithProblemUser() {
//		WebElement userNameInputField = driver.findElement(By.id("user-name"));
//		userNameInputField.sendKeys(ProblemUserName);
//		
//
//	}
//	@Test()
//	public void LoginWithPerformanceUser() {
//		WebElement userNameInputField = driver.findElement(By.id("user-name"));
//		userNameInputField.sendKeys(PerformanceUserName);
//
//	}
//
//	@AfterTest
//	public void myPostTesting() {
//	}
//
//}
