package Test_VerifySupportThisProjectPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VerifySupportThisProjectPage {

	WebDriver driver;
	public VerifySupportThisProjectPage(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}

	public void VerifySupportThisProject() {
		driver.findElement(By.linkText("Support This Project")).click();
		String expectedtitle1 = "Software Testing Board is Creating a community for Software Testing Professionals";
		String ActualTitle1 = driver.getTitle();

		Assert.assertEquals(ActualTitle1, expectedtitle1);
		
		 if (driver.getCurrentUrl().contains("https://buymeacoffee.com/softwaretestingboard")) {
	            System.out.println("Support page verified!");
	        } else {
	            System.out.println("Support page not verified!");
	        }
		
		 driver.navigate().back();
	        if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/")) {
	            System.out.println("Back to main page!");
	        } else {
	            System.out.println("Failed to navigate back to main page!");
	        }
	        
	}
}