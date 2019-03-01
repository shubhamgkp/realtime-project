package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {

	public WebDriver driver;
	@FindBy(xpath="//span[text()='Login']")
	WebElement clickLogin;
	
	public LandingPage(WebDriver driver){
		
		this.driver=driver;
	}
	
	public void getLogin(){
		
		clickLogin.click();
	}
}
