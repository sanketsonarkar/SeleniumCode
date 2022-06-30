package org.selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtilities;

public class SelectClassEx1 {
	static WebDriver driver = null;
public static void main (String[] args) {
	
	BaseUtilities bu = new BaseUtilities();
	driver = bu.StartUp("https://demoqa.com/select-menu", "CH");
	driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
	WebElement colourDDL = driver.findElement(By.id("oldSelectMenu"));
	Select sel = new Select(colourDDL);
//	WebElement selectedoption = sel.getFirstSelectedOption();
	System.out.println(sel.getFirstSelectedOption().getText());
	sel.selectByVisibleText("Black");
	List<WebElement> alloptions = sel.getOptions();
	for(int i=0;i<alloptions.size();i++) {
		System.out.println(alloptions.get(i).getText());
	}
	

	
	
}
}
