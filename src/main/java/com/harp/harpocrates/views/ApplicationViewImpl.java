package com.harp.harpocrates.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.google.common.base.Preconditions;

/**
 * Serves as the implementation of the {@link ApplicationView} and determines
 * how the application will look.
 * 
 * @author James Hare
 */
public class ApplicationViewImpl implements ApplicationView {

	private static Shell shell;
	private static Display display;

	/**
	 * Constructor for the parent view that sets the size of the shell, creates the
	 * widgets inside the shell and centers the shell.
	 * 
	 * @param shell   - The parent {@link Shell}.
	 * @param display - The current {@link Display}.
	 */
	public ApplicationViewImpl(final Shell shell, Display display) {
		Preconditions.checkArgument(shell != null, ApplicationViewConstants.APPLICATION_VIEW_SHELL_NULL_ERROR_MESSAGE);
		Preconditions.checkArgument(display != null,
				ApplicationViewConstants.APPLICATION_VIEW_DISPLAY_NULL_ERROR_MESSAGE);
		ApplicationViewImpl.shell = shell;
		ApplicationViewImpl.display = display;
		shell.setText(ApplicationViewConstants.APPLICATION_VIEW_SHELL_TITLE);
		/**
		 * The shell will be 3 columns wide.
		 */
		GridLayout ApplicationViewLayout = new GridLayout(ApplicationViewConstants.APPLICATION_VIEW_NUMBER_OF_COLUMNS,
				true);
		shell.setLayout(ApplicationViewLayout);
		shell.setMinimumSize(shell.getSize());
		centerShell(shell);
		createWidgets(shell, display);
	}

	/**
	 * {@inheritDoc}
	 */
	public void createWidgets(Shell shell, Display display) {
		Preconditions.checkArgument(shell != null, ApplicationViewConstants.CREATE_WIDGETS_SHELL_NULL_ERROR_MESSAGE);
		Preconditions.checkArgument(display != null,
				ApplicationViewConstants.CREATE_WIDGETS_DISPLAY_NULL_ERROR_MESSAGE);
		/**
		 * Widgets will be added to this method as they are developed. Each one will be
		 * given a number of columns, used for sizing its child shells, and a boolean
		 * with true indicating that each column has an equal width.
		 */
		Composite clockComposite = new Composite(shell, SWT.NONE);
		clockComposite.setLayout(new GridLayout(1, false));
	}

	/**
	 * {@inheritDoc}
	 */
	public void centerShell(Shell shell) {
		Preconditions.checkArgument(shell != null, ApplicationViewConstants.CENTER_SHELL_SHELL_NULL_ERROR_MESSAGE);
		Rectangle boundsOfDisplay = shell.getDisplay().getPrimaryMonitor().getBounds();
		Point sizeOfShell = shell.getSize();
		int leftShellBound = (boundsOfDisplay.width - sizeOfShell.x) / 2;
		int topShellBound = (boundsOfDisplay.height - sizeOfShell.y) / 2;
		shell.setBounds(leftShellBound, topShellBound, sizeOfShell.x, sizeOfShell.y);
	}

}