package com.yas.javalistenersreference.beans;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * 
 * @author YAS
 *
 */
public class Bean implements PropertyChangeListener {

	private String stringProperty;
	private int intProperty;
	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

	public Bean() {
		super();
		// you can ignore this and add PropertyChangeListener separtly using
		// MyPropertyChangeListener
		propertyChangeSupport.addPropertyChangeListener(this);
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println("Property name: " + evt.getPropertyName() + " old value:" + evt.getOldValue() + " new value:"
				+ evt.getNewValue());

	}

	public void addPropertyChangeListener(PropertyChangeListener changeListener) {
		propertyChangeSupport.addPropertyChangeListener(changeListener);

	}

	/**
	 * @return the stringProperty
	 */
	public String getStringProperty() {
		return stringProperty;
	}

	/**
	 * @param stringProperty
	 *            the stringProperty to set
	 */
	public void setStringProperty(String stringProperty) {
		propertyChangeSupport.firePropertyChange("stringProperty", this.stringProperty, stringProperty);
		this.stringProperty = stringProperty;
	}

	/**
	 * @return the intProperty
	 */
	public int getIntProperty() {
		return intProperty;
	}

	/**
	 * @param intProperty
	 *            the intProperty to set
	 */
	public void setIntProperty(int intProperty) {
		propertyChangeSupport.firePropertyChange("intProperty", this.intProperty, intProperty);

		this.intProperty = intProperty;
	}

}
