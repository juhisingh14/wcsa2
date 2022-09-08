package webBasePopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupGetTextMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/PC/OneDrive/Desktop/htmldocs/confirmation.html");
		driver.findElement(By.xpath("//button[.='I am Hungry']")).click();
		Alert al = driver.switchTo().alert();
	     al.accept();
	     String txt = al.getText();
	     System.out.println(txt);
	                             	   	                                //NoAlertPresentAcception
	     
	}

}
