import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Privat24 {

    //Описание UI элементов
    //Действия с UI элементами

    @Test
    public void testP2P(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://next.privat24.ua/mobile");


        By Phone = By.xpath("//input[@data-qa-node=\"phone-number\"]");
        By HotSpot = By.xpath("//button[@data-qa-node=\"amount-hot-spot\"]");
        By CardFrom = By.xpath("//input[@data-qa-node=\"numberdebitSource\"]");
        By ExpDebit = By.xpath("//input[@data-qa-node=\"expiredebitSource\"]");
        By Cvv = By.xpath("//input[@data-qa-node=\"cvvdebitSource\"]");
        By FirstName = By.xpath("//input[@data-qa-node=\"firstNamedebitSource\"]");
        By LastName = By.xpath("//input[@data-qa-node=\"lastNamedebitSource\"]");
        By Submit = By.xpath("//button[@data-qa-node=\"submit\"]");


        driver.findElement(Phone).sendKeys("509796447");
        driver.findElement(HotSpot).click();
        driver.findElement(CardFrom).sendKeys("4145454545454545");
        driver.findElement(ExpDebit).sendKeys("0122");
        driver.findElement(Cvv).sendKeys("111");
        driver.findElement(FirstName).sendKeys("Vasya");
        driver.findElement(LastName).sendKeys("Pupkin");
        driver.findElement(Submit).click();

    }
}
