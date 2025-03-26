package LinkHive.LinkHive;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseDetail.BaseDetail;
import POM.LoginPage;
import TestCaseData.TestCase_Data1;

public class LoginTest extends BaseDetail{
	String act;
	String exp;
	public LoginPage loginPage;
	
	/*public LoginTest() {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		launchApp();
		loginPage = new LoginPage();
	}
	*/
	@Test(priority = 25)
	public void getVerify_CurrentTitle() {
		
		loginPage = new LoginPage();
		act = getTitle2();
		exp = "SignIn Page | Linqhive";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 26)
	public void getVerify_CurrentUrl() {
		act = currentUrl();
		exp = "https://user.linqhive.com/signin";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 27)
	public void verify_linkHiveLogo() {
		Assert.assertTrue(loginPage.linkHiveLogo());
	}
	
	@Test(priority = 28)
	public void verify_WelcomeBackText_Spelling() {
		act = loginPage.getWelcomeText();
		exp = "Welcome back! Please enter your details.";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 29)
	public void verify_signInText_Spelling() {
		act = loginPage.signInText();
		exp = "Sign In";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 30)
	public void verify_emailLabel_Spelling() {
		act = loginPage.email_Label();
		exp = "Email *";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 31)
	public void verify_emailPlaceHolder_Spelling() {
		act = loginPage.email_PlaceHolder();
		exp = "Enter your email";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 32)
	public void verify_emailisEnabled_Or_Not() {
		Assert.assertTrue(loginPage.email_enabledOrNot());
	}
	
	@Test(priority = 33)
	public void verify_passwordLabel_Spelling() {
		act = loginPage.password_Label();
		exp = "Password *";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 34)
	public void verify_PlaceHolder_Spelling() {
		act = loginPage.password_placeHolder();
		exp = "Enter password";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 35)
	public void verify_password() {
		Assert.assertTrue(loginPage.password_enabledOrNot());
	}
	
	@Test(priority = 36)
	public void verify_signInButton_Spelling() {
		act = loginPage.signIn_Button();
		exp = "Sign In";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 37)
	public void verify_signInButton_Or_Not() {
		Assert.assertTrue(loginPage.signInButton_enableOrNot());
	}
	
	@Test(priority = 38)
	public void verify_dontHaveAccount_Spelling() {
		act = loginPage.dontHaveAccountText();
		exp = "Don't have an account ? Sign Up";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 39)
	public void verify_signUpLink() {
		loginPage.signUpLink();
		act = currentUrl();
		exp = "https://user.linqhive.com/signup";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 40)
	public void verify_signInLink() {
		loginPage.signIn_Link();
		act = currentUrl();
		exp = "https://user.linqhive.com/signin";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 41,dataProvider = "getSignInTestData",dataProviderClass = TestCase_Data1.class)
	public void login_Cred(String userName, String passWord){
		loginPage.login(userName, passWord);
		
		if(userName == null || userName.trim().isEmpty()) {
			Assert.assertEquals(loginPage.getEmailerror(),"Please enter your email.");
		}
		else if(passWord == null || passWord.trim().isEmpty()) {
			Assert.assertEquals(loginPage.getPasserror(), "Please enter your password.");
		}
		else if(userName.length() < 10){
			Assert.assertEquals(loginPage.getEmailerror(),"Please enter at least 10 characters.");
		}
		else if(passWord.length() < 6){
			Assert.assertEquals(loginPage.getPasserror(),"Password must be at least 6 characters long.");
		}
		else if(passWord.equals("<script>")) {
			act = loginPage.scriptToaster();
			exp = "Invalid credentials";
			Assert.assertEquals(act, exp);
			loginPage.waitforElementBeInVisible();
		}
		else if(userName.equals("hexanewuser1@gmail.com")&& passWord.equals("Test@123")) {
			Assert.assertEquals(loginPage.successLoginToaster(), "Login successful.");
			//Assert.assertTrue(currentUrl().contains("admin"));
		}
		else {
			Assert.assertEquals(loginPage.scriptToaster(), "Invalid credentials");
			loginPage.waitforElementBeInVisible();
		}
	}
	

}
