package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Base;

public class SummaryScreenPage extends Base {

@FindBy(xpath="//button[@class='btn-filled']") 
WebElement okbutton;
    
    
    public SummaryScreenPage(){
        PageFactory.initElements(driver, this);
    }

    public void summary() throws InterruptedException
    {
        okbutton.click();
        Thread.sleep(8000);
    }
}
