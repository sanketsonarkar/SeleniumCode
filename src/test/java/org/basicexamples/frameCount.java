package org.basicexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utilities.BaseUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frameCount {
	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		List<WebElement> frames =driver.findElements(By.cssSelector("iframe[id^='frame']"));
		System.out.println(frames.size());
	}

}
