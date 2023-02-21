package TaskMainPackage;
import java.time.Duration;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page4 {
	WebDriver driver;
	
	@FindBy (xpath="//a[text()='Tools']") private WebElement tools;
	@FindBy (xpath="//img[@title='PGS']") private WebElement pgs;
	
	public Page4(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver=this.driver;
	}
	
	public void fourthpage(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(40));
		
		wait.until(ExpectedConditions.visibilityOf(tools));
		
		Actions act=new Actions(driver);
		act.moveToElement(tools).build().perform();
		
		try
		{tools.click();}
		catch(ElementClickInterceptedException z)
		{
			tools.click();
		}
		
		pgs.click();
	}

}
