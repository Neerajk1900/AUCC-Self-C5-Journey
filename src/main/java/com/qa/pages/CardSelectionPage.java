package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Base;

public class CardSelectionPage extends Base {

	@FindBy(xpath ="//button[@class='btn-filled']") 
	WebElement nextbutton;

	public CardSelectionPage()
	{
	    PageFactory.initElements(driver, this);
	}



	public SummaryScreenPage cardselect() throws InterruptedException {
	    Thread.sleep(2000);

		nextbutton.click();
	    Thread.sleep(5000);
	    return new SummaryScreenPage();
		
	}
	
}
