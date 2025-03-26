package LinkHive.LinkHive;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseDetail.BaseDetail;
import POM.SocialMediaIconsPage;
import POM.ThemeSettingsPage;

public class ThemeSettingsTest extends BaseDetail{
	String act;
	String exp;
	ThemeSettingsPage theme;
	
	/*public ThemeSettingsTest() {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		launchApp();
		theme = new ThemeSettingsPage();
		theme.validCred();
	}*/
	
	@Test(priority = 1)
	public void verify_clickThemeSettingsAndOverViewTextIsDisplayOrNot() {
		theme = new ThemeSettingsPage();
		Assert.assertTrue(theme.clickTheme());
	}
	
	@Test(priority = 2)
	public void verify_overViewSpelling() {
		act = theme.overViewSpelling();
		exp = "Overview";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 3)
	public void verify_editBtnSpelling() {
		act = theme.editImageSpelling();
		exp = "Edit Image".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 4)
	public void verify_editImageBtnEnable() {
		Assert.assertTrue(theme.editImageBtnEnabled());
	}
	
	@Test(priority = 5)
	public void verify_removeBtnSpelling() {
		act = theme.removeBtnSpelling();
		exp = "Remove".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 6)
	public void verify_removeBtnEnable() {
		Assert.assertTrue(theme.removeBtnEnabled());
	}
	
	@Test(priority = 7)
	public void verify_titleLabelSpelling() {
		act = theme.titleLabelSpelling();
		exp = "Title";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 8)
	public void verify_titleInputEnable() {
		Assert.assertTrue(theme.titleInputEnabled());
	}
	
	@Test(priority = 9)
	public void verify_descriptionLabelSpelling() {
		act = theme.descriptionSpelling();
		exp = "Description";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 10)
	public void verify_descriptionInputEnable() {
		Assert.assertTrue(theme.descriptionInputEnabled());
	}
	
	@Test(priority = 11)
	public void verify_layOutSpelling() {
		act = theme.layOutSpelling();
		exp = "Layouts";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 12)
	public void verify_buildYourOwnTextSpelling() {
		act = theme.buildYourOwnSpelling();
		exp = "BUILD YOUR OWN".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 13)
	public void verify_SelectedImageIsReflectedToPreview() {
		Assert.assertTrue(theme.selectImageIsReflectToPreview());
	}
	
	@Test(priority = 14)
	public void verify_backgroundSpelling() {
		act = theme.backGroundSpelling();
		exp = "Background";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 15)
	public void verify_chooseModepelling() {
		act = theme.chooseModeSpelling();
		exp = "Choose Mode:";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 16)
	public void verify_flatColourSpelling() {
		act = theme.flatColourSpelling();
		exp = "Flat Color";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 17)
	public void verify_gradientSpelling() {
		act = theme.gradientSpelling();
		exp = "Gradient";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 18)
	public void verify_imageTextSpelling() {
		act = theme.imageTextSpelling();
		exp = "Image";
		Assert.assertEquals(act, exp);
	}

	@Test(priority = 20)
	public void verify_backgroundImageTextDisplay() throws InterruptedException {
		Assert.assertTrue(theme.backgroundImageTextDisplay());
	}
	
	@Test(priority = 21)
	public void verify_buttonStyleTextSpelling() {
		act = theme.buttonStyleTextSpelling();
		exp = "Button Style";
		Assert.assertEquals(act, exp);
	}
	@Test(priority = 22)
	public void verify_buttonColourTextSpelling() {
		act = theme.buttonColourTextSpelling();
		exp = "Button Color";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 23)
	public void verify_textColourSpelling() {
		act = theme.textColourSpelling();
		exp = "Text Color";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 24)
	public void verify_borderColourTextSpelling() {
		act = theme.borderColourSpelling();
		exp = "Border Color";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 25)
	public void verify_rectangleTextSpelling() {
		act = theme.rectangleTextSpelling();
		exp = "Rectangle";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 26)
	public void verify_solidTextSpelling() {
		act = theme.solidTextSpelling();
		exp = "Solid";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 27)
	public void verify_outlineTextSpelling() {
		act = theme.outlineTextSpelling();
		exp = "Outline".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 28)
	public void verify_roundTextSpelling() {
		act = theme.roundedTextSpelling();
		exp = "Rounded";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 29)
	public void verify_roundOutTextSpelling() {
		act = theme.roundOutTextSpelling();
		exp = "Round Out";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 30)
	public void verify_pillTextSpelling() {
		act = theme.pillTextSpelling();
		exp = "Pill";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 31)
	public void verify_iconStyleTextSpelling() {
		act = theme.iconStyleTextSpelling();
		exp = "Icon Style";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 32)
	public void verify_iconColourTextSpelling() {
		act = theme.iconColourTextSpelling();
		exp = "Icon Color:";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 33)
	public void verify_fontStyleTextSpelling() {
		act = theme.fontStyleTextSpelling();
		exp = "Fonts Style";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 34)
	public void verify_chooseFontFamilyTextSpelling() {
		act = theme.chooseFontFamilyTextSpelling();
		exp = "Choose a Font Family";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 35)
	public void verify_globalTextColourSpelling() {
		act = theme.globalTextColourSpelling();
		exp = "Global Text Color";
		Assert.assertEquals(act, exp);
	}
	
	
	
}
