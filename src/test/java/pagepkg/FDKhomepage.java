package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FDKhomepage {

	WebDriver driver;

	
	@FindBy(xpath="/html/body/header/div[3]/div[1]/div[2]/div/form/input")
	WebElement searchfld;
	@FindBy(xpath="/html/body/header/div[3]/div[1]/div[2]/div/form/button")
	WebElement searchbtn;
	
	
	
	public FDKhomepage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	public void srching()
	{
		searchfld.sendKeys("Book");
		searchbtn.click();
	}
	
	
}
