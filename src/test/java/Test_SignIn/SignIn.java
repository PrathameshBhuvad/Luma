package Test_SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	WebDriver driver;

	public SignIn(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnSignIn() {
		WebElement SignInLink = driver.findElement(By.linkText("Sign In"));
		SignInLink.click();
	}

	public void fillupSignIndata() {

		driver.findElement(By.id("email")).sendKeys("admin321@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Admin@321");

		driver.findElement(By.id("send2")).click();

		System.out.println("Sign in successful!");
	}
}
