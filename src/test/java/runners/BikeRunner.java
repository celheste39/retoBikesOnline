package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Bike.feature",
        glue = "stepDefinitions",
        snippets = SnippetType.CAMELCASE)
public class BikeRunner {
}
