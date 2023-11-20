package test;

import org.testng.annotations.Test;

import page.LoginPage;

public class LoginTest extends BaseTest {
	

  @Test
  public void f() {
	  LoginPage lp=new LoginPage(driver);
	  lp.doLogin("tutorial", "tutorial");
  }
  
}
