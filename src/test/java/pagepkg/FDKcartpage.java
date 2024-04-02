package pagepkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FDKcartpage {
	
	WebDriver driver;
	
	
	@FindBy(xpath="/html/body/header/div[3]/div[2]/div/nav/div[2]/ul/li[1]/button")
	WebElement shopByDpmt;
	@FindBy(xpath="/html/body/header/div[3]/div[2]/div/nav/div[2]/ul/li[1]/ul/li[1]/a")
	WebElement FruitsVeg;
	@FindBy(xpath="/html/body/header/div[3]/div[2]/div/nav/div[2]/ul/li[1]/ul/li[1]/ul/li[1]/a")
	WebElement vegtbls;
	
	
	@FindBy(xpath="/html/body/header/div[3]/div[1]/div[4]/ul/li[1]/a[2]")
	WebElement myBasket;
	@FindBy(xpath="//*[@id=\"payd\"]/div/div[2]/a[1]")
	WebElement emptycart;
	
	
	@FindBy(xpath="//*[@id=\"payd\"]/div/div[2]/a[2]")
	WebElement continueshopng;
	
	@FindBy(xpath="//*[@id=\"payd\"]/div/div[3]/a")
	WebElement chkout;
	
	
	public FDKcartpage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	public void vegSelect()
	{
		Actions act= new Actions(driver);
		act.moveToElement(shopByDpmt);
		act.moveToElement(FruitsVeg);
		act.perform();
		vegtbls.click();
	}
	
	public void basket()
	{
		myBasket.click();
	}
	
	public void mtcart()
	{
		emptycart.click();
	}
	
	public void alerthndl()
	{
		Alert a= driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println("Alert text="+alerttext);
		a.accept();
	}
	
	public void contnuShopn()
	{
		continueshopng.click();
	}
	
	public void proceedchkout()
	{
		chkout.click();
	}
	
	

}
