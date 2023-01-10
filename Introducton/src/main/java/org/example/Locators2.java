package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.sql.Driver;
import java.time.Duration;

public class Locators2 {
    public static void main(String[] args) throws InterruptedException {
        //Automation Selectors (Id,Name,CSS)

        String name = "rahul";
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.tagName("h2")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello " + name +",");
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        Thread.sleep(2000);
        driver.quit();


    }
}
