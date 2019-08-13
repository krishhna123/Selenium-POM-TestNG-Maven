package com.crm.qa.utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int counter = 0, attempt = 2;

	/**
	 * @author krishna
	 * 
	 *         this method decides how many time should test should run TestNG will
	 *         call this method every time a test is failed
	 * 
	 *         this method will return true every time when test needs to be retried
	 *         and false when it not
	 */

	@Override
	public boolean retry(ITestResult result) {

		if (counter < attempt) {
			counter++;
			return true;
		} else
			return false;
	}

}
