package test_FooterOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WriteForUs {
	WebDriver driver;

	public WriteForUs(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	public void Write_for_us() throws InterruptedException {
		String mainWindowHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//div[@class='links']/child::div/child::ul/child::li[3]/child::a")).click();
		for (String handle : driver.getWindowHandles()) {
		    if (!handle.equals(mainWindowHandle)) {
		        driver.switchTo().window(handle);
		        break;
		    }
		}
		Thread.sleep(3000);
		String Actitile = driver.getTitle();
		System.out.println(Actitile);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(mainWindowHandle);
	}

}
