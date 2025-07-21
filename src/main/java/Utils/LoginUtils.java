package Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginUtils {
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public static void initializeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\evers\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

}
