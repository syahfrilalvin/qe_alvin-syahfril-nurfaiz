package org.example.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.app.pages.DistributionNumberPage;

public class DistributionNumberStep {
    DistributionNumberPage distributionNumberPage = new DistributionNumberPage();

    @When("I click button distribution numbers")
    public void iClickButtonDistributionNumbers() throws InterruptedException {
        distributionNumberPage.clickButtonMDistribution();

    }

    @Then("I get sum distribution of the two numbers")
    public void iGetSumDistributionOfTheTwoNumbers() throws InterruptedException {
        distributionNumberPage.verifyResult();
    }
}
