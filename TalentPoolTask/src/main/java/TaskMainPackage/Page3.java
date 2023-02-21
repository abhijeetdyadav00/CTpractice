package TaskMainPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3 {
	WebDriver driver;
	
	@FindBy (xpath="//input[@id='idBtn_Back']") private WebElement no;
	
	public Page3(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver=this.driver;
	}
	
	public void thirdpage() {
		no.click();
	}
	
	

}
