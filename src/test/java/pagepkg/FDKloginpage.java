package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FDKloginpage 
{
	WebDriver driver;
	
	
	@FindBy(name="name")
	WebElement fulname;
	@FindBy(name="email")
	WebElement emailfld;
	@FindBy(name="phone")
	WebElement phnnumber;	
	@FindBy(name="pass1")
	WebElement paswrd1;	
	@FindBy(name="pass2")
	WebElement paswrd2;	
	@FindBy(name="register")
	WebElement regstrbtn;
	
	
	@FindBy(xpath="/html/body/header/div[3]/div[1]/div[4]/ul/li[2]/p[1]/a")
	WebElement loginlnk;
	
	
	
	
	@FindBy(xpath="/html/body/div[2]/div/form[1]/div[1]/input")
	WebElement emaillogin;
	@FindBy(xpath="/html/body/div[2]/div/form[1]/div[2]/input")
	WebElement passwordlogin;
	@FindBy(xpath="/html/body/div[2]/div/form[1]/button")
	WebElement loginbtn;
	
	
	
	
	
	
	public FDKloginpage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	public void setValues(String fullname,String emailid,String phonenumber,String password1,String password2)
	{
		
		fulname.sendKeys(fullname);
		emailfld.sendKeys(emailid);
		phnnumber.sendKeys(phonenumber);
		paswrd1.sendKeys(password1);
		paswrd2.sendKeys(password2);
	}
	
	public void registrationmthd()
	{
		
		regstrbtn.click();
	}
	
	
	public void loginlink()
	{
		loginlnk.click();
	}
	
	public void setValues2(String emailid,String password)
	{
		emaillogin.sendKeys(emailid);
		passwordlogin.sendKeys(password);
	}
	
	public void loginmthd()
	{
		
		loginbtn.click();
	}
	public void clearemail()
	{
		emaillogin.clear();
	}

	public void clearpass()
	{
		passwordlogin.clear();
		driver.navigate().refresh();
	}
	
	
	
	
	
	

}
