package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GooglePageBeforeSearch extends PageObject{
    @FindBy(how = How.NAME, using = "q")
    private WebElement field;

    public GooglePageBeforeSearch(WebDriver driver) {
        super(driver);
    }
    public void fillField(String iostring){
        field.clear();
        field.sendKeys(iostring);
    }

    public GoogleResultOfSearch submit(){
        field.submit();
        return  new GoogleResultOfSearch(driver);
    }
}
