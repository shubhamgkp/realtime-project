package academy;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import academy.BaseClass;
import pageObject.LandingPage;


public class Home extends BaseClass{

	@Test
	public void home() throws IOException{
			
		driver.get("http://qaclickacademy.com/index.php");	
		
		LandingPage lp = new LandingPage(driver);
		lp.getLogin();		
	}	
}
