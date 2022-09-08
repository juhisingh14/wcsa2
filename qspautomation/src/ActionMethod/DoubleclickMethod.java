package ActionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleclickMethod {

	private static final CharSequence Admin = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.name("txtUsername")).sendKeys(Admin);
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
         driver.findElement(By.name("Submit")).click();
         driver.findElement(By.xpath("//b[.='PIM']")).click();
         driver.findElement(By.xpath("//a[@id=menu_pim_addEmployee']")).click();
       WebElement target = driver.findElement(By.name("photofile"));
         Actions act=new Actions(driver);
         act.doubleClick(target).perform();

	}

}
