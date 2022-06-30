package org.generics;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtilities;

public class Ex2 {
	static WebDriver driver=null;
	public static void main(String[] args) {
		BaseUtilities bu = new BaseUtilities();
		driver= bu.StartUp("https://demoqa.com/browser-windows", "CH");
		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
		driver.findElement(By.id("tabButton")).click();
		String ParentId = driver.getWindowHandle();
		Set<String> allwinid= driver.getWindowHandles();
		for(String str:allwinid) {
			System.out.println(str);
		}
		Iterator<String> itr = allwinid.iterator();
		String winid ="";
		String text = "";
		while(itr.hasNext()) {
			winid = itr.next();
			if(!winid.equals(ParentId)) {
				driver.switchTo().window(winid);
				List<WebElement> ar = driver.findElements(By.id("sampleHeading"));
				if(!ar.isEmpty()) {
					text= ar.get(0).getText();
				}
				System.out.println(text);
				
			}
		}
		
		
		
	
	}
	
	

}
