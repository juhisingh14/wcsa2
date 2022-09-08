package ActionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseoverMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		WebElement target= driver.findElement(By.xpath("//a[@title='Jewellery']"));
		driver.findElement(By.xpath("//span[@class='prcs-d' and .='Kadas']"));
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
		driver.findElement(By.xpath("//span[@class='prcs-d' and .='Kadas']")).click();

	}

}
