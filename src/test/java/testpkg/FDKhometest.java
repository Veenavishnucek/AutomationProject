package testpkg;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import basepkg.FreshdaykartBase;
import pagepkg.FDKhomepage;
import pagepkg.FDKloginpage;
import sun.net.www.protocol.http.HttpURLConnection;

public class FDKhometest extends FreshdaykartBase
{
	
	@Test
	// Link count in the home page
	public void numbroflinks()
	{
        List <WebElement> li = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links =" +li.size());
        
       /* for(WebElement ele: li)
        {
        	String link = ele.getAttribute("href");
        	verify(link);
        }
	}
	private void verify(String link) 
	{
		try
		{
			URL u = new URL(link);
			HttpURLConnection con = (HttpURLConnection)u.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("Responsecode is 200-- successful");
			}
			else if(con.getResponseCode()==400)
			{
				System.out.println("Responsecode is 400 --Broken code");
			}
			else 
			{
				System.out.println("Not Expected");
			}
		}
		catch (Exception e)
		{
			e.getMessage();
		}*/
	}

	
	 @Test
	 // Domain name, Title name and URL of home page
	    public void TitleDomainURL() 					
	    {		
	        		
	        JavascriptExecutor js = (JavascriptExecutor)driver;		
	        		
	        String DomainName = js.executeScript("return document.domain;").toString();			
	        System.out.println("Domain name of the site = "+DomainName);					
	          		
	        String url = js.executeScript("return document.URL;").toString();			
	        System.out.println("URL of the site = "+url);					
	          		
	        String TitleName = js.executeScript("return document.title;").toString();			
	        System.out.println("Title of the page = "+TitleName);					

	    }
	 
	 @Test
	 // Testing the search field
	 public void searching()
	 {
		FDKhomepage p1= new FDKhomepage(driver);
		p1.srching();
		String actual= driver.getCurrentUrl();
		String expected= "https://freshdaykart.com/search?=book";
		if(actual.equals(expected))
		{
			System.out.println("Search field tested successfully");
		}
		else
		{
			System.out.println("Search field test failed");
		}
		
		
		
	 }
}
