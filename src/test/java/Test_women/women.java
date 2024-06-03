package Test_women;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class women {

	WebDriver driver;

	public women(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}

	public void womenOptions() {
		WebElement women = driver.findElement(By.xpath("//a[@id='ui-id-4']"));
		Actions act = new Actions(driver);
		act.moveToElement(women).build().perform();

		List<WebElement> womenItems = driver
				.findElements(By.xpath("//div[@id='store.menu']/child::nav/child::ul/child::li[2]/child::ul"));

		// Print the women list of items
		System.out.println("List of items under the women icon:");
		for (WebElement item : womenItems) {
			System.out.println(item.getText());
		}
	}

	public void womenTopOptions() {

		WebElement top = driver.findElement(
				By.xpath("//div[@id='store.menu']/child::nav/child::ul/child::li[2]/child::ul/child::li/child::a[1]"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(top).build().perform();

		List<WebElement> topItems = driver.findElements(
				By.xpath("//div[@id='store.menu']/child::nav/child::ul/child::li[2]/child::ul/child::li[1]/child::ul"));

		// Print the women Top list of items
		System.out.println("List of items under the women Top Items:");
		for (WebElement item : topItems) {
			System.out.print(item.getText());

		}
	}

	public void testJacketsDisplayed() {

		driver.findElement(By.xpath("//div[@id='store.menu']/child::nav/child::ul/child::li[2]/child::ul/child::li[1]/child::ul/child::li[1]")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Jackets"));

		String pageTitle = driver.getTitle();
		if (pageTitle.contains("Jackets")) {
			System.out.println("Page title contains 'Jackets'");
		} else {
			System.out.println("Page title does not contain 'Jackets'");
		}
	}
}
