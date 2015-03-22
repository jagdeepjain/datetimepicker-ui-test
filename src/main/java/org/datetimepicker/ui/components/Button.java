/**
* @author jagdeepjain
*
*/
package org.datetimepicker.ui.components;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.ui.elements.UIElement;

public class Button implements UIElement {
	
	public void button(WebDriver driver) {
	}
	
	public void inputBox(WebDriver driver) {	
	}
	
	public void done(WebDriver driver) {
		WebElement done = driver.findElement(By.id("ui-datepicker-div"));
		done.findElement(By.xpath(XPath.datePickerDone)).click();
		done.sendKeys(Keys.TAB);
	}
	
	public void now(WebDriver driver) {
		WebElement done = driver.findElement(By.id("ui-datepicker-div"));
		done.findElement(By.xpath(XPath.datePickerNow)).click();
	}
}

