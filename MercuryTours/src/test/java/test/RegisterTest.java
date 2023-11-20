package test;

import org.testng.annotations.Test;

import page.RegisterPage;

public class RegisterTest extends BaseTest {
	
  @Test
  public void f() {
	  RegisterPage rp=new RegisterPage(driver);
	  rp.doRegister("Nysha", "Manoj", "9495616988", "nyshamanojap@gmail", "kunnakadan house", "Kalpetta", "kerala", "673577", "tutorial", "tutorial", "tutorial");
  }
 
}
