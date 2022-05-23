package com.example.steps;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.app.Calculator;
import com.example.app.base.BasePageObject;
import com.example.app.pages.CalculatorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MathsStepDefinitions {

    int angka1 = 0;
    int angka2 = 0;
    int total = 0;

    CalculatorPage calculatorPage = new CalculatorPage();

    @Given("a is {int}")
    public void givenAIs(Integer angka1) {
        calculatorPage.inputAngkaSatu(angka1);
    }


    @Given("b is {int}")
    public void givenBIs(Integer angka2) {
        calculatorPage.inputAngkaDua(angka2);
    }


    @When("I select operation")
    public void iSelectOperation() {
        calculatorPage.clickDropDownBtn();
    }

    @When("I select add operation")
    public void iSelectAddOperation() {
        calculatorPage.clickAddBtn();
    }

    @And("I click button equal")
    public void iClickAmount() {
        calculatorPage.clickEqualValue();
    }

}
