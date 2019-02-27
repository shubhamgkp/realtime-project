package academy;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import academy.BaseClass;
import pageObject.HomePage;

public class Home extends BaseClass{

	@Test
	public void home() throws IOException{

		driver = initializeDriver();	
		HomePage hp = new HomePage(driver);		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shu@gmail.com");
		Assert.assertTrue(hp.navMenu().isDisplayed());
	}	
}
