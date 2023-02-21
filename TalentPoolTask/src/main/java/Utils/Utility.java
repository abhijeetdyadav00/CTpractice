package Utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
//	WebDriver driver;

	public static void screenShot(WebDriver driver, String TestId) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Public\\Downloads\\"+TestId+".jpeg");
		FileHandler.copy(src, dest);
	}
	
}
