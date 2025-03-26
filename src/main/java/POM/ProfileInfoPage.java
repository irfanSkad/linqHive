package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDetail.BaseDetail;

public class ProfileInfoPage extends BaseDetail{
	public ProfileInfoPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(), 'Profile')]")
	WebElement profileTab;
	
	@FindBy(xpath = "//h3[text() = 'Personal Information']")
	WebElement profileInformation;
	
	@FindBy(xpath = "//h5[contains(text(), 'Demo')]")
	WebElement loginName;
	
	@FindBy(xpath = "//p[text() = 'hexanewuser1@gmail.com']")
	WebElement checkmail;
	
	@FindBy(id = "editProfilePicBtn")
	WebElement editImage;
	
	@FindBy(id = "cancelProfilePicBtn")
	WebElement removeBtn;
	
	@FindBy(xpath = "//label[text() = 'First Name']")
	WebElement firstNameLabel;
	
	@FindBy(id = "profFirstName")
	WebElement firstNameInput;
	
	@FindBy(xpath = "//label[text() = 'Last Name']")
	WebElement lastNameLabel;
	
	@FindBy(id = "profLastName")
	WebElement lastNameInput;
	
	@FindBy(xpath = "//label[text() = 'User Name']")
	WebElement userNameLabel;
	
	@FindBy(id = "profUserName")
	WebElement userNameInput;
	
	@FindBy(xpath = "//label[text() = 'Bio']")
	WebElement bioLabel;
	
	@FindBy(id = "profBio")
	WebElement bioInput;
	
	@FindBy(xpath = "//h3[text() = 'Contact Information']")
	WebElement contactInformationText;
	
	@FindBy(xpath = "//label[text() = 'Email']")
	WebElement email_Label;
	
	@FindBy(id = "profEmail")
	WebElement emailEnabled;
	
	@FindBy(xpath = "//label[text() = 'Phone']")
	WebElement phoneLabel;
	
	@FindBy(id = "profPhone")
	WebElement phoneInput;
	
	@FindBy(xpath = "//label[text() = 'Country']")
	WebElement countryLabel;
	
	@FindBy(xpath = "//label[text() = 'State']")
	WebElement stateLabel;
	
	@FindBy(xpath = "//label[text() = 'City']")
	WebElement cityLabel;
	
	@FindBy(id = "profCity")
	WebElement cityInput;
	
	@FindBy(xpath = "//label[text() = 'Pin code']")
	WebElement pincodeLabel;
	
	@FindBy(id = "profPinCode")
	WebElement pincodeInput;
	
	@FindBy(xpath = "//label[text() = 'Address']")
	WebElement addressLabel;
	
	@FindBy(id = "profAddress")
	WebElement addressInput;
	
	@FindBy(xpath = "//div[@class = 'toast toast-success']")
	WebElement toaster;
	
	@FindBy(xpath = "(//button[@id = 'saveShareBtn'])[1]")
	WebElement saveBtn;
	
	@FindBy(xpath = "//div[text() = 'The username is already in use. Please choose a different one.']")
	WebElement alreadyExistToaster;
	
	@FindBy(id = "email")
	WebElement emailInput;
	
	@FindBy(id = "password")
	WebElement passwordInput;
	
	@FindBy(id = "loginButton")
	WebElement loginBtn;
	
	@FindBy(id = "addLinkBtn")
	WebElement addLinkText;
	
	@FindBy(xpath = "//div[text()= 'Please enter your first name']")
	WebElement firstNameValidateError;
	
	@FindBy(xpath = "//div[text()= 'Please enter your last name']")
	WebElement lastNameValidateError;
	
	@FindBy(xpath = "//div[text()= 'Please enter your user name']")
	WebElement userNameValidateError;
	
	public boolean clickProfileTab() {
		click(profileTab);
		boolean profile = profileInformation.isDisplayed();
		return profile;
	}
	
	public String profile_Information() {
		String text = profileInformation.getText();
		System.out.println(text);
		return text; 
	}
	
	public String login_Name() {
		String text = loginName.getText();
		System.out.println(text);
		return text; 
	}
	
	public String check_email() {
		String text = checkmail.getText();
		System.out.println(text);
		return text; 
	}
	
	public String edit_Image() {
		String text = editImage.getText();
		System.out.println(text);
		return text; 
	}
	
	public boolean edit_ImageEnable() {
		boolean text = editImage.isEnabled();
		return text; 
	}
	
	public String remove_Button() {
		String text = removeBtn.getText();
		System.out.println(text);
		return text; 
	}
	
	public boolean remove_BtnEnable() {
		boolean text = removeBtn.isEnabled();
		return text; 
	}
	
	public String firstName_Label() {
		String firstName = firstNameLabel.getText().replaceAll("\\*", "").trim();
		System.out.println(firstName);
		return firstName; 
	}
	
	public boolean firstName_InputEnable() {
		boolean text = firstNameInput.isEnabled();
		return text; 
	}
	
	public String lastName_Label() {
		String lastName = lastNameLabel.getText().replaceAll("\\*", "").trim();
		System.out.println(lastName);
		return lastName; 
	}
	
	public boolean lastName_InputEnable() {
		boolean text = lastNameInput.isEnabled();
		return text; 
	}
	
	public String userName_Label() {
		String userName = userNameLabel.getText().replaceAll("\\*", "").trim();
		System.out.println(userName);
		return userName; 
	}
	
	public boolean userName_InputEnable() {
		boolean text = userNameInput.isEnabled();
		return text; 
	}
	
	public String getUserName() {
		String text = userNameInput.getAttribute("value");
		System.out.println(text);
		return text;
	}
	
	public String bio_Label() {
		String lastName = bioLabel.getText();
		System.out.println(lastName);
		return lastName; 
	}
	
	public boolean bio_InputEnable() {
		boolean text = bioInput.isEnabled();
		return text; 
	}
	
	public String bio_PlaceHolder() {
		String text = bioInput.getAttribute("placeholder");
		System.out.println(text);
		return text;
	}
	
	public String contact_InformationText() {
		String text = contactInformationText.getText();
		System.out.println(text);
		return text;
	}
	
	public String email_Text() {
		String text = email_Label.getText().replaceAll("\\*", "").trim();
		System.out.println(text);
		return text;
	}
	
	public boolean email_InputEnable() {
		boolean text = emailEnabled.isEnabled();
		return text; 
	}
	
	public String phone_Text() {
		String text = phoneLabel.getText();
		System.out.println(text);
		return text;
	}
	
	public boolean phone_InputEnable() {
		boolean text = phoneLabel.isEnabled();
		return text; 
	}
	
	public String country_LabelText() {
		String text = countryLabel.getText();
		System.out.println(text);
		return text;
	}
	
	public String state_LabelText() {
		String text = stateLabel.getText();
		System.out.println(text);
		return text;
	}
	
	public String city_LabelText() {
		String text = cityLabel.getText();
		System.out.println(text);
		return text;
	}
	
	public boolean city_Enabled() {
		boolean text = cityInput.isEnabled();
		return text;
	}
	
	public String pincode_LabelText() {
		String text = pincodeLabel.getText();
		System.out.println(text);
		return text;
	}
	
	public boolean pincode_Enabled() {
		boolean text = pincodeInput.isEnabled();
		return text;
	}
	
	public String address_LabelText() {
		String text = addressLabel.getText();
		System.out.println(text);
		return text;
	}
	
	public boolean address_Enabled() {
		boolean text = addressInput.isEnabled();
		return text;
	}
	
	public void upload_Logo(String logo) {
		click(editImage);
		editImage.sendKeys(logo);
	}
	
	public String toaster_Alert_Message(){
		waitForElementToBeVisible(toaster);
		String error = toaster.getText();
		System.out.println(error);
		waitForElementToBeInVisible(toaster);
		return error;
	}
	
	public void add_profile(String firstName, String lastName, String userName, String Bio, String phone, String city, String pincode, String address) {
		waitForElementToBeInVisible(toaster);
		clear(firstNameInput);
		clear(lastNameInput);
		clear(userNameInput);
		clear(bioInput);
		clear(phoneInput);
		clear(cityInput);
		clear(pincodeInput);
		clear(addressInput);
		inputValue(firstNameInput, firstName);
		inputValue(lastNameInput, lastName);
		inputValue(userNameInput, userName);
		inputValue(bioInput, Bio);
		inputValue(phoneInput, phone);
		inputValue(cityInput, city);
		inputValue(pincodeInput, pincode);
		inputValue(addressInput, address);
		click(saveBtn);
		
	}
	
	public String firstNameValidateMessage() {
		String text = firstNameValidateError.getText();
		System.out.println(text);
		return text;
		
	}
	
	public String lastNameValidateMessage() {
		String text = lastNameValidateError.getText();
		System.out.println(text);
		return text;
	}
	
	public String userNameValidateMessage() {
		String text = userNameValidateError.getText();
		System.out.println(text);
		return text;
		
	}
	
	public boolean addLinkBtn() {
		return addLinkText.isDisplayed();
	}
	
	public String toasterMessage() {
		String text = alreadyExistToaster.getText();
		System.out.println(text);
		return text;
	}
	
	public void validCred() {
		inputValue(emailInput, "hexanewuser1@gmail.com");
		inputValue(passwordInput, "Test@123");
		click(loginBtn);
	}
}
