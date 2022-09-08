package methodOfWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitlemethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-p7eb103/login.do");
		String titleOfTheWebPage=driver.getTitle();
		System.out.println(titleOfTheWebPage);

	}

}
//https://placement.qspiders.com/