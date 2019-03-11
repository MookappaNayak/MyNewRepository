package Java;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annum {
	
	    // Test Case 1
	    @Test
	    public void testCase1() {
	    	Reporter.log("in Test Case 1",true);
	    }
	 
	    // Test Case 2
	    @Test
	    public void testCase2() {
	    	Reporter.log("in Test Case 2",true);
	    }
	 
	    @BeforeMethod
	    public void beforeMethod() {
	    	Reporter.log("in Before Method",true);
	    }
	 
	    @AfterMethod
	    public void afterMethod() {
	    	Reporter.log("in After Method",true);
	    }
	 
	    @BeforeClass
	    public void beforeClass() {
	    	Reporter.log("in Before Class",true);
	    }
	 
	    @AfterClass
	    public void afterClass() {
	    	Reporter.log("in After Class",true);
	    }
	 
	    @BeforeTest
	    public void beforeTest() {
	     Reporter.log("in Before Test",true);
	    }
	 
	    @AfterTest
	    public void afterTest() {
	    	Reporter.log("in After Test",true);
	    }
	 
	    @BeforeSuite
	    public void beforeSuite() {
	    	Reporter.log("in Before Suite",true);
	    }
	 
	    @AfterSuite
	    public void afterSuite() {
	    	Reporter.log("in After Suite",true);
	    }
	 
	}

