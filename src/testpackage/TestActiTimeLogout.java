package testpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagepackage.HomePage;
import pagepackage.LoginPage;

public class TestActiTimeLogout extends BaseTest {
	@Test
	public void logout() throws IOException, InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		String username = flib.readPropertyData(PROPERTY_PATH, "username");
		String password = flib.readPropertyData(PROPERTY_PATH, "password");
		lp.validLoginActiTime(username, password);
		Thread.sleep(4000);
		HomePage hp = new HomePage(driver);
		hp.logoutActitime();
	}

}
