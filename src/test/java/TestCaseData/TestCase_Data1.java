package TestCaseData;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class TestCase_Data1 {

		@DataProvider(name = "getSignUpTestData")
	    public Object[][] getSignUpData() throws IOException {
	        return fetchDataFromSheet("SignUp"); // Default to Login sheet for this provider
	    }
		
	    @DataProvider(name = "getSignInTestData")
	    public Object[][] getSignInData() throws IOException {
	        return fetchDataFromSheet("Login"); // Default to Login sheet for this provider
	    }
	    
	    @DataProvider(name = "getAddLinkTestData")
	    public Object[][] getAddLink() throws IOException {
	        return fetchDataFromSheet("Link Tab"); // Default to Login sheet for this provider
	    }
	    
	    @DataProvider(name = "getEditLinkTestData")
	    public Object[][] getEditLink() throws IOException {
	        return fetchDataFromSheet("Edit Link"); // Default to Login sheet for this provider
	    }
	    
	    @DataProvider(name = "profileInfoTestData")
	    public Object[][] getProfileInfo() throws IOException {
	        return fetchDataFromSheet("Profile Info"); // Default to Login sheet for this provider
	    }

	    public Object[][] fetchDataFromSheet(String sheetName) throws IOException {
	        File excelFile = new File(System.getProperty("user.dir") + "\\Resourcesfile\\LinkHive Automate cases.xlsx");
	        FileInputStream fis = new FileInputStream(excelFile);

	        XSSFWorkbook workBook = new XSSFWorkbook(fis);
	        XSSFSheet sheet = workBook.getSheet(sheetName); // Fetch the required sheet by name

	        int noOfRows = sheet.getPhysicalNumberOfRows(); // Get total rows
	        int noOfColumns = sheet.getRow(0).getLastCellNum(); // Get total columns in the first row

	        Object[][] data = new Object[noOfRows - 1][noOfColumns];
	        DataFormatter df = new DataFormatter();

	        for (int i = 1; i < noOfRows; i++) { // Start from 1 to skip the header
	            if (sheet.getRow(i) == null) continue; // Skip empty rows

	            for (int j = 0; j < noOfColumns; j++) {
	                if (sheet.getRow(i).getCell(j) == null) {
	                    data[i - 1][j] = ""; // Handle null cells
	                } else {
	                    data[i - 1][j] = df.formatCellValue(sheet.getRow(i).getCell(j)); // Convert to string
	                }
	            }
	        }

	        workBook.close();
	        fis.close();
	        return data;
	    }
}
