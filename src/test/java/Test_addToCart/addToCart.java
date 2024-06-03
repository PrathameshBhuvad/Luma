package Test_addToCart;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class addToCart {

	WebDriver driver;

	public addToCart(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}

	public void gearOption() {
		WebElement gear = driver.findElement(By.xpath("//a[@id='ui-id-6']"));
		Actions act = new Actions(driver);
		act.moveToElement(gear).build().perform();

		// select option bag
		driver.findElement(By.xpath("//a[@id='ui-id-25']")).click();
		String pageTitle = driver.getTitle();
		// verify page title as a bag
		if (pageTitle.contains("Bags")) {
			System.out.println("Page title contains 'Bags'");
		} else {
			System.out.println("Page title does not contain 'Bags'");
		}
	}

	public void addInCart() throws InterruptedException {
		// select a product
		driver.findElement(By.linkText("Push It Messenger Bag")).click();
		// Adding product in cart
		driver.findElement(By.xpath("//button[@class='action primary tocart']")).click();
		Thread.sleep(4000);
		// click on add to cart
		driver.findElement(By.xpath("//a[@class='action showcart']")).click();
		// click on view cart
		driver.findElement(By.xpath("//div[@id=\"minicart-content-wrapper\"]/div[2]/div[5]/div/a")).click();
		// verifing item added in cart
		WebElement cartItemList = driver
				.findElement(By.xpath("//table[@id=\"shopping-cart-table\"]/tbody/tr[1]/td[1]/div/strong"));
		String cartContent = cartItemList.getText();
		if (cartContent.contains("Push It Messenger Bag")) {
			System.out.println("Item has been successfully added to the cart.");
		} else {
			System.out.println("Item is not listed in the cart.");
		}
	}

	public void proceedToCheckout() throws InterruptedException {
		// click on checkout button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='cart-container']/child::div/child::ul/child::li/child::button"))
				.click();
		Thread.sleep(5000);
		System.out.println("proceed To Checkout");
	}

	// fill up form
	public void fillUpform() throws InterruptedException {
		
		try {
			WebElement newAddBTN=driver.findElement(By.xpath("//div[@class='new-address-popup']/child::button"));
			if(newAddBTN.isDisplayed())
			{
				newAddBTN.click();
				Thread.sleep(2000);
			}
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		WebElement firstNameInput = driver
				.findElement(By.xpath("//div[@id='shipping-new-address-form']/child::div[1]/child::div/child::input"));
		firstNameInput.clear();
		firstNameInput.sendKeys("Prathamesh");

		WebElement lastNameInput = driver
				.findElement(By.xpath("//div[@id='shipping-new-address-form']/child::div[2]/child::div/child::input"));
		lastNameInput.clear();
		lastNameInput.sendKeys("Bhuvad");

		WebElement companyInput = driver
				.findElement(By.xpath("//div[@id='shipping-new-address-form']/child::div[3]/child::div/child::input"));
		companyInput.clear();
		companyInput.sendKeys("ExcleR");

		WebElement streetInput = driver.findElement(By.xpath(
				"//div[@id='shipping-new-address-form']/child::fieldset/child::div/child::div/child::div/child::input"));
		streetInput.clear();
		streetInput.sendKeys("ABC Street");

		WebElement cityInput = driver
				.findElement(By.xpath("//div[@id='shipping-new-address-form']/child::div[4]/child::div/child::input"));
		cityInput.clear();
		cityInput.sendKeys("Mumbai");
		
		WebElement countryDropdown = driver.findElement(By.xpath("//div[@id='shipping-new-address-form']/child::div[8]/child::div/child::select"));
		countryDropdown.click();
		Select droplist = new Select(countryDropdown);
		droplist.selectByVisibleText("India");

		WebElement regionDropdown = driver
				.findElement(By.xpath("//div[@id='shipping-new-address-form']/child::div[5]/child::div/child::select"));
		regionDropdown.click();
		Select Dropdown = new Select(regionDropdown);
		Dropdown.selectByVisibleText("Maharashtra");

        WebElement postcodeInput = driver.findElement(By.xpath("//div[@id='shipping-new-address-form']/child::div[7]/child::div/child::input"));
        postcodeInput.clear();
        postcodeInput.sendKeys("400001");


        WebElement telephoneInput = driver.findElement(By.xpath("//div[@id='shipping-new-address-form']/child::div[9]/child::div/child::input"));
        telephoneInput.clear();
        telephoneInput.sendKeys("0789456123");
        
        Thread.sleep(5000);
        // click to next button 
        try {
        	driver.findElement(By.xpath("//button[contains(@class,'action primary action-save-address')]")).click();
        	Thread.sleep(2000);
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
        
        driver.findElement(By.xpath("//button[@class='button action continue primary']")).click();
        Thread.sleep(5000);
        //click on place order
        driver.findElement(By.xpath("//button[@class='action primary checkout']")).click();
        
        Thread.sleep(5000);
         
	}
	
	public void Screenshot() throws IOException, InterruptedException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Selenium\\Screenshot\\Screeshot.png");
		FileHandler.copy(src, dest);
		
		Thread.sleep(4000);
		//click on Continue Shopping
		driver.findElement(By.xpath("//a[@class='action primary continue']")).click();
	}
}
