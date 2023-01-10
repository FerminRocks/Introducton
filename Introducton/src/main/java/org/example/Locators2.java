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
        String password = getPassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.tagName("h2")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello " + name +",");
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        Thread.sleep(2000);
        driver.quit();

    }

    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
        String passwordText = driver.findElement(By.cssSelector("form p")).getText();
        //Split text: Please use temporary password 'rahulshettyacademy' to Login. passwordText.split("'");
        // single cord is the character where i need to split
        String[] passwordArray = passwordText.split("'"); //Converting to Array to String
        String password = passwordArray[1].split("'")[0]; //Converting to password variable, Split at the end of the text that I needed, getting 0 index
        return password;

    }

}
