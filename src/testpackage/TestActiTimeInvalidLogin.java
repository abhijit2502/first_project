package testpackage;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagepackage.LoginPage;

public class TestActiTimeInvalidLogin extends BaseTest{
	@Test
	public void invalidLoginToActiTime() throws EncryptedDocumentException, IOException, InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		int rc = flib.getRowCount(EXCEL_PATH, "invaliddata");
		for(int i=1;i<=rc;i++)
		{

			lp.invalidLoginActiTime(flib.readExcelData(EXCEL_PATH, "invaliddata", i, 0)
					, flib.readExcelData(EXCEL_PATH, "invaliddata", i, 1));

		}
	}

}
