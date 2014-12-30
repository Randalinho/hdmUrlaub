package de.hdm.hdmUrlaub.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;

import de.hdm.hdmUrlaub.client.ui.widgets.Layout;
import de.hdm.hdmUrlaub.shared.GreetingService;
import de.hdm.hdmUrlaub.shared.GreetingServiceAsync;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class HdmUrlaub implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting
	 * service.
	 */
	private final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);

	Layout myLayout = new Layout();

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		RootPanel.get("container").add(myLayout);

	}
}
