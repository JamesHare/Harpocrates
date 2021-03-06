package com.harp.harpocrates.application;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.harp.harpocrates.views.ApplicationView;
import com.harp.harpocrates.views.ApplicationViewImpl;

/**
 * Serves as the entry point of the application.
 * 
 * @author James Hare
 */
public class Application {

	/**
	 * Creates a new {@link Display} and {@link Shell}. Starts the application
	 * by calling {@link ApplicationViewImpl}. The {@link Display} will close
	 * when the {@link Shell} is closed by the user.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display,
				SWT.BORDER | SWT.CLOSE | SWT.MIN | SWT.MAX | SWT.RESIZE);
		ApplicationView applicationView = new ApplicationViewImpl(shell,
				display);
		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();

	}

}
