package academy;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LoginPage;

public class Login extends BaseClass {
	
	@Test(dataProvider="dataDriving")
	public void fblogin(String uname, String pwd) throws IOException{

		driver = initializeDriver();
		LoginPage lp = new LoginPage(driver);
		lp.usrname().sendKeys(uname);
		lp.pass().sendKeys(pwd);
		lp.signin().click();		
	}
	
	@DataProvider
	public Object[][] dataDriving(){
		
		Object[][] data = new Object[2][2];
		data[0][0] = "shubhamcert@gmail.com";
		data[0][1] = "Skv@2580";
		data[1][0] = "shubhamgkp2";
		data[1][1] = "George@2580";
 		return data;
	}
}
