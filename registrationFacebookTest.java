package Practico10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class registrationFacebookTest{

    @Test

    public void fullRegistrationTest()throws InterruptedException {
        String URL_FACEBOOK_ = "https://www.facebook.com";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL_FACEBOOK_);

        driver.findElement(By.linkText("Crear cuenta nueva")).click();

        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("Jhon");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("5555555");
        driver.findElement(By.id("password_step_input")).sendKeys("123456789");

        Thread.sleep(2000);

        WebElement daysElement = driver.findElement(By.name("birthday_day"));
        WebElement monthElement = driver.findElement(By.name("birthday_month"));
        WebElement yearElement = driver.findElement(By.name("birthday_year"));

        Select daySelect = new Select(daysElement);
        Select monthSelect = new Select(monthElement);
        Select yearSelect = new Select(yearElement);

        daySelect.selectByIndex(26);
        monthSelect.selectByVisibleText("jun");
        yearSelect.selectByValue("1980");

        List<WebElement> listaSexos = driver.findElements(By.name("sex"));
        Assert.assertEquals(listaSexos.size(), 3);

        WebElement sexoMascElement = listaSexos.get(1);
        sexoMascElement.click();

        Thread.sleep(2000);
        driver.close();


    }
}

