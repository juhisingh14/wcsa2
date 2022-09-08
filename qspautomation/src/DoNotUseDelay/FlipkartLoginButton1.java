package DoNotUseDelay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartLoginButton1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//span[.='Cart']")).click();
		// driver.findElement(By.className("V3C5bO")).click();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _1sbqEe _3AWRsL']")).click();
	}

}
