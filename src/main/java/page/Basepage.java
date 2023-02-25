package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basepage {
	
	public int generateRandomNum(int boundNum) {
		Random rnd = new Random();
		int generatedNum = rnd.nextInt(boundNum);
		return generatedNum;
	}

	public void SelectFromDropdown(WebElement element,String visisbletext) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visisbletext);
	}
	

	public void waitForElement(WebDriver driver, int waitTime, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, waitTime);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
}

