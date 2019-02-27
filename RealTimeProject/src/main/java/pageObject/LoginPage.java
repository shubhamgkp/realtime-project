package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.Page;

public class LoginPage extends Page{
	
	
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	public WebElement usrname;
	
	@FindBy(xpath="//input[@id='pass']")
	public WebElement pass;
	
	@FindBy(how=How.XPATH,using="//input[@type='submit']")
	public WebElement signin;
	
	public LoginPage(){
	
		PageFactory.initElements(driver,this);
	}
	
	public LandingPage doLogin(String uname,String passw)
	{
		usrname.sendKeys(uname);
		pass.sendKeys(passw);
		signin.click();
	
		return new LandingPage();
		
	}
	public void doSignUp()
	{
		
	}
	
	/*By usrname = By.xpath("//input[@id='email']");
	By  pass = By.xpath("//input[@id='pass']");
	By signin = By.xpath("//input[@type='submit']");
	*/
	/*public WebElement usrname(){
		return driver.findElement(usrname);	
	}
	
	public WebElement pass(){
		return driver.findElement(pass);		
	}
	
	public WebElement signin(){
		return driver.findElement(signin);
	}
*/
}
