package com.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pages.BinCardPage;
import com.qa.pages.BinScreen;
import com.qa.pages.CifSelectionPage;
import com.qa.pages.LandingPage;
import com.qa.util.Base;
import com.qa.util.JiraPolicy;

public class BinScreenTest extends Base {

	LandingPage landingpage;
	CifSelectionPage cifselectionpage;
	BinScreen binscreen;
	BinCardPage bincardpage;
	
	
	 public BinScreenTest(){
	        super();
	    }
	    
	    public WebDriver driver;
	    
	    @BeforeClass
	    public void setup() 
	    {	        
	    driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));	 
	    }
	    
	    @JiraPolicy(logTicketReady=true)    
	    @Test(priority=1, enabled=true)
	    public void loginTest() throws InterruptedException
	    {	        
	        landingpage = new LandingPage();
	        cifselectionpage=landingpage.login(prop.getProperty("mobile"),prop.getProperty("Pan"));       
	    }
	    
	    @JiraPolicy(logTicketReady=true)    
	    @Test(priority=2, enabled=true)
	    public void cifTest() throws InterruptedException
	    {
	    	cifselectionpage = new CifSelectionPage();
	    	binscreen=cifselectionpage.cifpage();       	        
	    }
	    
	    @JiraPolicy(logTicketReady=true)    
	    @Test(priority=3, enabled=true)
	    public void binTest() throws InterruptedException
	    {
	    	binscreen =new BinScreen();
	    	bincardpage=binscreen.Entercardno(prop.getProperty("bindigit1"), prop.getProperty("bindigit2"), prop.getProperty("bindigit3"), prop.getProperty("bindigit4"), prop.getProperty("bindigit5"), prop.getProperty("bindigit6"));       
	    }
	    @AfterClass
	    public void tearDown() 
	    {      
	        driver.quit();      
	    }
}
