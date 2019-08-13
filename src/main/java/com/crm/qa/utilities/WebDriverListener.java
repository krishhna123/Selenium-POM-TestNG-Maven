package com.crm.qa.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.crm.qa.base.TestBase;

public class WebDriverListener extends TestBase implements WebDriverEventListener {

	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Navigating to url "+ url);
		// TODO Auto-generated method stub

	}

	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("Navigated to url "+url);
		// TODO Auto-generated method stub

	}

	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Trying to click on "+element.toString());

	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Clicked on "+element.toString());

	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub

	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub

	}

	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Exception is thrown " +throwable.getMessage());
		TestUtils.takeScreenShot(driver);

	}

	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub

	}

	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub

	}

	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Trying to get text form " + element.toString());

	}

	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub
		System.out.println("text from element "+element.toString()+ " is " +text );

	}

}
