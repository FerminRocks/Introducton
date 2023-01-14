package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.sql.SQLOutput;

public class Tarea1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
        Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
        System.out.println("Number of checkboxes:" + driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        Thread.sleep(1000);
        driver.quit();

    }
}
