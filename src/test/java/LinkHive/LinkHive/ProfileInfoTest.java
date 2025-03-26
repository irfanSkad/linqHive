package LinkHive.LinkHive;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseDetail.BaseDetail;
import POM.AddLinkPage;
import POM.ProfileInfoPage;
import POM.SignUpPage;
import TestCaseData.TestCase_Data1;

public class ProfileInfoTest extends BaseDetail{
	String act;
	String exp;
	ProfileInfoPage profile;
	Scanner sc = new Scanner(System.in);
	
	/*@BeforeTest
	public void setUp() {
		launchApp();
		profile = new ProfileInfoPage();
		profile.validCred();
	}*/
	
	@Test(priority = 1)
	public void getCurrentUrl() {
		profile = new ProfileInfoPage();
		profile.addLinkBtn();
		act = currentUrl();
		exp = "https://user.linqhive.com/";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 2)
	public void verify_SelectProfileTab() {
		profile = new ProfileInfoPage();
		Assert.assertTrue(profile.clickProfileTab());
	}
	
	@Test(priority = 3)
	public void profileInformation_Spelling() {
		act = profile.profile_Information();
		exp = "Personal Information";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 4)
	public void verify_LoginnameSpelling() {
		act = profile.login_Name();
		exp = " Demo Demo".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 5)
	public void verify_email_Spelling() {
		act = profile.check_email();
		exp = "hexanewuser1@gmail.com";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 6)
	public void verify_EditImage_Spelling() {
		act = profile.edit_Image();
		exp = "Edit Image".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 7)
	public void verify_EditImageButtonEnabled() {
		Assert.assertTrue(profile.edit_ImageEnable());
	}
	
	@Test(priority = 8)
	public void verify_removebtnSpelling() {
		act = profile.remove_Button();
		exp = "Remove".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 9)
	public void verify_RemoveEnabled() {
		Assert.assertTrue(profile.remove_BtnEnable());
	}
	
	@Test(priority = 10)
	public void verify_firstName_LabelSpelling() {
		act = profile.firstName_Label();
		exp = "First Name";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 11)
	public void verify_firstNameInputEnabled() {
		Assert.assertTrue(profile.firstName_InputEnable());
	}
	
	@Test(priority = 12)
	public void verify_lastName_LabelSpelling() {
		act = profile.lastName_Label();
		exp = "Last Name";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 13)
	public void verify_lastNameInputEnabled() {
		Assert.assertTrue(profile.lastName_InputEnable());
	}
	
	@Test(priority = 14)
	public void verify_userName_LabelSpelling() {
		act = profile.userName_Label();
		exp = "User Name";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 15)
	public void verify_userNameInputEnabled() {
		Assert.assertTrue(profile.userName_InputEnable());
	}
	
	@Test(priority = 16)
	public void verify_userNameValue() {
		act = profile.getUserName();
		exp = "hexanewuser";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 17)
	public void verify_Bio_LabelSpelling() {
		act = profile.bio_Label();
		exp = "Bio";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 18)
	public void verify_bioInputEnabled() {
		Assert.assertTrue(profile.bio_InputEnable());
	}
	
	@Test(priority = 19)
	public void verify_Bio_PlaceHolderSpelling() {
		act = profile.bio_PlaceHolder();
		exp = "Write a short bio";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 20)
	public void verify_contactInformationSpelling() {
		act = profile.contact_InformationText();
		exp = "Contact Information";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 21)
	public void verify_emailLabelSpelling() {
		act = profile.email_Text();
		exp = "Email";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 22)
	public void verify_emailInputEnabled() {
		Assert.assertTrue(profile.email_InputEnable());
	}
	
	@Test(priority = 23)
	public void verify_phoneLabelSpelling() {
		act = profile.phone_Text();
		exp = "Phone";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 24)
	public void verify_phoneInputEnabled() {
		Assert.assertTrue(profile.phone_InputEnable());
	}
	
