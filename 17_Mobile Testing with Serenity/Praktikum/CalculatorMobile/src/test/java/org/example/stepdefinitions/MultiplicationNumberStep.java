package org.example.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.app.pages.MultiplicationNumberPage;

public class MultiplicationNumberStep {
    MultiplicationNumberPage multiplicationNumberPage = new MultiplicationNumberPage();
    @When("I click button multiplication numbers")
    public void iClickButtonMultiplicationNumbers() throws InterruptedException {
        multiplicationNumberPage.clickButtonMultiplication();
        
    }

    @Then("I get sum multiplication of the two numbers")
    public void iGetSumMultiplicationOfTheTwoNumbers() throws InterruptedException {
        multiplicationNumberPage.verifyResult();
    }
}
