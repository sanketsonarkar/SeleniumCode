package org.basicexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtilities;

public class ActiTimeLogin {
	WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		ActiTimeLogin obj = new ActiTimeLogin();
		obj.ActiTimelogin1();
		Thread.sleep(3000);
		obj.ActiTimelogout1();
		
	}
	public void ActiTimelogin1 () {
		
		BaseUtilities bu = new BaseUtilities();
		driver=bu.StartUp("http://localhost/login.do", "CH");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
	}
	public void ActiTimelogout1 () {
		;
		driver.findElement(By.id("logoutLink")).click();
		driver.quit();
		
	}

}
