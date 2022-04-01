package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage_PF {
	
	WebDriver driver;
	
	@FindBy(id="name")
	WebElement us_nm;
	
	@FindBy(id="password")
	WebElement us_pwd;
	
	@FindBy(id="login")
	WebElement us_login;
	
	//constructor
	
	public loginpage_PF(WebDriver driver){
		
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
		
		
	}
	
	public void us_nm(String username) {
		us_nm.sendKeys(username);
	}
	
	public void us_pwd(String password) {
		
		us_pwd.sendKeys(password);
	}
	
	
	public void us_login() {
		us_login.click();
	}

}
