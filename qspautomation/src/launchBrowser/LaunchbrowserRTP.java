package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchbrowserRTP {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		//took the user input
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the browser name,chrome or firefox");
		String browserValue=sc.nextLine();
		//browserValue variable contains the name of the browser which is supposed to be opened
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();//open chrome browser
			driver.manage().window().maximize();//maximize the browser
			driver.get("htttps://www.google.com");//launch the web application
			Thread.sleep(5000);
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();//open grcko browser
			driver.manage().window().maximize();//maximize the browser
			driver.get("htttps://www.google.com");//launch the web application
			Thread.sleep(5000);
		}
		else 
		{
			System.out.println("type valid input");
		}
	}

}
