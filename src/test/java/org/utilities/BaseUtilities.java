package org.utilities;


import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseUtilities {
	
	
	public static void main (String[] args) {

	}
		
	public WebDriver StartUp(String url,String Browser) {
		WebDriver driver = null;
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
		
		return driver;
	}

	public ArrayList<String> GetListFromSelect(WebElement ddlEle) {
		ArrayList<String> ar = new ArrayList<String>();
		Select sel = new Select(ddlEle);
		for(int i=0;i<sel.getOptions().size();i++) {
			ar.add(sel.getOptions().get(i).getText());
		}
		
	return ar;}
	 
	public void SelectTextByVisibleText (WebElement ddlEle, String Text) {
		Select sel = new Select(ddlEle);
		sel.selectByVisibleText(Text);
	}
	 
		public void SelectTextByValue (WebElement ddlEle, String Value) {
			Select sel = new Select(ddlEle);
			sel.selectByValue(Value);
		}
		 
		public void SelectTextByIndex (WebElement ddlEle, int Index) {
			Select sel = new Select(ddlEle);
			sel.selectByIndex(Index);
		}
		public void ElementToBeClickable(String Bytype,WebDriver driver, String loacator,long time) {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
			switch(Bytype) {
			case ("id"):wait.until(ExpectedConditions.elementToBeClickable(By.id(loacator)));
			break;
			case("css"):wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(loacator)));
			break;
			case("class"):wait.until(ExpectedConditions.elementToBeClickable(By.className(loacator)));
			break;
			case("name"):wait.until(ExpectedConditions.elementToBeClickable(By.name(loacator)));
			break;
			case("xpath"):wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loacator)));
			break;
			case("linktext"):wait.until(ExpectedConditions.elementToBeClickable(By.linkText(loacator)));
			break;
			case("tagname"):wait.until(ExpectedConditions.elementToBeClickable(By.tagName(loacator)));
			break;
			}
			
			
		}
}


