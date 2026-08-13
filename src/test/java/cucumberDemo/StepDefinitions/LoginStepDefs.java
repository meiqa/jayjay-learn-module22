package cucumberDemo.StepDefinitions;

import cucumberDemo.BaseTest;
import cucumberDemo.pageObjectModel.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginStepDefs extends BaseTest {

    LoginPage loginPage; //inisialisasi

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
    }

    @And("the user enters {string} in the email field")
    public void theUserEntersInTheEmailField(String username) {
        loginPage.enterUsername(username);
    }

    @And("the user enters {string} in the password field")
    public void theUserEntersInThePasswordField(String password) {
        loginPage.enterPassword(password);
    }

    @When("the user clicks the login button")
    public void theUserClicksTheLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("the user see the error message {string}")
    public void theUserSeeTheErrorMessage(String errorMessage) {
        loginPage.validateErrorMessage(errorMessage);
    }
}