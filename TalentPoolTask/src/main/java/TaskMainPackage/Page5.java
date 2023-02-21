package TaskMainPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Page5 {
	private WebDriver driver;

	@FindBy (xpath="//span[text()='HRIS']") private WebElement hris;
	
	@FindBy (xpath="//span[text()='Employee Details']") private WebElement employeedetails;
	
	public Page5(WebDriver driver) {
		PageFactory.initElements(driver,this);
		driver=this.driver;
	}
	
	public void fifthpage(WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(hris).click().build().perform();
		employeedetails.click();
		
	}
	

	
	

	
	
	
}
