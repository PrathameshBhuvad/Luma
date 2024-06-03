package Test_VerifyWhatsNewPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VerifyWhatsNewPage {

	WebDriver driver;
	
	public VerifyWhatsNewPage(WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (linkText="What's New") WebElement whats;
	

	public void VerifyWhatsnewpage() {
		whats.click();
		String expectedtitle = "What's New";
		String ActualTitle = driver.getTitle();
		if (ActualTitle.equals("What's New")) {
            System.out.println("Page title verified: " + driver.getTitle());
        } else {
            System.out.println("Page title verification failed. Expected: Magento Demo Store, Actual: " + driver.getTitle());
        }
	}

}