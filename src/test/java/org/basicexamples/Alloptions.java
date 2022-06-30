package org.basicexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtilities;
//css-26l3qy-menu
public class Alloptions {
	static WebDriver driver = null;
	public static void main(String[] args) {
		BaseUtilities bu = new BaseUtilities();
		driver= bu.StartUp("https://demoqa.com/select-menu", "CH");
		driver.findElement(By.id("selectOne")).click();
		
		List<WebElement> allops = driver.findElements(By.className("css-26l3qy-menu"));
		
		for(int i=0;i< allops.size();i++) {
			 
			System.out.println(allops.get(i).getText());
		}
		
		
		

	}

}
