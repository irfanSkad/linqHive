package LinkHive.LinkHive;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseDetail.BaseDetail;
import POM.LoginPage;
import POM.SignUpPage;
import TestCaseData.TestCase_Data1;

public class SignUpTest extends BaseDetail{
	
	String act;
	String exp;
	public SignUpPage signUp;
	
	public SignUpTest() {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		launchApp();
		signUp = new SignUpPage();
	}
	
	@Test(priority = 1)
	public void getCurrentUrl() {
		act = currentUrl();
		exp = "https://user.linqhive.com/signup";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 2)
	public void getCurrentTitle() {
		act = getTitle2();
		exp = "SignUp Page | Linqhive";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 3)
	public void verify_LinkHive_Logo(){
		Assert.assertTrue(signUp.linkHiveLogo());
	}
	
	@Test(priority = 4)
	public void verify_SignUpText(){
		act = signUp.signUp_Text();
		exp = "Sign Up";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 5)
	public void verify_firstNameLabel_Spelling(){
		act = signUp.firstName_LabelText();
		exp = "First Name *";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 6)
	public void verify_firstNamePlaceHolder_Spelling(){
		act = signUp.firstName_placeHolder();
		exp = "Enter First Name";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 7)
	public void verify_firstNameEnableOrNot(){
		Assert.assertTrue(signUp.firstNameEnabledOrNot());
	}

	@Test(priority = 8)
	public void verify_lastNameLebel_Spelling(){
		act = signUp.lastName_LabelText();
		exp = "Last Name *";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 9)
	public void verify_lastNamePlaceHolder_Spelling(){
		act = signUp.lastName_placeHolder();
		exp = "Enter Last Name";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 10)
	public void verify_lastNameEnableOrNot(){
		Assert.assertTrue(signUp.lastNameEnabledOrNot());
	}

	@Test(priority = 11)
	public void verify_emailLabel_Spelling(){
		act = signUp.email_LabelText();
		exp = "Email *";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 12)
	public void verify_emailPlaceHolder_Spelling(){
		act = signUp.email_placeHolder();
		exp = "Enter Email Address";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 13)
	public void verify_emailEnableOrNot(){
		Assert.assertTrue(signUp.emailEnabledOrNot());
	}
	
	@Test(priority = 14)
	public void verify_passwordLabel_Spelling(){
		act = signUp.password_LabelText();
		exp = "Password *";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 15)
	public void verify_passwordPlaceHolder_Spelling(){
		act = signUp.password_placeHolder();
		exp = "Enter Password";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 16)
	public void verify_passwordEnableOrNot(){
		Assert.assertTrue(signUp.passwordEnabledOrNot());
	}
	
	@Test(priority = 17)
	public void verify_confirmPasswordLabel_Spelling(){
		act = signUp.confirmpassword_LabelText();
		exp = "Confirm Password *";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 18)
	public void verify_confirmPasswordPlaceHolder_Spelling(){
		act = signUp.confirmpassword_placeHolder();
		exp = "Enter Confirm Password";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 19)
	public void verify_confirmPasswordEnableOrNot(){
		Assert.assertTrue(signUp.confirmpasswordEnabledOrNot());
	}
	
	@Test(priority = 20)
	public void verify_signUp_Spelling(){
		act = signUp.signUpText();
		exp = "Sign Up";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 21)
	public void verify_signUpButtonEnableorNot(){
		Assert.assertTrue(signUp.signUpButtonEnableOrNot());
	}
	
	@Test(priority = 22)
	public void verify_alreadyHaveAccount_Spelling(){
		act = signUp.alreadyHaveAccountText();
		exp = "Already have an account? Sign In";
		Assert.assertEquals(act, exp);
	}
	@Test(priority = 23,dataProvider = "getSignUpTestData",dataProviderClass = TestCase_Data1.class)
	public void login_SignUp(String firstName, String lastName, String email, String password, String cnPassword){
		String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		signUp.signUp(firstName, lastName, email, password, cnPassword);
		
		if(firstName == null || firstName.trim().isEmpty()) {
			Assert.assertEquals(signUp.firstNameError(),"Please enter your first name");
		}
		else if(lastName == null || lastName.trim().isEmpty()) {
			Assert.assertEquals(signUp.lastNameError(),"Please enter your last name");
		}
		else if(email == null || email.trim().isEmpty()) {
			Assert.assertEquals(signUp.emailError(),"Please enter your email address");
		}
		else if(password == null || password.trim().isEmpty()) {
			Assert.assertEquals(signUp.passwordError(),"Please provide a password");
		}
		else if(cnPassword == null || cnPassword.trim().isEmpty()) {
			Assert.assertEquals(signUp.conformPassword(),"Please confirm your password");
		}
		else if(firstName.length() < 3) {
			
			Assert.assertEquals(signUp.firstNamelessThan_3Characters(),"Your first name must be at least 3 characters long");
		}
		else if(lastName.length() < 3) {
			
			Assert.assertEquals(signUp.lastNamelessThan_3Characters(),"Your last name must be at least 3 characters long");
		}
			
		else if(!(email.matches(emailRegex))) {
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(signUp.invalidEmail_error(), "Please enter a valid email address");  
			softAssert.assertEquals(signUp.invalidEmail_error(), "Please enter a valid email addresssde (e.g., user@example.com)."); 

			//Assert.assertEquals(signUp.invalidEmail_error(),"Please enter a valid email address" );
		}
		
		
		else if(password.length() < 8){
			Assert.assertEquals(signUp.passwordlessThan_6Characters(),"Your password must be at least 8 characters long");
		}
		
		else if(cnPassword.length() < 8) {
			Assert.assertEquals(signUp.confirmpasswordlessThan_6Characters(),"Your confirmPassword must be at least 8 characters long");
		}
		
		else if(!(password.equals(cnPassword))) {
			Assert.assertEquals(signUp.notMatchedPasswordAndConfirmPassWord(),"Passwords do not match");
		}
		else if (firstName.matches(".*\\s{2,}.*")) {
		    System.out.println("Invalid First Name: More than one consecutive space is not allowed.");
		}
		else if (firstName.matches("^[a-zA-Z0-9@!#$%^&&*()<>]+")){
		    System.out.println("Invalid First Name: Only alphabetic characters are allowed.");
		} 
		else if (lastName.matches(".*\\s{2,}.*")) {
		    System.out.println("Invalid First Name: More than one consecutive space is not allowed.");
		}
		else if (lastName.matches("^[a-zA-Z0-9@!#$%^&&*()<>]+")) {
		    System.out.println("Invalid First Name: Only alphabetic characters are allowed.");
		}
		else if(email.equalsIgnoreCase("nova.adham@fileexp.com")) {
			Assert.assertEquals(signUp.alreadyCreatedMail(), "This email is already registered. Please log in.");
		}
		/*else if(email.equalsIgnoreCase("mohamad.jaeshawn123@fileexp.com")) {
			Assert.assertEquals(signUp.successToasterAlert(), "Registration successful! You are now logged in.");
		}
		else if(currentUrl().equalsIgnoreCase("https://linkhive.edificecms.net/admin/signin")) {
				act = currentUrl();
				exp = "https://user.linqhive.com/signin";
				Assert.assertEquals(act, exp);
		}*/
		
	}
	@Test(priority = 24)
	public void verify_clickSignIn() {
		signUp.click_signIn();
		act = currentUrl();
		exp = "https://user.linqhive.com/signin";
		Assert.assertEquals(act, exp);
	}
		
}

