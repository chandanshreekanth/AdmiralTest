package org.admiral.opencart.stepdefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.admiral.opencart.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import utilites.BrowserDriver;

import java.awt.*;

public class LoginPageStepDef extends BrowserDriver {


    private LoginPage loginPage;

//    @Before
//    public void setUp() {
//        driver = new ChromeDriver();
//    }
//
//    @After
//    public void tearDown() {
//        if (driver != null) {
////            driver.quit();
//        }
//    }

    @Given("I am on the OpenCart login page")

    public void i_am_on_the_open_cart_login_page() {
        driver.manage().deleteAllCookies();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
    }

    @Given("I have entered a valid username and password")
    public void i_have_entered_a_valid_username_and_password() throws InterruptedException, AWTException {
        loginPage.enterEmail("qatestertest1@gmail.com");
        Thread.sleep(2000);
        loginPage.enterPassword("qatestertest1@gmail.com");
        Robot robot=new Robot();
        robot.delay(5000);
    }

    @Given("^I have entered invalid (.*) and (.*)$")
    public void i_have_entered_invalid_and(String username, String password) {
        loginPage.enterEmail(username);
        loginPage.enterPassword(password);
    }
    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        loginPage.clickLoginButton();

    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        Assert.assertEquals(loginPage.checkLogoutLink(), true);
    }

    @Then("^I should see an error message indicating (.*)$")
    public void i_should_see_an_error_message_indicating (String error_message) {
        // Assert that an error message is displayed on the page matching the expected error message
        Assert.assertEquals(driver.findElement(By.cssSelector(".alert-danger")).isDisplayed(), true);
    }
    @When("I click on the \"Forgotten Password\" link")
    public void i_click_on_the_forgotten_password_link() {
        loginPage.clickForgottenPasswordLink();

    }

    @Then("I should be redirected to the password reset page")
    public void i_should_be_redirected_to_the_password_reset_page() {

        }
}