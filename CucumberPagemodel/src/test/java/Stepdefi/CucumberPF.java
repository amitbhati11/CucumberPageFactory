package Stepdefi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.Home;
import PageFactory.loginpage_PF;
import io.cucumber.java.en.*;

public class CucumberPF {
	
	WebDriver driver ;
	//object for another class
	
	loginpage_PF lgn;
	
	Home hm;

	
	@Given("open browser")
	public void open_browser() {
   String drpath="C:\\Users\\Admin_SRV\\eclipse-workspace\\CucumberPagemodel\\src\\test\\resources\\drivers\\chromedriver.exe";
   
   System.setProperty("webdriver.chrome.driver",drpath);
   
       driver=new ChromeDriver();
       
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@And("^enter url and enter (.*) and (.*)$")
	public void enter_url_and_enter_username_and_password(String username,String password) throws InterruptedException {
	    
		driver.get("https://example.testproject.io/web/");
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		lgn=new loginpage_PF(driver);
	
		
		lgn.us_nm(username);
		lgn.us_pwd(password);
		
		Thread.sleep(3000);
		
		
	}

	@When("click on login btn")
	public void click_on_login_btn() {
	   lgn.us_login();
		
	}

	@Then("navigate to home page")
	public void navigate_to_home_page() throws InterruptedException {
		hm=new Home(driver);
		hm.displayedlogout();
		
		Thread.sleep(3000);
		
		driver.quit();
		driver.close();
	    
		
	}


}
