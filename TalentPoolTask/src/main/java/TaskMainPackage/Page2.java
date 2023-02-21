package TaskMainPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2 {
	
	WebDriver driver;
	
	@FindBy (xpath="//input[@id='passwordInput']")private WebElement pass;
	
	@FindBy (xpath="//span[@id='submitButton']")private WebElement submit;
	
	
	public Page2(WebDriver driver) {
		PageFactory.initElements(driver, this);
			driver=this.driver;
	}
	
	public void secondpage(){
		pass.sendKeys("Mh12mt7521");
		
		submit.click();
		
	}

}
