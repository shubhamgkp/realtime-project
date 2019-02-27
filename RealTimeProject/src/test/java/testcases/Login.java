package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;

public class Login {
	
	@Test
	public void login()
	{
		//LoginPage lp=new LoginPage();
		//LandingPage lap=lp.doLogin("aaa@gmail.com","asasas");
	     new LoginPage().doLogin("asasa","asasasa").gotoProfile();
	     
	}

}
