package Runners;

import com.cucumber.listener.Reporter;
//import cucumber.api.CucumberOptions;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;


@CucumberOptions(
        plugin = {
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
        },
        features = {"src/test/java"},
        glue = {"steps"},
        dryRun = false,
        tags = "@Smoketest"
)
public class _0_2_SmokeTest extends AbstractTestNGCucumberTests {
@AfterClass
    public static void afterClass(){
        Reporter.loadXMLConfig("src/main/java/XMLFiles/extendReportSet.xml");

        Reporter.setSystemInfo("Intern: ", "Gurkan Korkmaz");
        Reporter.setSystemInfo("App Nmae: ","Kirapyurdu test");
        Reporter.setSystemInfo("Operating System Info: ",System.getProperty("os.name"));
        Reporter.setTestRunnerOutput("Test execution Cucumber report");
    }
}
