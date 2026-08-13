package cucumberDemo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//Cucumber Runner Class
@RunWith(Cucumber.class)
@CucumberOptions (
        glue = {"cucumberDemo"}, //cari step definitions
        features = {"src/test/resources"},
        plugin = {"pretty","html:reports/cucumber.html", "json:reports/cucumber.json"}
)

public class CucumberTest {

}