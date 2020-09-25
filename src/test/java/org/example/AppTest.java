package org.example;


import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.AssertJUnit.assertEquals;

public class AppTest
{

    private WebDriver driver;
    @Test
    public void successfulResult(){
        System.setProperty("webdriver.chrome.driver","./webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://google.com");

        GooglePageBeforeSearch init = new GooglePageBeforeSearch(driver);
        init.fillField("Java");

        GoogleResultOfSearch last = init.submit();


        assertEquals("Java",last.confirm());
    }
}
