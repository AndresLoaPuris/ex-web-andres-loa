package com.andres.steps;

import com.andres.page.CalculatorPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculatorSteps {

    private WebDriver driver;
    public CalculatorSteps(WebDriver driver){
        this.driver = driver;
    }

    public float getValue(){
        float value =  Float.parseFloat(this.driver.findElement(CalculatorPage.getValue).getText());
        return value;
    }


}


