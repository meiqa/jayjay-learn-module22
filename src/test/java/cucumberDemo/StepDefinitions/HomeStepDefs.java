package cucumberDemo.StepDefinitions;

import cucumberDemo.BaseTest;
import cucumberDemo.pageObjectModel.HomePage;
import io.cucumber.java.en.Then;

public class HomeStepDefs extends BaseTest {

    HomePage homePage;

    @Then("the user is redirected to the homepage")
    public void theUserIsRedirectedToTheHomePage() {
        homePage = new HomePage(driver);
        homePage.validateRedirectedToTheHomepage();
        }
}