package Test_VerifyPageTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VerifyPageTitle {
	WebDriver driver;
	public VerifyPageTitle(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	public void url() throws InterruptedException {
		driver.get("https://magento.softwaretestingboard.com/");
	}
	
	public void pageTitle() {
		String expectedtitle = "Home Page";
		String ActualTitle = driver.getTitle();
	
		 if (ActualTitle.equals("Home Page")) {
	            System.out.println("Page title verified: " + driver.getTitle());
	        } else {
	            System.out.println("Page title verification failed. Expected: Magento Demo Store, Actual: " + driver.getTitle());
	        }

	}
	
	public void closeBrowser() {
		driver.close();
	}
}
