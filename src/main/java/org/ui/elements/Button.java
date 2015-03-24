/**
* @author jagdeepjain
*
*/
package org.ui.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Button implements UIElement {

	public void done(WebDriver driver) {
		WebElement done = driver.findElement(By.id(datePickerDiv));
		done.findElement(By.xpath(datePickerDone)).click();
		done.sendKeys(Keys.TAB);
	}
	public void now(WebDriver driver) {
		WebElement done = driver.findElement(By.id(datePickerDiv));
		done.findElement(By.xpath(datePickerNow)).click();
	}
	public void basicExample1(WebDriver driver, int month, int startHr,
			int startMin, String date) {
		// TODO Auto-generated method stub
	}
}
