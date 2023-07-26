package Runners;

import io.cucumber.testng.CucumberOptions;

//import cucumber.api.CucumberOptions;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
        features = {"src/test/java"},
        glue = {"steps"},
        dryRun = false
)
public class _0_1_RunnerGeneral {
}
