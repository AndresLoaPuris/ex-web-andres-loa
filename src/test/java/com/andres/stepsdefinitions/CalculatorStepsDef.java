package com.andres.stepsdefinitions;

import com.andres.steps.CalculatorSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorStepsDef {

    private WebDriver driver;
    private Scenario scenario;

    private CalculatorSteps calculatorSteps(WebDriver driver){
        return new CalculatorSteps(driver);
    }

    @Before(order = 0)
    public void setUp(){
        //setUp
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aloap\\OneDrive\\Escritorio\\ex-web-andres-loa\\drivers\\chromedriver.exe");
        //crear el driver
        driver = new ChromeDriver();
        //max
        driver.manage().window().maximize();
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario){
        this.scenario = scenario;
    }

    @After
    public void quitDriver(){
        driver.quit();
    }

    @Given("ingreso a la pagina BasciCalculator")
    public void ingreso_a_la_pagina_basci_calculator() {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
    }

    @When("ingreso el valor de primer numero: {int} y segundo numero: {int} y selecciono la operacion de sumar")
    public void ingreso_el_valor_de_primer_numero_y_segundo_numero_y_selecciono_la_operacion_de_sumar(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("el valor deberia ser {int}")
    public void el_valor_deberia_ser(Integer int1) {
        float value = calculatorSteps(driver).getValue();
        Assertions.assertTrue(int1.floatValue() == value);
    }


    @When("ingreso el valor de primer numero: {int} y segundo numero: {int} y selecciono la operacion de restar")
    public void ingreso_el_valor_de_primer_numero_y_segundo_numero_y_selecciono_la_operacion_de_restar(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("ingreso el valor de primer numero: {int} y segundo numero: {int} y selecciono la operacion de multiplicar")
    public void ingreso_el_valor_de_primer_numero_y_segundo_numero_y_selecciono_la_operacion_de_multiplicar(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("ingreso el valor de primer numero: {int} y segundo numero: {int} y selecciono la operacion de dividir")
    public void ingreso_el_valor_de_primer_numero_y_segundo_numero_y_selecciono_la_operacion_de_dividir(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
