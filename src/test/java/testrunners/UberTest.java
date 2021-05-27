package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			 features = {"src/test/resources/Uber.feature"},// relative file path of feature  file  such as @All
			 glue = {"stepdefinition","myhooks"}, // give the step definition  package
			 // to get a pretty output, you can use this  plugin
			 tags =  "@All or @Smoke", // can  also  be taged  with AND, OR,  can  also apply at the Feature level in the feature 
			 plugin = {"pretty",
					    "json:target/MyReports/report.json",
					    "junit:target/MyReports/report.xml"
					    },
			 
	//		 publish = true      //  for publishing  reports or  you can  use cucumber.properties and  enable  = true
		monochrome = true 	// This  will remove cabage  from the  console output
		
	//	dryRun = true  // use   to verify  stepdefinition  if it's missing  or mapped,  check  strick = true  also
			)

	public class UberTest {
		

		}
  
	
