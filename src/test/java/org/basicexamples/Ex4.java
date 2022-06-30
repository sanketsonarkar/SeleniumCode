package org.basicexamples;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.lang.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtilities;
public class Ex4 {
	static WebDriver driver = null;
	public static void main(String[] args) {
		BaseUtilities bu = new BaseUtilities();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver = bu.StartUp("https://www.flipkart.com/", "CH");
//		driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("9923498080");
//		driver.findElement(By.cssSelector("input[class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("ritesh");
//		
		driver.findElement(By.cssSelector("._2KpZ6l _2doB4z")).click();
		driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("Samsumg Galaxy M20");
		//driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).sendKeys(Keys.ENTER);
		//System.out.println(driver.findElement(By.cssSelector("a[class*='_2Kfbh8']")).getAttribute("class"));
		
		
	}

}