	@Test(priority = 25)
	public void verify_countryLabelSpelling() {
		act = profile.country_LabelText();
		exp = "Country";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 26)
	public void verify_stateLabelSpelling() {
		act = profile.state_LabelText();
		exp = "State";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 27)
	public void verify_cityLabelSpelling() {
		act = profile.city_LabelText();
		exp = "City";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 28)
	public void verify_cityEnableOrNot() {
		Assert.assertTrue(profile.city_Enabled());
	}
	
	@Test(priority = 29)
	public void verify_pincodeLabelSpelling() {
		act = profile.pincode_LabelText();
		exp = "Pin code";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 30)
	public void verify_pincodeEnableOrNot() {
		Assert.assertTrue(profile.pincode_Enabled());
	}
	
	@Test(priority = 31)
	public void verify_addressLabelSpelling() {
		act = profile.address_LabelText();
		exp = "Address";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 32)
	public void verify_addressEnableOrNot() {
		Assert.assertTrue(profile.address_Enabled());
	}
	
	/*@Test(priority = 32)
	public void UploadLogo(){
		System.out.println("Please enter Logo path : ");
		//String image = sc.nextLine();
		for (int i = 1;i <= 4; i++) {
			
			String logo = sc.nextLine().trim();
			if(logo.endsWith(".jpg")||logo.endsWith(".JPG")||
					logo.endsWith(".png")||logo.endsWith(".PNG")||
					logo.endsWith(".webp")||logo.endsWith(".WEBP")||
					logo.endsWith(".gif")||logo.endsWith(".GIF")) {
					if (logo.length() <= 5 * 1024 * 1024) {
						profile.upload_Logo(logo);
						System.out.println("Logo Upload Successfully!");
					}else {
						profile.upload_Logo(logo);
						act = profile.toaster_Alert_Message();
						exp = "File size should be less than or equal to 5 MB.";
						Assert.assertEquals(act, exp);
					}
			}	
				else {
					profile.upload_Logo(logo);
					act = profile.toaster_Alert_Message();
					exp = "Please select valid file format.";
					Assert.assertEquals(act, exp);
				}	
		}
	}*/
		@Test(priority = 33,dataProvider = "profileInfoTestData",dataProviderClass = TestCase_Data1.class)
		public void verify_add_profile(String firstName, String lastName, String userName, String Bio, String phone, String city, String pincode, String address){
			profile.add_profile(firstName, lastName, userName, Bio, phone, city, pincode, address);
			
			if(firstName == null || firstName.trim().isEmpty()) {
				Assert.assertEquals(profile.firstNameValidateMessage(),"Please enter your first name");
			}
			else if(lastName == null || lastName.trim().isEmpty()) {
				Assert.assertEquals(profile.lastNameValidateMessage(), "Please enter your last name");
			}	
			else if(userName == null || userName.trim().isEmpty()) {
				Assert.assertEquals(profile.userNameValidateMessage(), "Please enter your user name");
			}
			
			else if(firstName.equals("........")||firstName.equals("@@@@@")||firstName.equals("22132222")||firstName.equals("       ")||firstName.equals("<script>")) {
				Assert.fail("FirstName Only given Special characters should not be accept");
			}
			
			else if (firstName.matches(".*\\s{2,}.*")) {
			    Assert.fail("FirstName Invalid Title: More than one consecutive space is not allowed.");
			}
			
			else if(lastName.equals("........")||lastName.equals("&&&&&")||lastName.equals("22132222")||lastName.equals("       ")||lastName.equals("<script>")) {
				Assert.fail("LastName Only given Special characters should not be accept");
			}
			
			else if (lastName.matches(".*\\s{2,}.*")) {
			    Assert.fail("LastName Invalid Title: More than one consecutive space is not allowed.");
			}
			
			else if(userName.equals("........")||userName.equals("@@@@@")||userName.equals("22132222")||userName.equals("       ")||userName.equals("<script>")) {
				Assert.fail("UserName Only given Special characters should not be accept");
			}
			
			else if (userName.matches(".*\\s{2,}.*")) {
			    Assert.fail("UserName Invalid Title: More than one consecutive space is not allowed.");
			}
			
			else if(userName.equals("developer")) {
				act = profile.toaster_Alert_Message();
				exp = "The username is already in use. Please choose a different one.";
				Assert.assertEquals(act, exp);
			}
				
		}
}

