package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    @Before
    public void setUp(){
        System.out.println("This is Before method. This runs before each Scenario");
    }

    @After
    public void tearDown(Scenario scenario){
        //        System.out.println("This is after method. This runs after each Scenario");
        final byte[] screenshot=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if(scenario.isFailed()) {
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        /*
        If scenario fails, then take the screenshot
         */

    }
}
