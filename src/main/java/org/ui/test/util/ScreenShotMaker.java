/**
* @author jagdeepjain
*
*/
package org.ui.test.util;

import java.io.File;
import java.io.IOException;

import org.apache.maven.surefire.shade.org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotMaker {
	
	// take screen shot on the test failures
	public void takeScreenShot(WebDriver driver, Error e, String fileName) {
		File screenShot = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("target/surefire-reports/"
					+ fileName + ".png"));

		} catch (IOException ioe) {
			throw new RuntimeException(ioe.getMessage(), ioe);
		}
		throw e;
	}

}
