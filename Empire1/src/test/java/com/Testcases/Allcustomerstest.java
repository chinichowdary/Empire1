package com.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Testbase;
import com.pages.Allcutsomers;
import com.pages.Login;
import com.pages.Logout;

public class Allcustomerstest extends Testbase {
    Login log;
    Allcutsomers Ac;
    Logout lo;
    
    public Allcustomerstest()
    {
		super();
	 }
    
    @BeforeMethod
    public void initialisation()
    {
   	 Setup();
   	 log=new Login(driver);
   	 Ac=new Allcutsomers(driver);
   	 lo=new Logout(driver);
   	 log.loginsetup();
    }
    @Test
    public void addcustomer() throws Throwable
    {
   	 Thread.sleep(2000);
   	 Ac.custdetails();
    }
    @AfterMethod
    public void closee() throws Throwable
    {
   	 Thread.sleep(2000);
   	 lo.logoutfunctionality();
   	// Thread.sleep(5000);
   	 //driver.close();
    }
}
