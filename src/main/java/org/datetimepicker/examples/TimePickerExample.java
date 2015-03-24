/**
* @author jagdeepjain
*
*/
package org.datetimepicker.examples;

import org.ui.elements.UIElement;
import org.ui.elements.UIElementFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TimePickerExample {

	// initiating ui element factory to get button, editBox
	UIElementFactory uiElement = new UIElementFactory();
	UIElement button = uiElement.getElement("button");
	UIElement inputBox = uiElement.getElement("inputBox");
	
	public void setTimeStamp(WebDriver driver, int month, int startHr, int startMin, String date) {
		inputBox.basicExample1(driver, month, startHr, startMin, date);
		button.done(driver);
	}
	
	public void clickExamplesLink(WebDriver driver) {
		driver.findElement(By.linkText(UIElement.examplesLink)).click();
	}
	
	public String getTimeStamp(WebDriver driver) {
		return driver.findElement(By.id(UIElement.basicExample1)).getAttribute("value");
	}
	
}
