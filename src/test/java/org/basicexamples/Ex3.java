package org.basicexamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtilities;
public class Ex3 {
	static WebDriver driver = null;
	public static void main(String[] args) {
		BaseUtilities bu = new BaseUtilities();
		driver = bu.StartUp("https://demoqa.com/", "CH");
		WebElement ele = driver.findElement(By.xpath("//div[@class='card mt-4 top-card'][1]"));
		ele.click();
		
		
		
	}

}
