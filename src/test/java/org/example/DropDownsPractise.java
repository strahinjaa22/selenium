package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownsPractise {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Djordjije\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        WebElement userEmail = driver.findElement(By.id("userEmail"));
        WebElement gender = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        WebElement mobile = driver.findElement(By.id("userNumber"));
        WebElement hobbies = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
        WebElement address = driver.findElement(By.id("currentAddress"));
        WebElement state = driver.findElement(By.id("state"));
        WebElement city = driver.findElement(By.id("city"));
        WebElement submit = driver.findElement(By.id("submit"));

        firstName.sendKeys("Strahinja");
        lastName.sendKeys("Raicevic");
        userEmail.sendKeys("stra22@mailinator.com");

        Thread.sleep(2000);

        gender.click();
        mobile.sendKeys("066000444");
        hobbies.click();
        address.sendKeys("Nikole Tesle");

        Select chooseState = new Select(state);
        chooseState.selectByIndex(2);

        Select chooseCity = new Select(city);
        chooseCity.selectByIndex(0);

        submit.click();
        Thread.sleep(2000);
        driver.quit();
    }
}
