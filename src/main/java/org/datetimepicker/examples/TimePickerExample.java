/**
* @author jagdeepjain
*
*/
package org.datetimepicker.examples;

import org.datetimepicker.ui.components.Button;
import org.datetimepicker.ui.components.InputBox;
import org.ui.elements.UIElement;
import org.ui.elements.UIElementFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TimePickerExample {

	// initiating ui element factory to get button, editBox
	UIElementFactory uiElement = new UIElementFactory();
	UIElement button = uiElement.getElement("button");
	UIElement inputBox = uiElement.getElement("inputBox");
	
	// Examples link to get the date time picker
	private final String examplesLink = "Examples";
	// basic example # 1 date time picker on Examples page
	private final String basicExampleId = "basic_example_1";
	
	public void setTimeStamp(WebDriver driver, int month, int startHr,
			int startMin, String date) {
		((InputBox) inputBox).basicExample1(driver, month, startHr, startMin, date);
		((Button) button).done(driver);
	}
	
	public void clickExamplesLink(WebDriver driver) {
		driver.findElement(By.linkText(examplesLink)).click();
	}
	
	public String getTimeStamp(WebDriver driver) {
		return driver.findElement(By.id(basicExampleId)).getAttribute("value");
	}
	
}
