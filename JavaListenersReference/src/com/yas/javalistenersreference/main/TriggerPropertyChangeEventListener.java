/**
 * 
 */
package com.yas.javalistenersreference.main;

import com.yas.javalistenersreference.beans.Bean;
import com.yas.javalistenersreference.listeners.MyPropertyChangeListener;

/**
 * @author YAS
 *
 */
public class TriggerPropertyChangeEventListener {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Bean bean = new Bean();
		//bean.addPropertyChangeListener(new MyPropertyChangeListener());
		bean.setStringProperty("string 001");
		bean.setStringProperty("string 002");
		bean.setIntProperty(001);
		bean.setIntProperty(002);
	}

}
