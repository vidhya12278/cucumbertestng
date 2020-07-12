package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Helperclass;

public class Loginpage extends Helperclass {
	public Loginpage()
	{
	PageFactory.initElements(driver,this);	
	}

	@FindBy(id="username")
	public WebElement user;

	@FindBy(id="password")
	public WebElement pass;

	//click login button
	@FindBy(id="login")
	public WebElement loginbutton;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
}
