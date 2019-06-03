package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Scanner;


public abstract class Login implements IMessengram{
    private WebDriver driver;
    private WebDriverWait wait;
    private Scanner input;

    public void login(String username, String password) {
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        System.setProperty("webdriver.chrome.driver","lib\\chromedriver.exe");
        input = new Scanner(System.in);
        wait = new WebDriverWait(driver,2500);

        driver = new ChromeDriver();

        // And now use this to visit Google
        driver.get("https://www.instagram.com");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/accounts/login/?source=auth_switcher']"))).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Find the text input element by its name
        WebElement []credentials ={driver.findElement(By.xpath("//input[@name='username']")), driver.findElement(By.xpath("//input[@name='password']"))};
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Enter something to search for
        credentials[0].sendKeys(input.next());

        // Now submit the form. WebDriver will find the form for us from the element
        credentials[1].sendKeys(input.next());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement login = driver.findElement(By.xpath("//button[@class='_0mzm- sqdOP  L3NKy       ']"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        login.submit();

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());

    }
}
