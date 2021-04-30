import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SpotifyWithCssSelectorTest {


    @Test

    public void ssSelectorByPlaceHolderTest() throws InterruptedException {
        String URL_Spotify_ = "https://www.spotify.com";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL_Spotify_);


        Thread.sleep(2000);

        driver.findElement(By.cssSelector("a[href='https://www.spotify.com/uy/signup/']")).click();

        driver.findElement(By.cssSelector("input[placeholder='Introduce tu correo electrónico.']")).sendKeys("test@test.com");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder='Vuelve a introducir tu correo electrónico.']")).sendKeys("test@test.com");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder='Crea una contraseña.']")).sendKeys("ABC123");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder='Introduce un nombre de perfil.']")).sendKeys("Connor Mcloud");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder='DD']")).sendKeys("30");
        Thread.sleep(1000);
        Select mes = new Select(driver.findElement(By.cssSelector("*[name='month']")));
        mes.selectByIndex(07);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder='AAAA']")).sendKeys("1984");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("*[class='Indicator-sc-16vj7o8-0 iBjMfh']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("*[class='Indicator-sc-11vkltc-0 ioJObh']")).click();
        Thread.sleep(1000);













    }


}


