package pageObject;

import base.Page;

public class LandingPage extends Page{


	public MyProfile gotoProfile()
	{
		
		tn.doLogout();
		return new MyProfile();
		
		
		
	}



}
