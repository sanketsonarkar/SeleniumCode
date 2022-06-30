package org.generics;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaseUtilities;

public class Ex1 {
	static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		BaseUtilities bu = new BaseUtilities();
		driver= bu.StartUp("https://demoqa.com/tool-tips", "CH");
		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
		WebElement hvrbtn = driver.findElement(By.id("toolTipButton"));
		Actions act = new Actions(driver);
		act.moveToElement(hvrbtn).perform();
		Thread.sleep(2000);
		String tooltip = driver.findElement(By.cssSelector("div[class='tooltip-inner']")).getText();
		System.out.println(tooltip);
		WebElement hvrtxt = driver.findElement(By.id("toolTipTextField"));
		act.moveToElement(hvrtxt).perform();
		
		String tooltip1 = driver.findElement(By.className("tooltip-inner")).getText();
		System.out.println(tooltip1);
		
	}
		
}	