package SampleCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.linkText("Create new account")).click();

        driver.findElement(By.name("reg_email__")).sendKeys("balakumar0612@gmail.com");

        driver.findElement(By.name("reg_passwd__")).sendKeys("9094567");

        WebElement dob1 = driver.findElement(By.id("day"));

        Select sel1 = new Select(dob1);
        sel1.selectByVisibleText("6");

        WebElement dob2 = driver.findElement(By.id("month"));

        Select sel2 = new Select(dob2);
        sel2.selectByVisibleText("Dec");

        WebElement dob3 = driver.findElement(By.id("year"));

        Select sel3 = new Select(dob3);
        sel3.selectByValue("2000");

        driver.findElement(By.name("firstname")).sendKeys("Bala");

        driver.findElement(By.name("lastname")).sendKeys("Kumar");

        // Selecting Male
        driver.findElement(By.xpath("//label[text()='Male']")).click();

        driver.findElement(By.name("websubmit")).click();

    }
}