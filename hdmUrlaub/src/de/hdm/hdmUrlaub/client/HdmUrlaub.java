package de.hdm.hdmUrlaub.client;

import java.util.List;

import de.hdm.hdmUrlaub.client.ui.widgets.Layout;
import de.hdm.hdmUrlaub.server.db.model.Urlaubsantrag;
import de.hdm.hdmUrlaub.shared.FieldVerifier;
import de.hdm.hdmUrlaub.shared.GreetingService;
import de.hdm.hdmUrlaub.shared.GreetingServiceAsync;
import de.hdm.hdmUrlaub.shared.bo.UrlaubsantragBo;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

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

		Label label;
		label = new Label();

		GreetingServiceAsync greetingService = GWT
				.create(GreetingService.class);

		greetingService
				.getUrlaubsantrags(new AsyncCallback<List<UrlaubsantragBo>>() {

					@Override
					public void onSuccess(List<UrlaubsantragBo> result) {
						label.setText(result.get(1).getVertretung());
					}

					@Override
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub

					}
				});

		RootPanel.get("container").add(myLayout);

		RootPanel.get().add(label);
	}
}
