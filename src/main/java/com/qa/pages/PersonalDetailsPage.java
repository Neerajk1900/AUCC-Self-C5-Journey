package com.qa.pages;

import com.qa.util.Base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	


	public class PersonalDetailsPage extends Base {

	    
		@FindBy(xpath="//mat-select[@formcontrolname='nameCC']")
		WebElement clickoncarddropdown;
		
		@FindBy(xpath="//span[text()=' FARHAN S QURESHI ']")
		WebElement nameselect;
		
		@FindBy(xpath="//input[@formcontrolname='motherName']")
		WebElement mothersname;
		
		@FindBy(xpath="//input[@formcontrolname='personalEmail']")
		WebElement mailid;
		
		@FindBy(xpath="//button[text()=' Next ']")
		WebElement clickonnext;
	        

	     public PersonalDetailsPage()
	        {
	            PageFactory.initElements(driver, this);
	        }
	     public String validatePersonalDetailPageTitle1()
	        {
	            return driver.getTitle();
	        }
	     
	      public  EmployeeDetailsPage PersonalDetail() throws InterruptedException
	        {
	          Thread.sleep(5000);

	    	  clickoncarddropdown.click();
	          Thread.sleep(2000);
	          
	          nameselect.click();
	          Thread.sleep(2000);

	        /* List<WebElement> nametypes=driver.findElements(By.xpath("//mat-option[@role='option']"));
	          
	         for(WebElement ntype:nametypes)
	         {
	             if(ntype.getText().equals("FARHAN S QURESHI"))
	             {
	                 ntype.click();
	                 break;
	             }
	         }
	         Thread.sleep(5000); */
	        
	          mothersname.sendKeys("Kunj");
	         Thread.sleep(2000);
	         
	        // mailid.sendKeys("Neeraj.kishore@decimal.co.in");
	         //Thread.sleep(10000);
	        
	         clickonnext.click();
	         Thread.sleep(10000);
	        
	        return new EmployeeDetailsPage();
	        
	        }
	     

	}

