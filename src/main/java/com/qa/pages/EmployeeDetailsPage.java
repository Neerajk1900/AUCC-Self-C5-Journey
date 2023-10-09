package com.qa.pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.Base;


public class EmployeeDetailsPage extends Base{
	
	@FindBy(xpath="//input[@formcontrolname='companyName']")
	WebElement companyname;
	@FindBy(xpath="(//mat-option[@role='option'])[2]")
	WebElement dropdown2;
	
	@FindBy(xpath="//input[@formcontrolname='designation']")
	WebElement designation;
	@FindBy(xpath="//input[@formcontrolname='monthlySalary']")
	WebElement monthlySalary;
	
    @FindBy(xpath="//input[@formcontrolname='address1']")
    WebElement addressline1;
    @FindBy(xpath="//input[@formcontrolname='address2']")
    WebElement addressline2;
    @FindBy(xpath="//input[@formcontrolname='pin']")
    WebElement pincode;
    
   
    @FindBy(xpath="//div[@class='mat-checkbox-inner-container']")
    WebElement chktermcondition;
    @FindBy(xpath="//button[normalize-space()='Next']")
    WebElement nextbutton;  
    
     public EmployeeDetailsPage()
        {
            PageFactory.initElements(driver, this);
        }
    
    
    public CardSelectionPage employeedetail(String Designation, String Monthlysalary, String Address1, String Address2) throws InterruptedException
    {   
    	Thread.sleep(5000);
    	companyname.click();
        Thread.sleep(2000);

    	dropdown2.click();        
         Thread.sleep(2000);
         
        designation.sendKeys(Designation);
        Thread.sleep(2000);
        monthlySalary.sendKeys(Monthlysalary);
        Thread.sleep(2000);
        addressline1.sendKeys(Address1);
        Thread.sleep(2000);
        addressline2.sendKeys(Address2);
        Thread.sleep(2000);
        pincode.sendKeys("122003");
        Thread.sleep(7000);
       
        chktermcondition.click();
        Thread.sleep(2000);
        nextbutton.click();
        Thread.sleep(10000);
        return new CardSelectionPage();
    }

}
