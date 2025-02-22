package org.admiral.opencart.stepdefs;
import io.cucumber.java.en.Given;
import utilites.BrowserDriver;

public class HomePageAdmiralPageStepDef extends BrowserDriver {

    @Given("I am on the admiral home page")
         public void i_am_on_the_admiral_home_page() {
        driver.get("https://www.admiral.com/");
//        if()
    }


}
