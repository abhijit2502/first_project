package testpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagepackage.LoginPage;

public class TestActiTimeValidLogin extends BaseTest  
{
	@Test
	public void TestValidLogin() throws IOException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		String username = flib.readPropertyData(PROPERTY_PATH, "username");
		String password = flib.readPropertyData(PROPERTY_PATH, "password");
		lp.validLoginActiTime(username, password);
	}

}
