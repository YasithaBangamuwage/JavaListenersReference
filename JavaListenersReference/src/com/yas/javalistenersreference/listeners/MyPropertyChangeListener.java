/**
 * 
 */
package com.yas.javalistenersreference.listeners;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * @author YAS
 *
 */
public class MyPropertyChangeListener implements PropertyChangeListener {

	@Override
	public void propertyChange(PropertyChangeEvent evt) {

		System.out.println("Property name: " + evt.getPropertyName() + " old value:" + evt.getOldValue() + " new value:"
				+ evt.getNewValue());
	}

}
