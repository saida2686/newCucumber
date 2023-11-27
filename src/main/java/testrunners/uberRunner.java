package testrunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"/Users/saida/IdeaProjects/newCucumber/src/main/java/Apfeatures/uberOrder.feature"},
        tags = "smoke",
        glue = {"StepDefinitions"}

)
public class uberRunner {
}
