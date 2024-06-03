package test_FooterOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PrivacyCookiePolicy {
	WebDriver driver;

	public PrivacyCookiePolicy(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	public void Privacy_cookie_policy() throws InterruptedException {
		driver.findElement(By.xpath("//ul[@class='footer links']/child::li[2]/child::a")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		String Actitile = driver.getTitle();
		System.out.println(Actitile);
		System.out.println(driver.getCurrentUrl());
	}
}
