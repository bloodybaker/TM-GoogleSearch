package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleResultOfSearch extends PageObject {
    @FindBy(how = How.XPATH, using = "/html/body/div[4]/form/div[2]/div[1]/div[2]/div/div[2]/input")
    private WebElement inputBox;

    public GoogleResultOfSearch(WebDriver driver) {
        super(driver);
    }
    public String confirm(){
        return inputBox.getAttribute("value");
    }
}
