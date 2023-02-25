package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;





public class DashboardPage {
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Elements
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Dashboard ')]") WebElement Dashboard_Header_Element;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Customers')]") WebElement Customer_Element;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Add Customer')]") WebElement AddCustomer_Element;
	@FindBy(how = How.XPATH,using = "//a[contains(text(),'List Customers')]")WebElement ListCustomer_Element;
	
	//Intractable Methods
	
		public void ValidateDashboardPage() {
			Assert.assertTrue(Dashboard_Header_Element.isDisplayed(),"Dashboard page not found. ");}
	
		
	public void ClickOnCustomerButton() {
		Customer_Element.click();
	}
	public void ClickOnAddCustomerButton() {
		AddCustomer_Element.click();
	}
	public void ClickOnListCustomer() {
		ListCustomer_Element.click();
	}

}
	


