package org.basicexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Ex2 {
	WebDriver driver;
	
	public static void main (String[] args) {
		Ex2 obj =new Ex2();
		obj.StartUp("https://www.youtube.com/", "FF");
		
	}
		
	public void StartUp(String url,String Browser) {	
		if (Browser.equalsIgnoreCase("CH")){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if (Browser.equalsIgnoreCase("FF")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else {
			System.out.println("invalid browser");
		}
			
		driver.manage().window().maximize();
		driver.get(url);
		
	}

}
