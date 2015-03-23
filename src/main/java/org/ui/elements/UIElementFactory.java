/**
 * @author jagdeepjain
 *
 */
package org.ui.elements;

import org.datetimepicker.ui.components.Button;
import org.datetimepicker.ui.components.Input;

public class UIElementFactory {

	public UIElement getElement(String elementType) {

		if (elementType.equals("button")) {
			return new Button();
		} else if (elementType.equals("inputBox")) {
			return new Input();
		} else {
			return null;
		}
	}
}
