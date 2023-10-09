package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.util.Base;

public class CardComparisonPage extends Base{
	
  @FindBy(xpath="//button[text()=' Proceed ']")
 //@FindBy(xpath="//div[@class='add-bg container__bottom']/child::button")
  WebElement proceed;
 
 public  CommunicationScreen Cardcomparision()throws InterruptedException		 
 {
     Thread.sleep(12000); 

	 JavascriptExecutor js = (JavascriptExecutor)driver;
     //js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  js.executeScript("window.scrollBy(0,1200)");

     Thread.sleep(7000); 
     System.out.println("Card Comparision:: Proceed button is visible");

   proceed.click();
  Thread.sleep(5000);

 return new CommunicationScreen();

 }
}
