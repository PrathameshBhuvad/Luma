package Test_SalePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SalePage {
	WebDriver driver;

	public SalePage(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Sale")
	WebElement sl;

	public void clickOnSale() {
		sl.click();
	}

	public void VerifySalepage() {
		String expectedtitle = "Sale";
		String ActualTitle = driver.getTitle();
		if(driver.getTitle().contains(expectedtitle) ) {
			System.out.println("sale page verified!");
		}else {
			System.out.println("sale page not verified!");
		}

	}

}
