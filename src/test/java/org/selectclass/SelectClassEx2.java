package org.selectclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtilities;

public class SelectClassEx2 {
	static WebDriver driver = null;
public static void main (String[] args) {
	
	BaseUtilities bu = new BaseUtilities();
	driver = bu.StartUp("https://demoqa.com/select-menu", "CH");
	driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
	WebElement colourDDL = driver.findElement(By.id("oldSelectMenu"));
	Select sel = new Select(colourDDL);
//	WebElement selectedoption = sel.getFirstSelectedOption();
//	System.out.println(sel.getFirstSelectedOption().getText());
//	sel.selectByVisibleText("Black");
	SelectClassEx2 obj = new SelectClassEx2 ();
	
	System.out.println(	obj.GetListFromSelect(colourDDL));
	
//	List<WebElement> alloptions = sel.getOptions();
//
//	for(int i=0;i<alloptions.size();i++) {
//		System.out.println(alloptions.get(i).getText());
//		
//	}
	
	
}
	public ArrayList<String> GetListFromSelect(WebElement ddlele) {
		ArrayList<String> ar = new ArrayList<String>();
		Select sel = new Select(ddlele);
		for(int i=0;i<sel.getOptions().size();i++) {
			ar.add(sel.getOptions().get(i).getText());
		}
		Collections.sort(ar);

	return ar;}

}
