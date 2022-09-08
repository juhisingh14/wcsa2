package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test(description="This test is used to perform a valid login")
  public void ValidActiTimeTest() {
	  Reporter.log("valid login is performed",true);
  }
  @Test(description="This test is used to perform a invalid login")
  public void invalidValidActiTimeTest() {
	  Reporter.log("invalid login is performed",true);

}
  }
