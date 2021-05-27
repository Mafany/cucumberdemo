package myhooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {
	
	@Before
	public void setup() {
		
		System.out.println("launch amazon application");
		
	}

	@Before
	public void setup_DB() {
		
		System.out.println("launch DB");
		
	}

	@After
	public void tearDown_logout() {
		
		System.out.println("logout from  application");
		
	}

	@Before(order=2)
	public void setup_url() {
		
		System.out.println("launch url");
		
	}
	@BeforeStep()
	public void takescreenshot() {
		
		System.out.println("Take a  screenshot");
		
	}
		
     @After
	  public  void tearDown_close(Scenario sc) {
		  
		System.out.println("Close the   Scenario");  
		System.out.println("Close the browser");  
		  
	  }
}
