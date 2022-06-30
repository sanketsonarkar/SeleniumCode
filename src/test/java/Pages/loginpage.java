package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//page locators
public class loginpage {
	WebDriver driver;
@FindBy(css="headerContainer")
private WebElement loginHeaderLabel;

@FindBy(id="username")
private WebElement userNameField;

@FindBy(xpath="//input[@name='pwd']")
private WebElement passwordField;

@FindBy(id="loginButton")
private WebElement loginButton;
//Constructor

public loginpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
//page methods
public void enterUserName() {
	userNameField.sendKeys("admin");
}
public void enterPassword() {
	passwordField.sendKeys("manager");
	
}
public void clickLoginBtn() {
	loginButton.click();
}
}
