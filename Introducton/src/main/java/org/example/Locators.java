package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
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
        driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Test@test.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("123456789");
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
        System.out.println("Validacion de error en Reset Loging");
        System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
        driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        Thread.sleep(1000);
        driver .findElement(By.id("chkboxOne")).click();
        driver .findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.cssSelector("button.submit.signInBtn")).click();
        System.out.println("Validacion de Succes message login");
        System.out.println(driver.findElement(By.className("login-container")).getText());
        Thread.sleep(5000);
        driver.quit();



    }


}
