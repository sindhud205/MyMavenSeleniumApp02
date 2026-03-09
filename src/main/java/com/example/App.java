package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();

        Thread.sleep(2000); // wait 2 seconds

        driver.findElement(By.id("username")).sendKeys("student");

        Thread.sleep(2000); // wait 2 seconds

        driver.findElement(By.id("password")).sendKeys("Password123");

        Thread.sleep(2000); // wait 2 seconds

        driver.findElement(By.id("submit")).click();

        Thread.sleep(3000); // wait 3 seconds before closing
    }
}
