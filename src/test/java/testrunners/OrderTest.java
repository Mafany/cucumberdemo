package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features = {"src/test/resources/Order.feature"},// relative file path of feature  file  such as @All
		 glue = {"stepdefinition"}, // give the step definition  package
		 // to get a pretty output, you can use this  plugin
		// tags =  "@All or @Smoke", // can  also  be taged  with AND, OR,  can  also apply at the Feature level in the feature 
		 plugin = {"pretty"}
		
		
		)

public class OrderTest {

}
