package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddCustomerPage extends Basepage{
	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	//Elements
	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Add Contact')]") WebElement AddContact_Header_Element;
	@FindBy(how = How.XPATH, using = "//input[@id='account']") WebElement FullName_Element;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']") WebElement Company_Dropdown_Element;
	@FindBy(how = How.XPATH, using = "//input[@id='email']") WebElement Email_Element;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']") WebElement Phone_Element;
	@FindBy(how = How.XPATH, using = "//input[@id='address']") WebElement Address_Element;
	@FindBy(how = How.XPATH, using = "//input[@id='city']") WebElement City_Element;
	@FindBy(how = How.XPATH, using = "//input[@id='state']") WebElement State_Element;
	@FindBy(how = How.XPATH, using = "//input[@id='zip']") WebElement ZipCode_Element;
	@FindBy(how = How.XPATH, using = "//select[@id='country']") WebElement Country_Dropdown_Element;
	//@FindBy(how = How.XPATH, using = "//select[@id='currency']") WebElement Currency_Dropdown_Element;
	//@FindBy(how = How.XPATH, using = "//select[@id='group']") WebElement Group_Dropdown_Element;
	@FindBy(how = How.XPATH, using ="//button[@id='submit']") WebElement Save_Element;
	
	//Intractable Methods
	
	public void ValidAddContactPage() throws InterruptedException {
		Thread.sleep(2000);
	Assert.assertTrue(AddContact_Header_Element.isDisplayed(),"AddContact page not found.");}
	
   static String insertedname;  
	public static String getinsertedname() {
		return insertedname;
	}
	
	public void insertfullname(String fullname) {
		 insertedname = fullname +generateRandomNum(99);
		FullName_Element.sendKeys(insertedname);
	}
	public void selectcompany(String company) {
		SelectFromDropdown(Company_Dropdown_Element,company);
	}
	public void insertemail(String email) {
	Email_Element.sendKeys(generateRandomNum(999)+email);
	}
	public void insertphone(String phone) {
		Phone_Element.sendKeys(phone+generateRandomNum(9999));
	}
	public void insertaddress(String address) {
		Address_Element.sendKeys(address);
	}
	public void insertcity(String city) {
		City_Element.sendKeys(city);
	}
	public void insertstate(String state) {
		State_Element.sendKeys(state);
	}
	public void insertzipcode(String zipcode) {
		ZipCode_Element.sendKeys(zipcode);
	}
	public void selectcountry(String country) {
		SelectFromDropdown(Country_Dropdown_Element,country);
	}
	//public void selectcurrency(String currency) {
		//SelectFromDropdown(Currency_Dropdown_Element,currency);
	
	//public void selectgroup(String group) {
		//SelectFromDropdown(Group_Dropdown_Element,group);
	
	public void clickonsavebutton() {
		Save_Element.click();
		
	}

		
	}
		
		
	
	
	
	

