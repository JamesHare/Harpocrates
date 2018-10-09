package com.harp.harpocrates.views.internal.swt.input;


import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
/**
 * 
 * @author Caleb Ooten
 */
public interface Input {
	/**
	 * Returns user inputs {@link Text}.
	 * 
	 * @return - User inputs {@link Text}.
	 */
	Text getMessageBox();
	Text getPasswordBox();
	

}
