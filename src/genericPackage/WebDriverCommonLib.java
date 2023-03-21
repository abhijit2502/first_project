package genericPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class WebDriverCommonLib extends BaseTest
{
	public void getPageTitle(String pageName)
	{
      String titleOfThePage = driver.getTitle();
      Reporter.log("The title of"+pageName+"is"+titleOfThePage);
		
	}
	public void verifyPageTitle(String pageName,String expectedTitle)
	{
		String actualPageTitle = driver.getTitle();
		if (actualPageTitle.equals(actualPageTitle)) 
		{	
		Reporter.log(" "+pageName+"Title is mached",true);
		
		}
		else
		{
		Reporter.log(" "+pageName+"Title is not matched",true);
		}
	}
	
	public void selectTheOptionOfDropdown(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	public void selectTheOptionOfDropdown(WebElement element,String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	public void selectTheOptionOfDropdown(String visibleText,WebElement element)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(visibleText);
	}
    
	public void switchToFrame(int index)
	{
		driver.switchTo().frame(index);
	}
	public void switchToFrame(String nameOrId)
	{
		driver.switchTo().frame(nameOrId);
	}
	public void switchToFrame(WebElement frameElement)
	{
		driver.switchTo().frame(frameElement);
	}
	
	public void rightClick(WebElement targetElement)
	{
		Actions act = new Actions(driver);
		act.contextClick(targetElement).perform();
	}
	public void moveToElement(WebElement targetElement)
	{
		Actions act = new Actions(driver);
		act.contextClick(targetElement).perform();
	}
	public void doubleClickOnWebElement(WebElement targetElement)
	{
		Actions act = new Actions(driver);
		act.contextClick(targetElement).perform();
	}
	public void dragAndDropOnWebElement(WebElement targetElement)
	{
		Actions act = new Actions(driver);
		act.contextClick(targetElement).perform();
	}
	
	
	
	public void scrollDown(int pixel)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+(pixel)+")");
	}
	public void scrollUp(int pixel)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+(-pixel)+")");
	}
	public void scrollLeft(int pixel)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+(-pixel)+",0)");
	}
	public void scrollRight(int pixel)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+(pixel)+",0)");
	}

	public void scrollTillPerticularWebElement(WebElement element)
	{
		Point loc = element.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
	}
	
	public void hitEnterButton() throws AWTException
	{
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
	public void generatePrintPopUp() throws AWTException
	{
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_P);
	}
	public void copy() throws AWTException
	{
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
	}
	public void acceptAlert()
	{
	   Alert al = driver.switchTo().alert();	
	   al.accept();
	}
	public void dismissJavascriptPopUp()
	{
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}
	public void printAllOptionsOfDropDown(WebElement element)
	{
		Select sel = new Select(element);
		List<WebElement> allops = sel.getOptions();
		for(WebElement we:allops)
		{
			String text = we.getText();
			System.out.println(text);
		}
		
	}


}
