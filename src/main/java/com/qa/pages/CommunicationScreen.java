package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Base;

public class CommunicationScreen extends Base{

@FindBy(xpath="//div[@class='address']") 
WebElement clickonaddress;
	
@FindBy(xpath="//button[text()=' Next ']")
WebElement next;

public CommunicationScreen()
{
    PageFactory.initElements(driver, this);
}

 public String validateCommunicationScreenTitle1()
    {
        return driver.getTitle();
    }
 
 public PersonalDetailsPage address() throws InterruptedException
 {    
	 clickonaddress.click();
     Thread.sleep(1000);
       
     next.click();  
     Thread.sleep(5000);
     
     return new PersonalDetailsPage();
 }

 

}
