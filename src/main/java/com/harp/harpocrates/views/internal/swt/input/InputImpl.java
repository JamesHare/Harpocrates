package com.harp.harpocrates.views.internal.swt.input;

import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

/**
 * 
 * @author Caleb Ooten
 */
public class InputImpl implements Input {
	private Text messageBox;
	private Text passwordBox;
	private Display display;

	public InputImpl(final Composite parent, Display display) {
		this.display = display;
		messageBox = createMessageBox(parent, display);
		passwordBox = createPasswordBox(parent, display);
	}

	private Text createMessageBox(Composite parent, Display display) {
		Text messageBoxInput = new Text(parent, SWT.WRAP);
		GridData gridData = new GridData();
		gridData.widthHint = 200;
		gridData.heightHint = 200;
		messageBoxInput.setLayoutData(gridData);
		return messageBoxInput;
	}

	private Text createPasswordBox(Composite parent, Display display) {
		Text passwordBoxInput = new Text(parent, SWT.PASSWORD);
		GridData gridData = new GridData();
		gridData.widthHint = 200;
		passwordBoxInput.setLayoutData(gridData);
		return passwordBoxInput;
	}

	public Text getMessageBox() {
		return messageBox;
	}

	public Text getPasswordBox() {
		return passwordBox;
	}

}