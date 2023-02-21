package TaskMainPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 {
	WebDriver driver;
	
	@FindBy (xpath="//input[@id='i0116']") private WebElement username;
	
	@FindBy (xpath="//input[@id='idSIButton9']") private WebElement next;
	
	
	public Page1(){
		System.out.println("Hi");
	}
	
	public Page1(WebDriver driver) {
		
		PageFactory.initElements(driver, this);;;
		this.driver=driver;
	}
	
	
	public void firstpage() {
		username.sendKeys("abhijeet.yadav@citiustech.com");
		next.click();
	}
	
	
	

}
