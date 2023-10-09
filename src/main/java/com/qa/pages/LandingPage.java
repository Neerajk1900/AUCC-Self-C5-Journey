package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Base;

public class LandingPage extends Base {
	
	 //Initializing the Page Objects:
     public LandingPage()
     {
        PageFactory.initElements(driver, this);
     }

	@FindBy(xpath="//input[@id='mat-input-0']")  // enter mobile no
	WebElement mobileno;
	
	@FindBy(xpath="//div[@class='mat-checkbox-inner-container']")
	WebElement loginchkbox;
	
	@FindBy(xpath="//button[text()=' Get OTP ']")
	WebElement getotpbtn;
	
	@FindBy(xpath="//input[starts-with(@id,'otp')][1]")  // OTP-1
	WebElement otp1;
	
	@FindBy(xpath="//input[starts-with(@id,'otp')][2]")  // OTP-2
	WebElement otp2;
	@FindBy(xpath="//input[starts-with(@id,'otp')][3]")  // OTP-3
	WebElement otp3;
	
	@FindBy(xpath="//input[starts-with(@id,'otp')][4]")  // OTP-4
	WebElement otp4;
	@FindBy(xpath="//input[starts-with(@id,'otp')][5]")  // OTP-5
	WebElement otp5;
	
	@FindBy(xpath="//input[starts-with(@id,'otp')][6]")  // OTP-6
	WebElement otp6;
	
	@FindBy(xpath="//input[@id='mat-input-2']")
	WebElement panno;
	
	@FindBy(xpath="//button[text()=' Proceed ']")
	WebElement clickonproceedbtn;
	
	@FindBy(xpath= "//div[starts-with(text(),'CS')]")
	WebElement leadid;
	
	

	    public  CifSelectionPage login(String mobile, String Pan) throws InterruptedException
	    {
	    	//Thread.sleep(3000);		 
			mobileno.sendKeys(mobile);			
			Thread.sleep(2000);
			loginchkbox.click();
			
			getotpbtn.click();
			Thread.sleep(7000);
			
			otp1.click(); otp1.sendKeys("1");
			Thread.sleep(1000);
			System.out.println("a");
			
			otp2.click(); otp2.sendKeys("2");
			Thread.sleep(1000);
			System.out.println("b");
			
			otp3.click(); otp3.sendKeys("3");
			Thread.sleep(1000);
			System.out.println("c");
			
			otp4.click(); otp4.sendKeys("4");
			Thread.sleep(1000);
			System.out.println("D");
			
			otp5.click(); otp5.sendKeys("5");
			Thread.sleep(1000);
			System.out.println("E");
			
			otp6.click(); otp6.sendKeys("6");
			Thread.sleep(1000);
			System.out.println("F");
			
			panno.sendKeys(Pan);
			Thread.sleep(3000);

			clickonproceedbtn.click();
			Thread.sleep(1000);

			String Leadid = leadid.getText();			
			Thread.sleep(7000);
		    System.out.println(" Leadid : " + Leadid);
	        return new CifSelectionPage();

	    }
}
