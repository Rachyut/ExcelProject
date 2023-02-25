package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class ProfilePage {
 
	WebDriver driver;
	
	public ProfilePage(WebDriver driver) {
		this.driver=driver;
	}
	 
	
	//Elements
	@FindBy(how = How.XPATH,using = "//a[@id='summary']")WebElement Summary_Header_Element;
	
	//Intractable Methods
	public void ValidateProfilePage() {
		Assert.assertTrue(Summary_Header_Element.isDisplayed(),"Profile page not found.");
	}
	
}
