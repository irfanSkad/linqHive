package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDetail.BaseDetail;

public class SignUpPage extends BaseDetail{
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@src= 'https://user.linqhive.com/assets/images/logo.svg']")
	WebElement linkHiveLogo;
	
	@FindBy(xpath = "//h5")
	WebElement SignUpText;
	
	@FindBy(xpath = "//div[@class = 'mb-3']/label[text() = 'First Name ']")
	WebElement firstNameLabel;
	
	@FindBy(id = "first_name")
	WebElement firstNamePlaceHolder;
	
	@FindBy(xpath = "//div[@class = 'mb-3']/label[text() = 'Last Name ']")
	WebElement lastNameLabel;
	
	@FindBy(id = "last_name")
	WebElement lastNamePlaceHolder;
	
	@FindBy(xpath = "//div[@class = 'mb-3']/label[text() = 'Email ']")
	WebElement emailLabel;
	
	@FindBy(id = "email")
	WebElement emailPlaceHolder;
	
	@FindBy(xpath = "//div[@class = 'mb-3']/label[text() = 'Password ']")
	WebElement passwordLabel;
	
	@FindBy(id = "password")
	WebElement passwordPlaceHolder;
	
	@FindBy(xpath = "//div[@class = 'mb-3']/label[text() = 'Confirm Password ']")
	WebElement confirmPasswordLabel;
	
	@FindBy(id = "cpassword")
	WebElement confirmPassWordPlaceHolder;
	
	@FindBy(id = "signupBtn")
	WebElement signUp;
	
	@FindBy(xpath = "//p[text() = 'Already have an account? ']")
	WebElement getAlreadyHaveText;
	
	@FindBy(id = "first_name-error")
	WebElement firstName_error;
	
	@FindBy(id = "last_name-error")
	WebElement lastName_error;
	
	@FindBy(id = "email-error")
	WebElement email_error;
	
	@FindBy(id = "password-error")
	WebElement password_error;
	
	@FindBy(id = "cpassword-error")
	WebElement confirmPassword_error;
	
	@FindBy(xpath = "//div[@id = 'toast-container']/div/div[2]")
	WebElement toasterAlert;
	
	@FindBy(linkText = "Sign In")
	WebElement click_SignIn;
	
	public boolean linkHiveLogo(){
		boolean logo = linkHiveLogo.isDisplayed();
		System.out.println(logo);
		return logo;
	}
	
	public String signUp_Text() {
		String text = SignUpText.getText();
		System.out.println(text);
		return text;
	}
	
	public String firstName_LabelText() {
		String text = firstNameLabel.getText();
		System.out.println(text);
		return text;
	}
	
	public String firstName_placeHolder() {
		String text = firstNamePlaceHolder.getAttribute("placeholder");
		System.out.println(text);
		return text;
	}
	
	public boolean firstNameEnabledOrNot() {
		boolean firstName = firstNamePlaceHolder.isEnabled();
		System.out.println(firstName);
		return firstName;
	}
	
	public String lastName_LabelText() {
		String lastName = lastNameLabel.getText();
		System.out.println(lastName);
		return lastName;
	}
	
	public String lastName_placeHolder() {
		String text = lastNamePlaceHolder.getAttribute("placeholder");
		System.out.println(text);
		return text;
	}
	
	public boolean lastNameEnabledOrNot() {
		boolean lastName = lastNamePlaceHolder.isEnabled();
		System.out.println(lastName);
		return lastName;
	}
	
	public String email_LabelText(){
		String email = emailLabel.getText();
		System.out.println(email);
		return email;
	}
	
	public String email_placeHolder(){
		String email = emailPlaceHolder.getAttribute("placeholder");
		System.out.println(email);
		return email;
	}
	
	public boolean emailEnabledOrNot() {
		boolean email = emailPlaceHolder.isEnabled();
		System.out.println(email);
		return email;
	}
	
	public String password_LabelText(){
		String password = passwordLabel.getText();
		System.out.println(password);
		return password;
	}
	
	public String password_placeHolder(){
		String password = passwordPlaceHolder.getAttribute("placeholder");
		System.out.println(password);
		return password;
	}
	
	public boolean passwordEnabledOrNot() {
		boolean password = passwordPlaceHolder.isEnabled();
		System.out.println(password);
		return password;
	}
	
	public String confirmpassword_LabelText(){
		String confirmpassword = confirmPasswordLabel.getText();
		System.out.println(confirmpassword);
		return confirmpassword;
	}
	
	public String confirmpassword_placeHolder(){
		String confirmpassword = confirmPassWordPlaceHolder.getAttribute("placeholder");
		System.out.println(confirmpassword);
		return confirmpassword;
	}
	
	public boolean confirmpasswordEnabledOrNot() {
		boolean confirmpassword = confirmPassWordPlaceHolder.isEnabled();
		System.out.println(confirmpassword);
		return confirmpassword;
	}
	
	public String signUpText(){
		String signUp1 = signUp.getText();
		System.out.println(signUp1);
		return signUp1;
	}
	
	public boolean signUpButtonEnableOrNot(){
		boolean signUp1 = signUp.isEnabled();
		System.out.println(signUp1);
		return signUp1;
	}
	
	public String alreadyHaveAccountText(){
		String signUp1 = getAlreadyHaveText.getText();
		System.out.println(signUp1);
		return signUp1;
	}
	
	public void signUp(String firstName, String lastName, String email, String password, String cnPassowrd) {
		clear(firstNamePlaceHolder);
		clear(lastNamePlaceHolder);
		clear(emailPlaceHolder);
		clear(passwordPlaceHolder);
		clear(confirmPassWordPlaceHolder);
		inputValue(firstNamePlaceHolder, firstName);
		inputValue(lastNamePlaceHolder, lastName);
		inputValue(emailPlaceHolder, email);
		inputValue(passwordPlaceHolder, password);
		inputValue(confirmPassWordPlaceHolder, cnPassowrd);
		click(signUp);
	}
	
	public String firstNameError() {
		String text = firstName_error.getText();
		System.out.println(text);
		return text;
	}
	
	public String lastNameError() {
		String text = lastName_error.getText();
		System.out.println(text);
		return text;
	}
	
	public String emailError() {
		String text = email_error.getText();
		System.out.println(text);
		return text;
	}
	
	public String passwordError() {
		String text = password_error.getText();
		System.out.println(text);
		return text;
	}
	
	public String conformPassword() {
		String text = confirmPassword_error.getText();
		System.out.println(text);
		return text;
	}
	
	public String firstNamelessThan_3Characters() {
		String text = firstName_error.getText();
		System.out.println(text);
		return text;
	}
	
	public String lastNamelessThan_3Characters() {
		String text = lastName_error.getText();
		System.out.println(text);
		return text;
	}
	
	public String invalidEmail_error() {
		String text = email_error.getText();
		System.out.println(text);
		return text;
	}
	
	public String passwordlessThan_6Characters() {
		String text = password_error.getText();
		System.out.println(text);
		return text;
	}
	
	public String confirmpasswordlessThan_6Characters() {
		String text = confirmPassword_error.getText();
		System.out.println(text);
		return text;
	}
	
	public String notMatchedPasswordAndConfirmPassWord() {
		String text = confirmPassword_error.getText();
		System.out.println(text);
		return text;
	}
	
	public String alreadyCreatedMail() {
		String text = toasterAlert.getText();
		System.out.println(text);
		return text;
	}
	
	public String successToasterAlert() {
		String text = toasterAlert.getText();
		System.out.println(text);
		return text;
	}
	
	public void click_signIn() {
		click(click_SignIn);
	}
	
}
