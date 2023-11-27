package cucumberOptions;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin= {"pretty",
        },
        features= {"src/test/java/firstTest"},
        glue="/Users/saida/IdeaProjects/newCucumber/src/test/java/StepDefinition")

public class TestNgRunner  {

}
