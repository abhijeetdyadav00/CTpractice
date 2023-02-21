package TaskMainPackage;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page6 {
	WebDriver driver;
	
	
	@FindBy (xpath="//div[@id='ctl00_ContentPlaceHolder1_pnlMainLables']//tr//descendant :: span[@id='ctl00_ContentPlaceHolder1_lblCTEmpID1']") private WebElement id;
	@FindBy (xpath="(//div[@id='ctl00_ContentPlaceHolder1_pnlMainLables']//table//tbody//table//tr)[4]//td[4]") private WebElement employeeid;
	@FindBy (xpath="//td[@id='tdEmpInfo']//tr[@id='trGroup1']//td[@id='tdTravel']")private WebElement travel ;
	@FindBy (xpath="//select[@id='ctl00_ContentPlaceHolder1_cboTravelCountry']")private WebElement country ;
	@FindBy (xpath="//select[@id='ctl00_ContentPlaceHolder1_cboTypeOfTravel']")private WebElement type ;
	@FindBy (xpath="//select[@id='ctl00_ContentPlaceHolder1_cboTravelNoOfTrips']")private WebElement tripno ;
	@FindBy (xpath="//select[@id='ctl00_ContentPlaceHolder1_cboTravelEstDuration']")private WebElement duration;
	@FindBy (xpath="//input[@id='btnTravelAdd']")private WebElement addbutton;
	@FindBy (xpath="//table[@id='ctl00_ContentPlaceHolder1_grdTravel']//tbody//tr//img[@src='images/Delete.png']") private WebElement remove;
	@FindBy (xpath="//textarea[@id='txtTravelRemarks']")private WebElement textbox;
	public Page6(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}	
	
	public void employeeid() {
		System.out.println(employeeid.getText() +"      "+ id.getText());
	}
	
	public void travelclick() {
		travel.click();
	}

	
	public void adddata(int a,int b,int c, int d) {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.visibilityOfAllElements(country,type,tripno,duration));
		
		Select addcountry=new Select(country);
		Select addtype=new Select(type);
		Select addtripno=new Select(tripno);
		Select addduration=new Select(duration);
		
		
		try
		{
		addcountry.selectByIndex(a);
		addtype.selectByIndex(b);
		addtripno.selectByIndex(c);
		addduration.selectByIndex(d);
	    String x=addcountry.getFirstSelectedOption().getText();
	    textbox.sendKeys(x);
	    addbutton.click();
	    
		}
		catch(NoSuchElementException s)
		{
			addcountry.selectByIndex(a);
			addtype.selectByIndex(b);
			addtripno.selectByIndex(c);
			addduration.selectByIndex(d);
		    String x=addcountry.getFirstSelectedOption().getText();
		    textbox.sendKeys(x);
			addbutton.click(); 
		}
	   
	 
	}
	
	
	
	
	public void remove(WebDriver driver,String x) {
		WebElement removelist=driver.findElement(By.xpath("(//table[@id='ctl00_ContentPlaceHolder1_grdTravel']//tbody//tr//img[@src='images/Delete.png'])"+x));
		removelist.click();
		driver.switchTo().alert().accept();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
