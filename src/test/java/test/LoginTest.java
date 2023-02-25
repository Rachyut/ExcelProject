package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class LoginTest {

	WebDriver driver;
	ExcelReader exlread = new ExcelReader("testData\\TF_TestData.xlsx");
	
	
	String username = exlread.getCellData("LoginInfo","UserName",2);
	String password = exlread.getCellData("LoginInfo","Password",2);
	
	
@Test
public void ValidUserShouldAbleToLogin() {
	
	 driver = BrowserFactory.init();
	 LoginPage loginpage = PageFactory.initElements(driver,LoginPage.class);
	 
	 loginpage.insertusername(username);
	 loginpage.insertpassword(password);
	 loginpage.clickonsigninbutton();
	 
	 DashboardPage dashboardpage = PageFactory.initElements(driver,DashboardPage.class);
	 dashboardpage.ValidateDashboardPage();

	 
	
}

	
}

