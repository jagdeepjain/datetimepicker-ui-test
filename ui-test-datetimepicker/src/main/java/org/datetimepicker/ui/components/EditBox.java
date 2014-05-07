/**
 * 
 */
package org.datetimepicker.ui.components;

import org.datetimepicker.ui.common.AutomationUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Jagdeep Jain
 * 
 */
public class EditBox {

	AutomationUtil automationUtil = new AutomationUtil();

	public void basicExample1(WebDriver driver, int month, int startHr,
			int startMin, String date) {

		driver.findElement(By.id("basic_example_1")).click();
		automationUtil.calMonth(driver, month);
		automationUtil.calDate(driver, date);
		automationUtil.calTime(driver, startHr, startMin);


	}
}
