/**
* @author jagdeepjain
*
*/
package org.datetimepicker.ui.components;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Button implements UIElement {
	
	public void doneButton(WebDriver driver) {
		WebElement done = driver.findElement(By.id("ui-datepicker-div"));
		done.findElement(By.xpath(XPath.datePickerDone)).click();
		done.sendKeys(Keys.TAB);
	}
	
	public void nowButton(WebDriver driver) {
		WebElement done = driver.findElement(By.id("ui-datepicker-div"));
		done.findElement(By.xpath(XPath.datePickerNow)).click();
	}
	
	public void button(WebDriver driver) {
	}
	
	public void inputBox(WebDriver driver) {	
	}
	
	public void datePickerDoneButton(WebDriver driver) {
		WebElement done = driver.findElement(By.id("ui-datepicker-div"));
		done.findElement(By.xpath(XPath.datePickerDone)).click();
		done.sendKeys(Keys.TAB);
	}
	
	public void datePickerNowButton(WebDriver driver) {
		WebElement done = driver.findElement(By.id("ui-datepicker-div"));
		done.findElement(By.xpath(XPath.datePickerNow)).click();
	}

	
	
	
}

