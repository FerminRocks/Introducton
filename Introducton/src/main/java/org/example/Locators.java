package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) {
        //Automation Selectors (Id,Name,CSS)
        //Implicit wait -

        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("rahull");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println("Validacion de error en inicio de sesion:");
        System.out.println(driver .findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Hola");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Mi amor");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("Estoy automatizando");

    }


}
