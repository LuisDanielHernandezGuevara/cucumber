package cucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/*
 * glue accepts package where the stepdefinition is 
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features", 
glue= {"stepDefinitions"} ,tags="@SearchProduct")
public class Runner {}
