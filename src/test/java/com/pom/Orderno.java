package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Helperclass;

public class Orderno extends Helperclass{
	public Orderno()
	{
	PageFactory.initElements(driver, this);	
	}

	@FindBy(id="order_no")
	private WebElement order;



	public WebElement getOrder() {
		return order;
	}
}
