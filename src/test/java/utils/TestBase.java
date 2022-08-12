package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
    protected WebDriver webDriver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromiumdriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("-----");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000l);
        webDriver.quit();
    }
}
