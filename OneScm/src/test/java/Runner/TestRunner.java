package Runner;

import com.cucumber.listener.Reporter;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import java.io.File;
import java.io.FileReader;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/functionTest",
        plugin = {"pretty:STDOUT","html:target\\cucumber-pretty",
                "json:target\\cucumber.json"
                       }

        ,monochrome = true
        ,glue = {"stepDefinitions.Steps"}
        //dryRun = true
)
public class TestRunner {

}
