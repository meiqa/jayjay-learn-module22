package cucumberDemo.StepDefinitions;

import cucumberDemo.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks extends BaseTest {

    @Before
    public void before() {
        getDriver();
    }

    @After
    public void after() {
        driver.close();
    }
}