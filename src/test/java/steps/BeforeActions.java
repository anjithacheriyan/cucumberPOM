package steps;

import cucumber.api.java.Before;
import pages.utlilities.SeleniumDriver;

public class BeforeActions {
	
	@Before
	public static void setUp() {
		
		SeleniumDriver.setUpDriver();
		
	}


	

}
