/**
* @author jagdeepjain
*
*/
package org.datetimepicker.ui.examples;

import org.datetimepicker.ui.components.Button;
import org.datetimepicker.ui.components.InputBox;
import org.datetimepicker.ui.components.UIElement;
import org.datetimepicker.ui.components.UIElementFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TimePickerExample {

	// initating ui element factory to get button, editBox
	UIElementFactory uiElement = new UIElementFactory();
	UIElement button = uiElement.getElement("button");
	UIElement inputBox = uiElement.getElement("inputBox");
	
	// Examples link to get the date time picker
	private final String examplesLink = "Examples";
	// basic example # 1 date time picker on Examples page
	private final String basicExampleId = "basic_example_1";

	
	public void setDateTime(WebDriver driver, int month, int startHr,
			int startMin, String date) {
		((InputBox) inputBox).basicExample1(driver, month, startHr, startMin, date);
		((Button) button).datePickerDoneButton(driver);
	}
	
	public void goToExamples(WebDriver driver) {
		driver.findElement(By.linkText(examplesLink)).click();
	}
	
	public String getDateTime(WebDriver driver) {
		return driver.findElement(By.id(basicExampleId)).getAttribute("value");
	}
	
}
