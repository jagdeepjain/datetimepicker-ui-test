/**
 * 
 */
package org.datetimepicker.ui.components;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Jagdeep Jain
 *
 */
public class Buttons {
	
	
	public void datePickerDoneButton(WebDriver driver) {
		WebElement done = driver.findElement(By.id("ui-datepicker-div"));
		done.findElement(By.xpath(XPaths.datePickerDone)).click();
		done.sendKeys(Keys.TAB);
	}
	
	public void datePickerNowButton(WebDriver driver) {
		WebElement done = driver.findElement(By.id("ui-datepicker-div"));
		done.findElement(By.xpath(XPaths.datePickerNow)).click();
	}
	
	
}

