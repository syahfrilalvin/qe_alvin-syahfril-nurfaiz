package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.app.pages.SubtractionNumberPage;

public class SubtractionNumberStep {
    SubtractionNumberPage subtractionNumberPage = new SubtractionNumberPage();
    @Given("I click second number")
    public void iClickSecondNumber() throws InterruptedException {
        subtractionNumberPage.secondNumber();
    }

    @When("I click button subtraction numbers")
    public void iClickButtonSubtractionNumbers() throws InterruptedException {
        subtractionNumberPage.clickButtonSubtraction();
        
    }
    @And("I click first number")
    public void iClickFirstNumber() throws InterruptedException {
        subtractionNumberPage.firstNumber();
    }

    @Then("I get sum subtraction of the two numbers")
    public void iGetSumSubtractionOfTheTwoNumbers() throws InterruptedException {
        subtractionNumberPage.verifyResult();
    }

}
