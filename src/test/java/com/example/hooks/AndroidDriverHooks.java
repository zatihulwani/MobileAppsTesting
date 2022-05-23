package com.example.hooks;

import com.example.drivers.AndroidDriverInit;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class AndroidDriverHooks {

    @Before(value = "@Android")
    public void beforeScenario() {
        AndroidDriverInit.initialize();
    }

    @After(value = "@Android")
    public void afterScenario(Scenario scenario) {
        if(scenario.isFailed()){
            TakesScreenshot screenshot = AndroidDriverInit.driver;
            byte[] imageArray= screenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(imageArray, "image/png", "screenshot");
        }
        AndroidDriverInit.destroy();
    }
}
