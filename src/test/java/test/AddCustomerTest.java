package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import page.ProfilePage;
import util.BrowserFactory;
import util.ExcelReader;

public class AddCustomerTest {

	WebDriver driver;
	ExcelReader exlread = new ExcelReader("C:\\Users\\15719\\Selenium\\session7\\testData\\TF_TestData.xlsx");
	
	//VARIABLES
        String username = exlread.getCellData("LoginInfo","UserName",2);
        String password = exlread.getCellData("LoginInfo","Password",2);
        String fullname = exlread.getCellData("AddContactInfo","FullName",2);
        String company = exlread.getCellData("AddContactInfo","CompanyName",2);
        String email = exlread.getCellData("AddContactInfo","Email",2);
        String phone =exlread.getCellData("AddContactInfo","Phone",2);
        String address =exlread.getCellData("AddContactInfo","Address",2);
        String zipcode = exlread.getCellData("AddContactInfo","Zip",2);
        String State = exlread.getCellData("AddContactInfo","State",2);
        String city = exlread.getCellData("AddContactInfo","City",2);
        String country = exlread.getCellData("AddContactInfo","Country",2);
        
        
        
       @Test 
        public void UserShouldBeAbleToAddCustomer() throws InterruptedException {
        	driver = BrowserFactory.init();
        	
        	LoginPage loginpage = PageFactory.initElements(driver,LoginPage.class);
        	loginpage.insertusername(username);
        	loginpage.insertpassword(password);
        	loginpage.clickonsigninbutton();
        	
        	DashboardPage dashboardpage = PageFactory.initElements(driver,DashboardPage.class);
        	dashboardpage.ValidateDashboardPage();
        	dashboardpage.ClickOnCustomerButton();
        	dashboardpage.ClickOnAddCustomerButton();
        	
        	AddCustomerPage addcustomerpage = PageFactory.initElements(driver,AddCustomerPage.class);
        	addcustomerpage.ValidAddContactPage();
        	addcustomerpage.insertfullname(fullname);
        	addcustomerpage.selectcompany(company);
        	addcustomerpage.insertemail(email);
        	addcustomerpage.insertphone(phone);
        	addcustomerpage.insertaddress(address);
        	addcustomerpage.insertcity(city);
        	addcustomerpage.insertstate(State);
        	addcustomerpage.insertzipcode(zipcode);
        	addcustomerpage.selectcountry(country);
        	addcustomerpage.clickonsavebutton();
        	
        
           ProfilePage profilepage = PageFactory.initElements(driver,ProfilePage.class);
           profilepage.ValidateProfilePage();
           
           dashboardpage.ClickOnListCustomer();
           
           
       }   
}
