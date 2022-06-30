package org.fileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtilities;

public class Sikuliex1 {
	static WebDriver driver =null;
	public static void main(String[] args) {
		BaseUtilities bu = new BaseUtilities();
		driver= bu.StartUp("https://demoqa.com/automation-practice-form", "CH");
		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
		
		WebElement ele = driver.findElement(By.id("uploadPicture"));
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		js.executeScript("arguments[0].click();", ele);
		
		
		
		
		

	}

}
