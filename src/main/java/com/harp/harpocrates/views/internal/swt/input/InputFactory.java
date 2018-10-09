package com.harp.harpocrates.views.internal.swt.input;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
/**
 * 
 * @author Caleb Ooten
 */
public class InputFactory {
	public Input createInput(Composite parent, Display display) {
		return new InputImpl(parent, display);
	}
}