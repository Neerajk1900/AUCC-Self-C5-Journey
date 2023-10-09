package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Base;

public class CifSelectionPage extends Base {

	@FindBy(xpath="//mat-select[@formcontrolname='empType']")
	WebElement empType;
	
	@FindBy(xpath="//mat-select[contains(@formcontrolname,'empType')]")
	WebElement saldropdown ;
	
	@FindBy(xpath= "//span[normalize-space()='Salaried']")
	WebElement clickonsalaried;
	
   // @FindBy(xpath = "/html/body/app-root/div/app-cif-selection/div/div[3]/form/div/mat-radio-group/mat-radio-button/label/div[2]/div") 
	@FindBy(xpath="//div[@class='mat-radio-label-content']")  ////div[@class='address']
	WebElement cif;
 
    @FindBy(xpath = "//button[text()=' Next ']")
    WebElement next;
    
    
    public CifSelectionPage()
    {
        PageFactory.initElements(driver, this);
    }
    
     public String validateCifSelectionPageTitle1()
        {
            return driver.getTitle();
        }
    
    

    public BinScreen cifpage() throws InterruptedException 
    {
    	Thread.sleep(2000);
	    saldropdown.click();
		Thread.sleep(3000);
		clickonsalaried.click();
		Thread.sleep(5000);
        System.out.println("Employment Type : Salaried Selected"); 
    	
        cif.click();
        Thread.sleep(20000);  
        next.click();  
        Thread.sleep(7000);
        
        return new BinScreen();
    }
}
