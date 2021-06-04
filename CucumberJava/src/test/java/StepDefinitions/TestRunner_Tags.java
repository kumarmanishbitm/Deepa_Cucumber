package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featureWithTag", glue={"StepDefinitions"},
tags="(@smoke or @regression) and not @sanity"
)
public class TestRunner_Tags {

}
