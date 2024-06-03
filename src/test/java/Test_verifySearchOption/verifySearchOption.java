package Test_verifySearchOption;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class verifySearchOption {
	WebDriver driver;
	WebElement searchInput;

	public verifySearchOption(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}

	public void verifySearch() {
		WebElement searchInput = driver.findElement(By.xpath("//div[@class='field search']"));

		// Verify search option is present
		if (searchInput.isDisplayed()) {
			System.out.println("Search option is present.");
		} else {
			System.out.println("Search option is not present.");
		}
	}

	public void Searchwatermark() {

		WebElement searchInput = driver.findElement(By.id("search"));
		String watermark = searchInput.getAttribute("placeholder");

		if (watermark != null && watermark.toLowerCase().contains("search")) {
			System.out.println("Search watermark is present: " + watermark);
		} else {
			System.out.println("Search watermark is not present or doesn't contain expected text.");
		}
	}
}
