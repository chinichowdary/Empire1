package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Allcutsomers {
	@FindBy(xpath="//li[@class='treeview'][5]")
	WebElement Symbol;
	
	
	@FindBy(xpath = "//*[@id=\"sideBarMenu\"]/ul/li[6]/ul/li[1]/a")
	WebElement Allcustomers;
	
	
	@FindBy(xpath ="//i[@class='fa fa-plus']" )
	WebElement addnew;  
	
	@FindBy(xpath ="//input[@placeholder='Enter Customer Name']" )
	WebElement customername;
	
	@FindBy(xpath ="//input[@placeholder='Enter Mobile Number']")
	WebElement mobilenumber;
	
	@FindBy(xpath ="//input[@placeholder='Enter Email Id']" )
	WebElement emailid;
	
	
	@FindBy(xpath ="//input[@placeholder='Enter Whatsapp Number']")
	WebElement number;
	
	@FindBy(xpath ="//input[@placeholder='Enter Organigation Name']")
	WebElement organizationname;
	
	
	@FindBy(xpath ="//button[text()=' Save']")
	WebElement saveclick;

	
	public Allcutsomers(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void custdetails() throws Throwable
	{
		Symbol.click();
		Allcustomers.click();
		Thread.sleep(3000);
		addnew.click();
		customername.sendKeys("chinni");
		mobilenumber.sendKeys("9876543210");
		emailid.sendKeys("kalyani.marolix@gmail.com");
		number.sendKeys("9876543210");
		organizationname.sendKeys("marolix");
		Thread.sleep(2000);
		saveclick.click();
	}

}

