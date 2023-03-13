package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Base {
	
	WebDriver driver;
	
//	public Base(WebDriver driver) {
//		this.driver=driver;
//	};
	
	public static WebDriver chrometest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AbhijeetY\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;	
	}
	
	public static WebDriver edgetest() {
		System.setProperty("webdriver.msedgedriver.driver", "C:\\Users\\AbhijeetY\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		return driver;	
	}

}
