package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.devtools.v85.dom.model.ShapeOutsideInfo;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {

        // Invoking Browser
        // Chrome - ChromeDriver -> Methods
        //WebDriver driver = new ChromeDriver();

        //Firefox Launch
        //WebDriver driver = new FirefoxDriver();

        //Edge Launch
        WebDriver driver = new EdgeDriver();

        driver.get("https://rahulshettyacademy.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


        driver.quit();

    }
}