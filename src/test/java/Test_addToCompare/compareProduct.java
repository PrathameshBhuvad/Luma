package Test_addToCompare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class compareProduct {
	WebDriver driver;

	public compareProduct(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}

	public void FindingProduct() {
		WebElement women = driver.findElement(By.xpath("//a[@id='ui-id-4']"));
		Actions act = new Actions(driver);
		act.moveToElement(women).build().perform();

		WebElement top = driver.findElement(
				By.xpath("//div[@id='store.menu']/child::nav/child::ul/child::li[2]/child::ul/child::li/child::a[1]"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(top).build().perform();

		driver.findElement(By.xpath(
				"//div[@id='store.menu']/child::nav/child::ul/child::li[2]/child::ul/child::li[1]/child::ul/child::li[2]"))
				.click();
	}

	public void selectProducts() throws InterruptedException {
		// select product 1st and add to cart
		WebElement Product1 = driver
				.findElement(By.xpath("//div[@class='products wrapper grid products-grid']/child::ol/li[1]"));
		Actions act2 = new Actions(driver);
		act2.moveToElement(Product1).build().perform();

		driver.findElement(By.xpath("//div[@class='product actions product-item-actions']/child::div[2]/a[2]")).click();

		Thread.sleep(3000);

		// select product 2nd and add to cart
		WebElement Product2 = driver
				.findElement(By.xpath("//div[@class='products wrapper grid products-grid']/child::ol/li[2]"));
		Actions act3 = new Actions(driver);
		act3.moveToElement(Product2).build().perform();

		driver.findElement(By.xpath(
				"//div[@class='products wrapper grid products-grid']/child::ol/li[2]/div/div/div[3]/div/div[2]/a[2]"))
				.click();

		Thread.sleep(3000);

	}
	public void compare() {
		// click on comaperProduct
		driver.findElement(By.xpath("//ul[@class='compare wrapper']")).click();
		
		//verify Compare Products Page
		String expectedtitle = "Products Comparison List - Magento Commerce";
		String ActualTitle = driver.getTitle();

		Assert.assertEquals(ActualTitle, expectedtitle);
		
		 if (ActualTitle.equals("Products Comparison List - Magento Commerce")) {
	            System.out.println("Page title verified: " + ActualTitle);
	            System.out.println("Products add in comapre list successfully.");
	        } else {
	            System.out.println("Page title verification failed. Expected: Magento Demo Store, Actual: " + ActualTitle);
	            System.out.println("Products failed to add in comapre list");
	        }
	}
}
