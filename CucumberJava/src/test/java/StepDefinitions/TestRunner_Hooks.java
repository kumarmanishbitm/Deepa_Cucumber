package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Hooks/HooksDemo.feature", glue={"stepForHooks"}, monochrome=true,
plugin ={"pretty","junit:target/JUnitReports/report.xlm",
		"json:target/JSONReports/report.json",
		"html:target/HtmlReports.html"}

)
public class TestRunner_Hooks {

}
