package org.generics;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaseUtilities;

public class Ex3 {
	static WebDriver driver=null;
	public static void main(String[] args) {
		BaseUtilities bu = new BaseUtilities();
		driver= bu.StartUp("https://demoqa.com/droppable", "CH");
		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement des = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		//act.dragAndDrop(src, des).perform();
		act.moveToElement(src).clickAndHold().moveByOffset(250, 50).release().build().perform();
		
	
	}
	
	

}
