package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
