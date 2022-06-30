package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.utilities.BaseUtilities;

import Pages.loginpage;

public class loginCases {
	WebDriver driver;
	
  @BeforeSuite
  public void Startup() {
	 ;
	  BaseUtilities bu= new BaseUtilities();
	  driver=bu.StartUp("http://localhost/login.do", "CH");
	  
	  
  }
  
 @Test
 public void login() {
	 loginpage obj = new loginpage(driver);
	 obj.enterUserName();
	 obj.enterPassword();
	 obj.clickLoginBtn();
	 
 }
 
}
