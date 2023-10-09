package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Base;

public class BinScreen extends Base{

	@FindBy(xpath="//input[@type='number'][1]") WebElement digit1;
	@FindBy(xpath="//input[@type='number'][2]") WebElement digit2;
	@FindBy(xpath="//input[@type='number'][3]") WebElement digit3;
	@FindBy(xpath="//input[@type='number'][4]") WebElement digit4;
	@FindBy(xpath="//input[@type='number'][5]") WebElement digit5;
	@FindBy(xpath="//input[@type='number'][6]") WebElement digit6;
	@FindBy(xpath="//button[@type='button']")
	WebElement next;      //button[text()='Next']
	
	 public BinScreen(){
	        PageFactory.initElements(driver, this);
	    }
	 
	 public  BinCardPage Entercardno(String bindigit1, String bindigit2,String bindigit3, String bindigit4,String bindigit5,String bindigit6) throws InterruptedException
	    {
	    digit1.sendKeys(bindigit1);
	    Thread.sleep(2000);
	    digit2.sendKeys(bindigit2);
	    Thread.sleep(2000);
	    digit3.sendKeys(bindigit3);
	    Thread.sleep(2000);
	    digit4.sendKeys(bindigit4);
	    Thread.sleep(2000);
	    digit5.sendKeys(bindigit5);
	    Thread.sleep(2000);
	    digit6.sendKeys(bindigit6);
	    Thread.sleep(2000);
	    next.click();
	    Thread.sleep(10000);
	   
	    return new BinCardPage();

	    }
}


