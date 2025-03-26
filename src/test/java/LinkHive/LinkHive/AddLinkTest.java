package LinkHive.LinkHive;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseDetail.BaseDetail;
import POM.AddLinkPage;
import POM.SignUpPage;
import TestCaseData.TestCase_Data1;

public class AddLinkTest extends BaseDetail{
	String act;
	String exp;
	AddLinkPage linkTab;
	String validUrlPattern = "^https:\\/\\/www\\.google\\.com.*$";
	
	
	/*public AddLinkTest() {
		super();
	}*/
	
	@BeforeTest
	public void setUp() {
		launchApp();
		linkTab = new AddLinkPage();
		linkTab.validCred();
	}

	@Test(priority = 1)
	public void verify_CurrentUrl() {
		
		//linkTab = new AddLinkPage();
		linkTab.addLinkBtn();
		act = currentUrl();
		exp = "https://user.linqhive.com/";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 2)
	public void verify_CurrentTitle() {
		act = getTitle2();
		exp = "Linqhive";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 3)
	public void verify_linkHiveLogo() {
		Assert.assertTrue(linkTab.logoDisplay());
	}
	
	@Test(priority = 4)
	public void verify_addLink_Spelling() {
		act = linkTab.addLink_Text();
		exp = "Add Link".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 5)
	public void verify_addLinkButton_enableOrNot() {
		Assert.assertTrue(linkTab.addLinkButton());
	}
	
	@Test(priority = 6)
	public void verify_AddpopUpDisplay() {
		Assert.assertTrue(linkTab.addLinkPopUp());
	}
	
	@Test(priority = 7)
	public void verify_AddLink_Spelling() {
		act = linkTab.add_Link_Text();
		exp = " Add Link".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 8)
	public void verify_titleLabel_Spelling() {
		
		act = linkTab.add_titleLabel();
		exp = " Title".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 9)
	public void verify_titlePlaceHolder() {
		act = linkTab.title_inputPlaceHolder();
		exp = "Enter link title";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 10)
	public void verify_titleEnabled_orNot() {
		Assert.assertTrue(linkTab.title_inputEnable());
	}
	
	@Test(priority = 11)
	public void verify_url_Spelling() {
		act = linkTab.urlLabel();
		exp = " URL".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 12)
	public void verify_urlPlaceHolder_Spelling() {
		act = linkTab.urlPlaceHolder();
		exp = "https://example.com";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 13)
	public void verify_urlEnabled_orNot() {
		Assert.assertTrue(linkTab.urlInput_enabled());
	}
	
	@Test(priority = 14)
	public void verify_descriptionLabelSpelling() {
		act = linkTab.descriptionLabelText();
		exp = "Description (optional)".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 15)
	public void verify_descriptionPlaceHolder_Spelling() {
		act = linkTab.descriptionplaceHolderText();
		exp = "Add a brief description";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 16)
	public void verify_descriptionEnabled_orNot() {
		Assert.assertTrue(linkTab.descriptionInput_enabled());
	}
	
	@Test(priority = 17)
	public void verify_addLink_Spellings() {
		act = linkTab.addLinkText();
		exp = "Add Link";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 18)
	public void verify_addLinkEnabled_orNot() {
		Assert.assertTrue(linkTab.descriptionInput_enabled());
	}
	
	@Test(priority = 20)
	public void verify_deletePopUpDisplay() {
		Assert.assertTrue(linkTab.clickdelete());
	}
	
	@Test(priority = 21)
	public void verify_AreyouSure_Spelling() {
		act = linkTab.getAreyouSure();
		exp = "Are you sure?";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 22)
	public void verify_deleteConform_Spelling() {
		act = linkTab.deleteconform_text();
		exp = "Are you sure you want to delete this link?";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 23)
	public void verify_deleteIt_Spelling() {
		act = linkTab.deleteit_Text();
		exp = "Yes, Delete It!";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 24)
	public void verify_deleteButton_enabledOrNot() {
		Assert.assertTrue(linkTab.deleteitButton_enabled());
	}
	
	@Test(priority = 25)
	public void verify_closeButton_Spelling() {
		act = linkTab.deletecloseButton();
		exp = "Close";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 26)
	public void verify_closeButton_enabledOrNot() {
		Assert.assertTrue(linkTab.closeButton_enabled());
	}
	
	@Test(priority = 27)
	public void verify_closeButtonIsWorkingOrNot() {
		Assert.assertTrue(linkTab.closeButtonisWorkingorNot());
	}
	
	@Test(priority = 28)
	public void verify_createdLinkIsDisplayedOrNot() {
		Assert.assertTrue(linkTab.createLink());
	}

	@Test(priority = 29, dataProvider = "getAddLinkTestData",dataProviderClass = TestCase_Data1.class)
	public void verify_AddLink(String title, String url, String description) {
		linkTab.add_Link(title, url, description);
		if(title == null || title.trim().isEmpty()) {
			Assert.assertEquals(linkTab.titleValidateMessage(),"Please enter the link title");
		}
		else if(url == null || url.trim().isEmpty()) {
			Assert.assertEquals(linkTab.urlValidateMessage(), "Please enter a valid URL");
		}
		
		else if(title.length() < 3) {
			Assert.fail("less than 3 characters is not accepted");
		}
		
		else if(title.length() > 200) {
			Assert.fail("more than 200 characters is not accepted");
		}
		
		else if(title.equals("........")||title.equals("@@@@@")||title.equals("22132222")||title.equals("       ")||title.equals("<script>")) {
			Assert.fail("Only given Special characters should not be accept");
		}
		
		else if (title.matches(".*\\s{2,}.*")) {
		    Assert.fail("Invalid Title: More than one consecutive space is not allowed");
		}
		
		else if(url.equals("sss")) {
			Assert.assertEquals(linkTab.urlValidateMessage(), "Please enter a valid URL format (e.g., http://example.com)");
		}
		
		else if(!(url.matches(validUrlPattern))) {
			Assert.fail("Url is not matched for expected url");
			
		}
		
		else if(linkTab.LinkDisplay()) {
			Assert.assertTrue(true);
			
		}
		
		else if(linkTab.LinkDisplay()){
			linkTab.saveToaster();
			driver.navigate().refresh();
			Assert.assertTrue(linkTab.LinkDisplay());
		}
		
	}
}
