package org.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.app.pages.ClearNumberPage;

public class ClearNumberStep {
    ClearNumberPage clearNumberPage = new ClearNumberPage();
    @Given("I click number")
    public void iClickNumber() throws InterruptedException {
        clearNumberPage.clickButtonNumbers();
        
    }

    @When("I click button AC on screen")
    public void iClickButtonACOnScreen() throws InterruptedException {
        clearNumberPage.clickButtonAC();
        
    }

    @Then("I get my page clean from numbers or reset number")
    public void iGetMyPageCleanFromNumbersOrResetNumber() throws InterruptedException {
        clearNumberPage.verifyResult();
    }
}
