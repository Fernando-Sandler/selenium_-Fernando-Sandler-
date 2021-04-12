import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Ejercicio14Practico9 {


    @Test

    public void netflixTest() {

        String URL_NETFLIX_ = "https://www.netflix.com";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL_NETFLIX_);

        List<WebElement> listaH1s = driver.findElements(By.tagName("h1"));
        System.out.println("La cantidad de H1s del sitio son: " +
                listaH1s.size());
        System.out.println("---> Elementos H1: <---");
        for (WebElement elementoH1 : listaH1s) {
            System.out.println(elementoH1.getText());
        }
        System.out.println("*****************");

        List<WebElement> listaH2s = driver.findElements(By.tagName("h2"));
        System.out.println("La cantidad de H2s del sitio son: " +
                listaH2s.size());

        System.out.println("---> Elementos H2: <---");
        for (WebElement elementoH2 : listaH2s) {
            System.out.println(elementoH2.getText());
        }
        System.out.println("*****************");

        driver.navigate().refresh();

        List<WebElement> btnElements = driver.findElements(By.tagName("button"));
        System.out.println("La pagina contiene " + btnElements.size() + " botones");

        for (WebElement btn : btnElements) {
            System.out.println("Boton:" + btn.getText());
        }

        List<WebElement> divElements = driver.findElements(By.tagName("div"));
        System.out.println("La cantidad de divs es " + divElements.size());

        System.out.println(driver.getTitle());


        List<WebElement> linksElements = driver.findElements(By.tagName("a"));
        System.out.println("La Cantidad de links es: " + linksElements.size());
        for (WebElement links: linksElements){
            System.out.println("Link: " + links.getText());

        }

    }


}


