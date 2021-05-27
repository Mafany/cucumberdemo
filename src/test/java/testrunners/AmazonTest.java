package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features = {"src/test/resources/Search.feature"},// relative file path of feature  file
		 glue = {"stepdefinition","myhooks"}, // give the step definition and hook  packages 
		 // to get a pretty output, you can use this  plugin
		 plugin = {"pretty"}
		
		)

public class AmazonTest {
	

}
