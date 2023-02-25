package page;

import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ListCustomerPage extends Basepage{
	
	WebDriver driver;
	 public ListCustomerPage(WebDriver driver) {
		 this.driver = driver;
		 
		
	 }
	
		// //tbody/tr[1]/td[3]
		// //tbody/tr[2]/td[3]
	 
	 //Dynamic WebElement
	 String before_xpath = "//tbody/tr[ ";
	String after_xpath = "]/td[3]";
	String after_xpath_delete = "]/td[7]/a[2]";
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'OK')]" )WebElement OK_Button_Element;
	 
	//Intractable Methods
	 public void ValidateInsertedNameAndDelete() {
		 
		 for(int i=1; i<=5 ; i++) {

			String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			
		if(name.contains(AddCustomerPage.insertedname)) {
			
			 driver.findElement(By.xpath(before_xpath + i + after_xpath_delete)).click();
			
		}	
			 
		 }
	
		 }
		
		 public void ClickOnOkButton() {
			 OK_Button_Element.click();
		 }
			 
		 
	 
	 
	 
				 
			 
		 
	 

}
