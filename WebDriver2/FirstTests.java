
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FirstTests {



    public static void main(String[] args) {

        test(dane1());
        test(dane2());
        test(dane3());
        test(dane4());
        test(dane5());
        test(dane6());
        test(dane7());
        test(dane8());
        test(dane9());
        test(dane10());
    }


    public static void test(String AlertText) {

        if (AlertText.contains("Blad danych")) {
            System.out.println("Test zakończył sie NIEPOWODZENIEM");

        } else {
            System.out.println("Test zakończył sie POMYŚLNIE");
        }

    }

    // Lista Danych.
    // Każda funkcja odpowiada nowemu formularzowi

    public static String dane1(){
        //Dodaj ścieżkę do Firefox Driva
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Paul\\IdeaProjects\\TestWebDriver\\src\\test\\java\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");

        driver.findElement(By.id("inputEmail3")).sendKeys("Jan");
        driver.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        driver.findElement(By.id("dataU")).sendKeys("data");
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.xpath(".//*[@id='formma']/div[6]/div/button")).click();

        driver.switchTo().alert().accept();
        String AlertText = driver.switchTo().alert().getText();

        return AlertText;
    }

    public static String dane2(){
        //Dodaj ścieżkę do Firefox Driva
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Paul\\IdeaProjects\\TestWebDriver\\src\\test\\java\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");

        driver.findElement(By.id("inputEmail3")).sendKeys("Jan");
        driver.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        driver.findElement(By.id("dataU")).sendKeys("03.12.2020");
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.xpath(".//*[@id='formma']/div[6]/div/button")).click();

        driver.switchTo().alert().accept();
        String AlertText = driver.switchTo().alert().getText();

        return AlertText;
    }

    public static String dane3(){
        //Dodaj ścieżkę do Firefox Driva
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Paul\\IdeaProjects\\TestWebDriver\\src\\test\\java\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");

        driver.findElement(By.id("inputEmail3")).sendKeys("Jan");
        driver.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        driver.findElement(By.id("dataU")).sendKeys("07.01.2003");
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.xpath(".//*[@id='formma']/div[6]/div/button")).click();

        driver.switchTo().alert().accept();
        String AlertText = driver.switchTo().alert().getText();

        return AlertText;
    }

    public static String dane4(){
        //Dodaj ścieżkę do Firefox Driva
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Paul\\IdeaProjects\\TestWebDriver\\src\\test\\java\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");

        driver.findElement(By.id("inputEmail3")).sendKeys("Jan");
        driver.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        driver.findElement(By.id("dataU")).sendKeys("07.01.2010");
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.xpath(".//*[@id='formma']/div[6]/div/button")).click();

        driver.switchTo().alert().accept();
        String AlertText = driver.switchTo().alert().getText();

        return AlertText;
    }

    public static String dane5(){
        //Dodaj ścieżkę do Firefox Driva
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Paul\\IdeaProjects\\TestWebDriver\\src\\test\\java\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");

        driver.findElement(By.id("inputEmail3")).sendKeys("Jan");
        driver.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        driver.findElement(By.id("dataU")).sendKeys("07.01.2010");
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.xpath(".//*[@id='formma']/div[6]/div/button")).click();

        driver.switchTo().alert().accept();
        String AlertText = driver.switchTo().alert().getText();

        return AlertText;
    }

    public static String dane6(){
        //Dodaj ścieżkę do Firefox Driva
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Paul\\IdeaProjects\\TestWebDriver\\src\\test\\java\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");

        driver.findElement(By.id("inputEmail3")).sendKeys("Jan");
        driver.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        driver.findElement(By.id("dataU")).sendKeys("03.12.1970");
        driver.findElement(By.xpath(".//*[@id='formma']/div[6]/div/button")).click();

        driver.switchTo().alert().accept();
        String AlertText = driver.switchTo().alert().getText();

        return AlertText;
    }

    public static String dane7(){
        //Dodaj ścieżkę do Firefox Driva
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Paul\\IdeaProjects\\TestWebDriver\\src\\test\\java\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");

        driver.findElement(By.id("inputEmail3")).sendKeys("Jan");
        driver.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        driver.findElement(By.id("dataU")).sendKeys("03.12.2020");
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.xpath(".//*[@id='formma']/div[6]/div/button")).click();

        driver.switchTo().alert().accept();
        String AlertText = driver.switchTo().alert().getText();

        return AlertText;
    }

    public static String dane8(){
        //Dodaj ścieżkę do Firefox Driva
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Paul\\IdeaProjects\\TestWebDriver\\src\\test\\java\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");

        driver.findElement(By.id("inputEmail3")).sendKeys("Jan");
        driver.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        driver.findElement(By.id("dataU")).sendKeys("03.12.2016");
        driver.findElement(By.id("lekarz")).click();

        driver.findElement(By.xpath(".//*[@id='formma']/div[6]/div/button")).click();

        driver.switchTo().alert().accept();
        String AlertText = driver.switchTo().alert().getText();

        return AlertText;
    }

    public static String dane9(){
        //Dodaj ścieżkę do Firefox Driva
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Paul\\IdeaProjects\\TestWebDriver\\src\\test\\java\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");

        driver.findElement(By.id("inputEmail3")).sendKeys("Jan");
        driver.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        driver.findElement(By.id("dataU")).sendKeys("05.01.1950");
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.xpath(".//*[@id='formma']/div[6]/div/button")).click();

        driver.switchTo().alert().accept();
        String AlertText = driver.switchTo().alert().getText();

        return AlertText;
    }

    public static String dane10(){
        //Dodaj ścieżkę do Firefox Driva
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Paul\\IdeaProjects\\TestWebDriver\\src\\test\\java\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");

        driver.findElement(By.id("inputEmail3")).sendKeys("Jan");
        driver.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        driver.findElement(By.id("dataU")).sendKeys("03.01.2002");
        driver.findElement(By.xpath(".//*[@id='formma']/div[6]/div/button")).click();

        driver.switchTo().alert().accept();
        String AlertText = driver.switchTo().alert().getText();

        return AlertText;
    }

}
