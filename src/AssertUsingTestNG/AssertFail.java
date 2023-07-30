package AssertUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFail {
  @Test
  public void MyTc() 
  {
	  Assert.fail();
  }
}
