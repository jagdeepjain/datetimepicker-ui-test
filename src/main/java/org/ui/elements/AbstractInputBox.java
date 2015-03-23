/**
* @author jagdeepjain
*
*/
package org.ui.elements;

import org.openqa.selenium.WebDriver;

public abstract class AbstractInputBox implements UIElement {

	public abstract void button(WebDriver driver);
	public abstract void inputBox(WebDriver driver);
}
