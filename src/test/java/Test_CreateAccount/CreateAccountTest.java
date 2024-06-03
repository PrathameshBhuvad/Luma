package Test_CreateAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateAccountTest {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		// Initialize WebDriver
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void testCreateAccount() throws InterruptedException {
		// Open the registration page URL
		driver.get("https://magento.softwaretestingboard.com/customer/address/edit/");

		// click on create account
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create an Account")).click();
		driver.findElement(By.id("firstname")).sendKeys("Pratham");
		driver.findElement(By.id("lastname")).sendKeys("Bhuvad");
		driver.findElement(By.id("email_address")).sendKeys("admin321@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Admin@321");
		driver.findElement(By.id("password-confirmation")).sendKeys("Admin@321");
		driver.findElement(By.xpath("//button[@title='Create an Account']")).click();
	}
}
