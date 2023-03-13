package TaskPackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TaskMainPackage.Page1;
import TaskMainPackage.Page2;
import TaskMainPackage.Page3;
import TaskMainPackage.Page4;
import TaskMainPackage.Page5;
import TaskMainPackage.Page6;
import Utils.Base;
import Utils.Utility;

//new stash

public class SingleBrowser extends Utility{

	WebDriver driver;
	Page1 first;
	Page2 second;
	Page3 third;
	Page4 fourth;
	Page5 fifth;
	Page6 sixth;

	
//	@Parameters ("Browser")
	
	
//	@BeforeSuite
//	public void beforesuit() {
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.get("https://onlinect.sharepoint.com/sites/interct/");
//
//	}
	
	
		
	
	
	@BeforeTest
	public void beforetest() {

	System.out.println("start");
		
//		if(Browser.equals("Chrome")) {
//			driver=Base.chrometest();
//		}
		
		
			driver=Base.edgetest();
		
	

		
		System.out.println("Continue");
		
		first=new Page1(driver);
		second=new Page2(driver);
		third=new Page3(driver);
		fourth=new Page4(driver);
		fifth=new Page5(driver);
		sixth=new Page6(driver);
		
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://onlinect.sharepoint.com/sites/interct/");
		
	}
	
	@BeforeClass
	public void beforemethod(){
	
//		first.firstpage();
//		second.secondpage();
//		third.thirdpage();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		fourth.fourthpage(driver);

		ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		
		fifth.fifthpage(driver);
	}
	
	
	@Test (priority=1)
	public void test1(){
		sixth.employeeid();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");	
		
		sixth.travelclick();
	}
	
	
	@Test (priority=2)
	public void test2() {
	
		//Please select the data in range of= a<40, b<20 ,c<2 ,d<3.
		sixth.adddata(10, 2, 1, 1);
		sixth.adddata(4, 2, 2, 2);
		sixth.adddata(43, 5, 1, 3);
		sixth.adddata(20, 15, 2, 1);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");	
		
		
		try {
			Utility.screenShot(driver, "test2");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Test (priority=3, dependsOnMethods="test2")
	public void test3() {
	
		sixth.remove(driver,"[3]");
		sixth.remove(driver, "[2]");

		try {
			Utility.screenShot(driver, "test3");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
