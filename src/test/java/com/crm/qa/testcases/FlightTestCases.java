package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.google.common.base.Verify;

public class FlightTestCases extends TestBase {

	HomePage homepage;

	public FlightTestCases() {
		super();
	}

	/*
	 * @BeforeTest public void setExtentReport() { setExtend(); }
	 */

	@BeforeSuite(alwaysRun = true)
	public void setUp() {
		initializaton();
		homepage = new HomePage();
	}

	@Test(groups = { "Simple", "UI" })
	public void TC001_CheckifLogoisPresent() {
		boolean flag = homepage.isLogoDisplayed();
		Assert.assertTrue(flag);
	}

	@Test(groups = { "Functionality" })
	public void TC002_SelectFlightOption() {
		homepage.selectFlightOption();
	}

	@Test(groups = { "Simple", "UI" })
	public void TC003_CheckifLogoisPresent() {
		boolean flag = homepage.isLogoDisplayed();
		Assert.assertTrue(flag);
	}

	@Test
	public void TC004_SelectFlightOption() {
		homepage.selectFlightOption();
	}

	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		// FormatResult();
		tearDownMain();
	}

}
