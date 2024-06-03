package test_FooterOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class searchitem {
	WebDriver driver;

	public searchitem(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}

	public void Clickon_searchitem() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//ul[@class='footer links']/child::li/child::a")).click();
		driver.findElement(By.xpath("//ul[@class='search-terms']/child::li[30]/child::a")).click();
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("window.scrollBy(0,1000)");
		String Actitile = driver.getTitle();
		System.out.println(Actitile);
		System.out.println(driver.getCurrentUrl());
		}
	
}

