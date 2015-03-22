/**
* @author jagdeepjain
*
*/
package org.ui.test.assertions;

import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;
import org.ui.test.util.ScreenShotMaker;

public class Assertion {
	
	ScreenShotMaker screenShotMaker = new ScreenShotMaker();

	// verify and save screen shot in case of test failure
	public void trueEquals(String expected, String actual, WebDriver driver, String className) {
		try {
			assertTrue(expected.equals(actual));	
		} catch (Error e) {
			System.out.println("Expected '" + expected + "' but it was '" + actual);
			screenShotMaker.takeScreenShot(driver, e, className);
		}
	}

}
