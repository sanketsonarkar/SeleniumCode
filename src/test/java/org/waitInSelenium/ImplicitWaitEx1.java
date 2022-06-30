package org.waitInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtilities;

public class ImplicitWaitEx1 {
	static WebDriver driver=null;
	public static void main (String []args) {
		BaseUtilities bu = new BaseUtilities();
		driver= bu.StartUp("http://localhost/login.do", "CH");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		
		
		
	}

}
