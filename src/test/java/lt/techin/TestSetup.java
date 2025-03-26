package lt.techin;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class TestSetup {

    WebDriver driver;

    @BeforeEach
    public void setDriver(){
        // Create an instance of ChromeOptions
        ChromeOptions options = new ChromeOptions();

        // Add the headless argument
        options.addArguments("--headless=new");
        options.addArguments("--disable-gpu"); // Disable GPU (optional)
        options.addArguments("--window-size=1920,1080"); // Set window size

        // Initialize the driver with the options
        driver = new ChromeDriver(options);

        // Set the implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

        // Open the target website
        driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
    }

    @AfterEach
    public void quit(){
        driver.quit();
    }
}
