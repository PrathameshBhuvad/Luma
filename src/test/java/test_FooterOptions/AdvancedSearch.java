package test_FooterOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AdvancedSearch {
	WebDriver driver;

	public AdvancedSearch(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	public void Advanced_Search() throws InterruptedException {
		driver.findElement(By.xpath("//ul[@class='footer links']/child::li[3]/child::a")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.id("sku")).sendKeys("24-UG06");
		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div/button")).click();
		String Actitile = driver.getTitle();
		System.out.println(Actitile);
		System.out.println(driver.getCurrentUrl());
	}
}
