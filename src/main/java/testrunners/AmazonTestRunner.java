package testrunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/java/Apfeatures/Search.feature"},
        tags="@Smoke or Regression",
        glue = {"StepDefinitions","Myhooks"},
        plugin={"pretty",
        "json:target/MyReports/report.json","junit:target/MyReports/report.xml"}

)
public class AmazonTestRunner {

}
