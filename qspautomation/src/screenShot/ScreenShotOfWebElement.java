package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class ScreenShotOfWebElement {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(3000);

		WebElement loginButton = driver.findElement(By.cssSelector("button[class*='L3NKy']"));
		File src = loginButton.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/loginButton.jpg");
		Files.copy(src, dest);

	}

}
