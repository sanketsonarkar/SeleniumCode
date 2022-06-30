package org.basicexamples;

import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {
	public static void main (String[] args) {
		String path= System.getProperty("user.dir");
		System.out.println(path);
		//String BrowserName="CH";
		System.setProperty("webdriver.chrome.driver", path+"\\BrowserDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://youtube.com/");
		driver.manage().window().minimize();
		 
		
		
		
		
		
		
	}

}
