package org.stepdef;

import org.utils.Base;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base{
		@Before
		public void before(Scenario sc) {
			  getDriver();
			  System.out.println(sc.getName());
		}
	    @After
	    public void after(Scenario sc) {
	    	closeBrowser();
	    	System.out.println(sc.getStatus());
	    	
	}
}
