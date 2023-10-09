package com.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pages.BinScreen;
import com.qa.pages.CifSelectionPage;
import com.qa.pages.LandingPage;
import com.qa.util.Base;
import com.qa.util.JiraPolicy;

public class CifSelectionPageTest extends Base{
   
	LandingPage landingpage;
	CifSelectionPage cifselectionpage;
	BinScreen binscreen;
	
    public CifSelectionPageTest(){
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

	
    @AfterClass
    public void tearDown() 
    {
        
        driver.quit();
        
    }

}
