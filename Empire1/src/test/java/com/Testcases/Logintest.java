package com.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Testbase;
import com.pages.Login;

public class Logintest extends Testbase {

	Login log;
	public Logintest()
	{
		super();
	}
	@BeforeMethod
	public void initialisation()
	{
		Setup();
		log=new Login(driver);
	}
	@Test
	public void validlogin()
	{
		log.loginsetup();
	}
}

