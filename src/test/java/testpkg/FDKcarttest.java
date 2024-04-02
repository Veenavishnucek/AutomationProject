package testpkg;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import basepkg.FreshdaykartBase;
import pagepkg.FDKcartpage;



public class FDKcarttest extends FreshdaykartBase
{	
	
	@Test
	// adding vegetables to the cart
	public void addToCart()
	{
		FDKcartpage p1= new FDKcartpage(driver);
		p1.vegSelect();
        List <WebElement> adding=driver.findElements(By.xpath("//*[@class='pro_cart my-btn']"));
        int cartItems_exp = adding.size();
        System.out.println("Number of items in the cart="+cartItems_exp);
        for(WebElement ele:adding)
        {
        	ele.click();
        }
        System.out.println("Added items to cart successfully");
	  
	    driver.get("https://freshdaykart.com/cart");
		List <WebElement> list= driver.findElements(By.xpath("//*[@id=\"mycrt\"]/div/div[2]/div"));
		int actualitems= list.size();
		System.out.println(actualitems);
		System.out.println(cartItems_exp);
		if(actualitems==cartItems_exp)
		{
			System.out.println("Items in the cart verified successfully");
		}
		else
		{
			System.out.println("Number of items in the cart not matching with added items");
		}
		
	}	
	
	

	@Test
	public void clearCart()
	{
		FDKcartpage p1= new FDKcartpage(driver);
		p1.basket();
		p1.mtcart();
		p1.alerthndl();
		System.out.println("Cart cleared");
		
	}
	
	
	@Test
	public void shopingcontinue()
	{
		FDKcartpage p1= new FDKcartpage(driver);
		p1.basket();
		p1.contnuShopn();
		String act= driver.getCurrentUrl();
		String exp= "https://freshdaykart.com/";
		if(exp.equals(act))
		{
			System.out.println("Continue shopping button tested successfully");
		}
		else
		{
			System.out.println("Continue shopping button test failed");
		}
		
	}
	
	
	@Test
	public void checkOut()
	{
		FDKcartpage p1= new FDKcartpage(driver);
		p1.basket();
		p1.proceedchkout();
		String act= driver.getCurrentUrl();
		String exp= "https://freshdaykart.com/cart";
		if(exp.equals(act))
		{
			System.out.println("Proceed checkout button tested successfully");
		}
		else
		{
			System.out.println("Proceed checkout button test failed");
		}
		
	}

}
