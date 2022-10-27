package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivers {
    public static void main(String[] args) {
        /*
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Djordjije\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Djordjije\\Desktop\\Selenium\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://google.com");*/
        System.setProperty("webdriver.edge.driver","C:\\Users\\Djordjije\\Desktop\\Selenium\\Drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("http://google.com");
    }
}
