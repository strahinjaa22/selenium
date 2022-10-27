package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Djordjije\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://amplitudo.me/";
        driver.get(baseUrl);
        driver.getTitle();
        String title = driver.getTitle();
        driver.getCurrentUrl();
        String getCurrentUrl = driver.getCurrentUrl();
            driver.navigate().to("http://google.com");
            driver.navigate().back();
        driver.close();

        if (baseUrl.equalsIgnoreCase(getCurrentUrl)) {
            System.out.println("Url's are matching");
        } else {
            System.out.println("Not matching");
        }
        System.out.println("The title for our page is: " + title);
        System.out.println("The current url is: " + getCurrentUrl);

    }
}
