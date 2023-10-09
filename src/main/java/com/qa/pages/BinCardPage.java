package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Base;

public class BinCardPage extends Base {

	
	@FindBy(xpath="//div[contains(@class,'mat-select-arrow-wrapper')]")
	WebElement clickoncarddropdown;
	//@FindBy(xpath="//span[contains(text(),'My Zone Easy Credit Card')]")
	//WebElement clickoncard;
	
	@FindBy(xpath="//div[@class='mat-checkbox-inner-container']")
	WebElement checkbox;
	@FindBy(xpath="//div[@id='swipeUp']")
	WebElement swipeup;
	
	public BinCardPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public  CardComparisonPage bincard( String bincardname) throws InterruptedException
    {
		clickoncarddropdown.click();
 
		//clickoncard.click();
    List<WebElement> cnametypes=driver.findElements(By.xpath("//span[contains(text(),'Axis Bank My Zone Easy Credit Card ')]"));
    
    for(WebElement cntype:cnametypes)
    {
        if(cntype.getText().equals(bincardname))
        {
            cntype.click();
            break;
        }
    }
    Thread.sleep(5000); 
    
    checkbox.click();
    Thread.sleep(2000);
    
    swipeup.click();
    Thread.sleep(10000);
   
    return new CardComparisonPage();

    }
}
