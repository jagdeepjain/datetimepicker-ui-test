/**
 * @author jagdeepjain
 *
 */
package org.jagdeep.example.test.common;

import java.io.File;
import java.io.IOException;
import org.apache.maven.surefire.shade.org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotMaker {
    
    // initializing static instance of a class
    private static ScreenShotMaker instance = new ScreenShotMaker();
    
    // constructor
    private ScreenShotMaker() {
    }
    
    // get instance handle
    public static ScreenShotMaker getInstance() {
        return instance;
    }
    
    // take screen shot on the test failure
    public void takeScreenShot(WebDriver driver, String fileName)
            throws IOException {
        File screenShot = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenShot, new File("target/surefire-reports/"
                    + fileName + ".png"));
        } catch (IOException ioe) {
            throw ioe;
        }
    }
    
}
