package com.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Testbase;
import com.pages.Login;
import com.pages.Logout;

public class Logouttest extends Testbase{
	Login log;
	Logout lo;
	
	public Logouttest() 
	{
		super();
	}
	
	@BeforeMethod
	public void initialisation()
	{
		Setup();
		log=new Login(driver);
		lo=new Logout(driver);
	}
	
	@Test
	public void Logoutcheck() throws Throwable
	{
		log.loginsetup();
		Thread.sleep(2000);
		lo.logoutfunctionality();
	}

}

