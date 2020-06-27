package zreoBankPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
/////// Object Identification 
	
	@FindBy(id = "user_login") WebElement UserName;
	@FindBy(id ="user_password") WebElement Password;
	@FindBy(name ="submit") WebElement SubmitButton;
	@FindBy(id = "user_remember_me") WebElement RememberMe;
	
/////// Enter User Name
	public void enterUserName(String strUserName) {
		UserName.sendKeys(strUserName);
	}
/////// Enter Password	
	public void enterPassword(String strPassword) {
		Password.sendKeys(strPassword);
	}
/////// Click On Login Button
	public void clickOnLoginButton() {
		SubmitButton.click();
	}
/////// Click On RememberMe Radio Button
	public void rememberMe() {
		RememberMe.click();
	}
	
}
