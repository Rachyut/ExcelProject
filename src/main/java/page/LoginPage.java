package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
      this.driver = driver;
	}
	
	//ELEMENTS
	@FindBy(how = How.XPATH, using = "//input[@id='username']") WebElement Username_Element;
	@FindBy(how = How.XPATH, using = "//input[@id='password']") WebElement Password_Element;
	@FindBy(how = How.XPATH, using = "//button[@name='login']") WebElement SignIn_Element;
	
	
	
    //INTRACTABLE METHODS
	
	public void insertusername(String username) {
		Username_Element.sendKeys(username);
	}
    public void insertpassword(String password) {
    	Password_Element.sendKeys(password);}
    
    public void clickonsigninbutton() {
    	SignIn_Element.click();
    }
    	
    
	
	
}
