package TestNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing1 
{
	// i want only A,D to be tested
  @Test
  public void A()
  {
	  Reporter.log("A TC is Running", true);
  }
  
  @Test
  public void B()
  {
	  Reporter.log("B Tc is Running", true);
  }
  
  @Test
  public void C()
  {
	  Reporter.log("C Tc is Running", true);
  }
  
  @Test
  public void D()
  {
	  Reporter.log("D Tc is Running", true);
  }
  
  @Test
  public void E()
  {
	  Reporter.log("E Tc is Running", true);
  }
}
