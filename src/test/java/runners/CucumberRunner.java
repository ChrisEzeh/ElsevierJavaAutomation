package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepDefs", "utilities"},
        features = {"src/test/resources/features"}

)


public class CucumberRunner {
}
