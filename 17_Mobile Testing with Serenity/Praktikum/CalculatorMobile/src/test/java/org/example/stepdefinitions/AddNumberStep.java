package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.app.pages.PlusNumberPage;

public class AddNumberStep {
    PlusNumberPage plusNumberPage = new PlusNumberPage();
    @Given("I click numbers one")
    public void iClickNumbersOne() throws InterruptedException {
        plusNumberPage.addNumber1();

    }

    @When("I click button add numbers")
    public void iClickButtonAddNumbers() throws InterruptedException {
        plusNumberPage.clickButtonAdd();
    }

    @And("I click numbers two")
    public void iClickNumbersTwo() throws InterruptedException {
        plusNumberPage.addNumber2();

    }

    @Then("I get sum of the two numbers")
    public void iGetSumOfTheTwoNumbers() throws InterruptedException {
        plusNumberPage.verifyResult();
    }


}
