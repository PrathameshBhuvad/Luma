package Test_wishlistRemoveAdd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class wishlist {
	WebDriver driver;

	public wishlist(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchProduct() throws InterruptedException{
		driver.findElement(By.xpath("//a[@Class='logo']")).click();
		Thread.sleep(3000);
		WebElement searchInput = driver.findElement(By.xpath("//div[@class='field search']/child::div/child::input"));
		searchInput.clear();
		searchInput.sendKeys("Ingrid Running Jacket");
		//click on search button
		driver.findElement(By.xpath("//div[@class='actions']/button")).click();
		//click on product
		driver.findElement(By.xpath("//div[@class='products wrapper grid products-grid']/child::ol/li[1]")).click();
	}
	
	
	public void addProductToWishlist() {
		
	    List<WebElement> Plink = driver.findElements(By.tagName("a"));
	    System.out.println(Plink.size());
	    for (int i = 0; i < Plink.size(); i++) {
	        WebElement currentPLink = Plink.get(i);
	        String plinkname = currentPLink.getText();
	        if (plinkname.equals("Ingrid Running Jacket")) {
	            currentPLink.click();
	            break; // Exit the loop after clicking the desired link
	        }
	    }
	    JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//div[@Class='product-social-links']//child::a//child::span")).click();
	}
	
	public void removefromwishlist() throws InterruptedException {
		Thread.sleep(2000);
		WebElement logo = driver.findElement(By.xpath("//a[@Class='logo']"));
		logo.click();
		driver.findElement(By.xpath("//span[@class='customer-name']//child::button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='customer-menu']//child::ul//child::li[2]")).click();
		Thread.sleep(3000);
		WebElement delete = driver.findElement(By.xpath("//div[@class='products-grid wishlist']/child::ol/li"));
		Actions act = new Actions(driver);
		act.moveToElement(delete).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='product-item-inner']//child::div[3]//child::a[2]")).click();
		System.out.println("Product got deleted from the wishlist");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@Class='logo']")).click();
		Thread.sleep(3000);
	}
}
	
