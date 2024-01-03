package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public class Login extends Testbase {

	@FindBy(xpath="//input[@type='text']")
	WebElement user;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement psd;
	
	@FindBy(xpath="//button[.='Login']")
	WebElement lgn;
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginsetup()
	{
		user.sendKeys(props.getProperty("username"));
		psd.sendKeys(props.getProperty("password"));
		lgn.click();
	}
}

