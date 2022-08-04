package org.basicexamples;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.lang.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.BaseUtilities;
public class Ex4 {
	static WebDriver driver = null;
	public static void main(String[] args) {
		BaseUtilities bu = new BaseUtilities();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver = bu.StartUp("https://www.flipkart.com/", "CH");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.flipkart.com/search?q=samsung+a53+6gb&otracker=AS_Query_HistoryAutoSuggest_3_0&otracker1=AS_Query_HistoryAutoSuggest_3_0&marketplace=FLIPKART&as-show=on&as=off&as-pos=3&as-type=HISTORY");
		driver.navigate().back();
		System.out.println(driver.getWindowHandle());
		Actions act = new Actions(driver);
		WebElement cross =driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		act.moveToElement(cross).click().perform();
//		driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("9923498080");
//		driver.findElement(By.cssSelector("input[class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("ritesh");
		
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//		driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("Samsumg Galaxy M20");
//		driver.findElement(By.cssSelector("button[type='submit']")).click();
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.elementToBeClickable(By.))
//		driver.findElement(By.cssSelector("button[type='submit']")).sendKeys(Keys.ENTER);
//		//System.out.println(driver.findElement(By.cssSelector("a[class*='_2Kfbh8']")).getAttribute("class"));
//		List<WebElement> a1 =driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
//		for (int i=0;i<a1.size();i++ ) {
//			System.out.println(a1.get(i).getText());
//			
//		}
//		
//	
	}

}
