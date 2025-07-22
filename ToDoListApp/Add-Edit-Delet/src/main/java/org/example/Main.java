package org.example;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        driver.get("https://app.todoist.com/app/today");
        driver.manage().window().maximize();

        //Sign up with my credentials
        driver.findElement(By.id("element-0")).sendKeys("missnadamahmoud@gmail.com");
        driver.findElement(By.id("element-2")).sendKeys("123Nn123");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        //Add new To-Do item
        driver.findElement(By.xpath("//span[@class='icon_add']//*[name()='svg']")).click();
        driver.findElement(By.xpath("//div[@aria-label='Task name']//p[@class='is-empty is-editor-empty']")).sendKeys("Complete Eyego Task");
        driver.findElement(By.cssSelector("button[data-testid=\"task-editor-submit-button\"]")).click();

        //Make it as completed
        driver.findElement(By.xpath("//div[@class=\"view_content\"] /*/div[2]/*/div/div[1]/div/div[3]/div[2]/div/*/div/div[1]/button")).click();

        //Go to inbox to Delete item
        driver.findElement(By.xpath("//span[normalize-space()='Inbox']")).click();
        driver.findElement(By.cssSelector("div[class=\"list_holder\"] div[data-index=\"3\"] div[class=\"task_content\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"fc42413d _27c1200b c5d6948b c68f8bf6\"] /button[1]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Delete')]")).click();
        driver.findElement(By.cssSelector("button[class=\"fc42413d _56a651f6 _3930afa0 _7ea1378e _7246d092\"]")).click();

        driver.quit();
    }
}