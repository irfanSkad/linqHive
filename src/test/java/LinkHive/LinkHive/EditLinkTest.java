package LinkHive.LinkHive;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseDetail.BaseDetail;
import POM.AddLinkPage;
import POM.EditLinkPage;
import TestCaseData.TestCase_Data1;

public class EditLinkTest extends BaseDetail{
	String act;
	String exp;
	EditLinkPage editPage;
	String validUrlPattern = "^https:\\/\\/www\\.google\\.com.*$";
	
	
	/*public EditLinkTest() {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		launchApp();
		editPage = new EditLinkPage();
		editPage.validCred();
	}*/
	
	@Test(priority = 1)
	public void verify_editSpelling() {
		editPage = new EditLinkPage();
		act = editPage.editText();
		exp = " Edit".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 2)
	public void verify_editPopUpDisplay() {
		Assert.assertTrue(editPage.clickEditPopUp());
	}
	
	@Test(priority = 3)
	public void verify_editLinkSpelling() {
		act = editPage.editLinkText();
		exp = "Edit Link".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 4)
	public void verify_titleLabel_Spelling() {
		
		act = editPage.title_Label();
		exp = " Title".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 5)
	public void verify_titlePlaceHolder() {
		act = editPage.title_inputPlaceHolder();
		exp = "Enter link title";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 6)
	public void verify_titleEnabled_orNot() {
		Assert.assertTrue(editPage.title_inputEnable());
	}
	
	@Test(priority = 7)
	public void verify_url_Spelling() {
		act = editPage.urlLabel();
		exp = " URL".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 8)
	public void verify_urlPlaceHolder_Spelling() {
		act = editPage.urlPlaceHolder();
		exp = "https://example.com";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 9)
	public void verify_urlEnabled_orNot() {
		Assert.assertTrue(editPage.urlInput_enabled());
	}
	
	@Test(priority = 10)
	public void verify_descriptionLabelSpelling() {
		act = editPage.descriptionLabelText();
		exp = "Description (optional)".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 11)
	public void verify_descriptionPlaceHolder_Spelling() {
		act = editPage.descriptionplaceHolderText();
		exp = "Add a brief description";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 12)
	public void verify_descriptionEnabled_orNot() {
		Assert.assertTrue(editPage.descriptionInput_enabled());
	}
	
	@Test(priority = 13)
	public void verify_updateChanges_Spellings() {
		act = editPage.updateChangesButtonText();
		exp = " Update Changes".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 14)
	public void verify_addLinkEnabled_orNot() {
		Assert.assertTrue(editPage.descriptionInput_enabled());
	}
	
	@Test(priority  =15, dataProvider = "getEditLinkTestData",dataProviderClass = TestCase_Data1.class)
	public void EditLink(String title, String url, String description) {
		editPage.edit_Link(title, url, description);
		
		if(title == null || title.trim().isEmpty()) {
			Assert.assertEquals(editPage.titleValidateMessage(),"Please enter the link title");
		}
		else if(url == null || url.trim().isEmpty()) {
			Assert.assertEquals(editPage.urlValidateMessage(), "Please enter a valid URL");
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
		    Assert.fail("Invalid Title: More than one consecutive space is not allowed.");
		}
		
		else if(url.equalsIgnoreCase("sss")) {
			Assert.assertEquals(editPage.urlValidateMessage(), "Please enter a valid URL format (e.g., http://example.com)");
		}
		
		else if(!(url.matches(validUrlPattern))) {
			Assert.fail("Url is not matched for expected url");
		}
		
		else if(editPage.LinkDisplay()) {
			Assert.assertTrue(true);
		}
		
		else if(editPage.LinkDisplay()) {
			driver.navigate().refresh();
			Assert.assertTrue(editPage.LinkDisplay());
		}
		
		else if(editPage.LinkDisplay()){
			editPage.saveToaster();
			driver.navigate().refresh();
			Assert.assertTrue(editPage.LinkDisplay());
		}
	}
}
