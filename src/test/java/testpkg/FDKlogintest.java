package testpkg;

import java.io.IOException;

import org.testng.annotations.Test;

import basepkg.FreshdaykartBase;
import pagepkg.FDKloginpage;
import utilpkg.Freshdaykartutility;

public class FDKlogintest extends FreshdaykartBase
{
	
	 /*@Test(priority=1,enabled=false)
	// registration
	public void getCellValue() throws IOException
	{
		driver.get("https://freshdaykart.com/sign-up");
		FDKloginpage p1= new FDKloginpage(driver);
		 String xl= "C:\\Users\\deepe\\Documents\\seleniumfldr\\Freshdaykartinput.xlsx";
		  String sheet= "Sheet1";
		  int rowcount= Freshdaykartutility.rowCount(xl, sheet);
		  System.out.println(rowcount);
		  for(int i=1;i<rowcount;i++)
		  {
			  
			  String fullname= Freshdaykartutility.cellData(xl, sheet, i,0);
			  System.out.println(fullname);
			  String emailid= Freshdaykartutility.cellData(xl, sheet, i,1);
			  System.out.println(emailid);
			  String phonenumber= Freshdaykartutility.cellData(xl, sheet, i,2);
			  System.out.println(phonenumber);
			  String password= Freshdaykartutility.cellData(xl, sheet, i,3);
			  System.out.println(password);
			  String retypepassword= Freshdaykartutility.cellData(xl, sheet, i,4);
			  System.out.println(retypepassword);
			  
			  p1.setValues(fullname,emailid,phonenumber,password,retypepassword);
	          p1.registrationmthd();
		  }	
	} */
	
	@Test
	//Logging in
	public void logintst() throws IOException
	{
		  FDKloginpage p1= new FDKloginpage(driver);
		  p1.loginlink();
		  String xl= "C:\\Users\\deepe\\Documents\\seleniumfldr\\Freshdaykartinput.xlsx";
		  String sheet= "Sheet2";
		  int rowcount= Freshdaykartutility.rowCount(xl, sheet);
		  System.out.println(rowcount);
		  for(int i=1;i<=rowcount;i++)
		  {
			  
			 
			  String emailid= Freshdaykartutility.cellData(xl, sheet, i,0);
			  System.out.println(emailid);
			  String password= Freshdaykartutility.cellData(xl, sheet, i,1);
			  System.out.println(password);
			 
			  
			  p1.setValues2(emailid,password);
	          p1.loginmthd();
		  
		  
		  String actual= driver.getCurrentUrl();
	      String expected= "https://freshdaykart.com/profile";
	      if(actual.equals(expected))
	      {
	    	  System.out.println("pass");
	      }
	      else
	      {
	    	  System.out.println("fail");
	    	  p1.clearemail();
	    	  p1.clearpass();
	      }
	}
	}
		  
	
	

}
