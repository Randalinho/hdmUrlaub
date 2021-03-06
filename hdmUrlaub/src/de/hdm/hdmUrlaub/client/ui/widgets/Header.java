package de.hdm.hdmUrlaub.client.ui.widgets;

import org.gwtbootstrap3.client.ui.Heading;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class Header extends Composite {

	private static HeaderUiBinder uiBinder = GWT.create(HeaderUiBinder.class);

	interface HeaderUiBinder extends UiBinder<Widget, Header> {
	}
	
	public Header(Ueberschrift ueberschrift) {
		initWidget(uiBinder.createAndBindUi(this));
		
		RootPanel.get("header").clear();
		RootPanel.get("header").add(ueberschrift);
	}
	
}
