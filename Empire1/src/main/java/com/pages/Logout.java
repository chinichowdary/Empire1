package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public class Logout extends Testbase {
	@FindBy(xpath="//a[@class='nav-link']")
	WebElement img;
	
	@FindBy(xpath="//a[@class='dropdown-item'][2]")
	WebElement signout;
	
	public Logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void logoutfunctionality()
	{
		img.click();
		signout.click();
	}

}

