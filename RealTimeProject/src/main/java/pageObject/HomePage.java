package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import academy.BaseClass;

public class HomePage extends BaseClass{

	public WebDriver driver;
	By text = By.xpath("//div[@class='mbs _52lq fsl fwb fcb']");
	By navMenu = By.cssSelector("ul[class='nav.navbar-nav.navbar-right']");

	public HomePage(WebDriver driver){
		this.driver=driver;		
	}
	public WebElement textCheck(){

		return driver.findElement(text);			
	}	
	
	public WebElement navMenu(){
		return driver.findElement(navMenu);
	}
}
