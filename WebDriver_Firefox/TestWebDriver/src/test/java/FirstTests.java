import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FirstTests {



    public static void main(String[] args) {

        //Dodaj ścieżkę do Firefox Driva
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Paul\\IdeaProjects\\TestWebDriver\\src\\test\\java\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");



        driver.findElement(By.id("inputEmail3")).sendKeys("Jan");
        driver.findElement(By.id("inputPassword3")).sendKeys("Kowalski");;
        driver.findElement(By.id("dataU")).sendKeys("data");;

        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.id("rodzice")).click();





        driver.findElement(By.xpath(".//*[@id='formma']/div[6]/div/button")).click();

        driver.switchTo().alert().accept();

        String AlertText = driver.switchTo().alert().getText();

        test(AlertText);



    }
    public static void test(String AlertText) {




        if (AlertText.contains("Blad danych")) {
            System.out.print("Failed");

        } else {
            System.out.print("Test zakończony");
        }

    }

}
