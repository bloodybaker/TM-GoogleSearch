package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleResultOfSearch extends PageObject {
    @FindBy(how = How.NAME, using = "q")
    private WebElement inputBox;

    public GoogleResultOfSearch(WebDriver driver) {
        super(driver);
    }
    public String confirm(){
        return inputBox.getAttribute("value");
    }
}
