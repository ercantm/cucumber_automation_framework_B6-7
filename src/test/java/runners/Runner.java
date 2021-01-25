package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        Path of features folder
        features = "./src/test/resources/features",
//        Path of step definitions folder
        glue = "stepdefinitions",
//        run only tagged scenarios in the features folder
        tags = "@wip",
//      run the feature without browser.
        dryRun = false
)
public class Runner {
    //This class is to run and control the test cases
}
