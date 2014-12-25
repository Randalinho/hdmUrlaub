package de.hdm.hdmUrlaub.client.ui.widgets;

import org.gwtbootstrap3.client.ui.Panel;
import org.gwtbootstrap3.client.ui.PanelBody;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class Layout extends Composite {

	private static MenueUiBinder uiBinder = GWT.create(MenueUiBinder.class);

	interface MenueUiBinder extends UiBinder<Widget, Layout> {
	}

	Menue menue = new Menue();
	final Ueberschrift ueberschrift = new Ueberschrift("Hauptmenü");
	final Header header = new Header(ueberschrift);
	final Content content = new Content(menue);
	final Footer footer = new Footer();
	
	
	@UiField
	Panel panel;
	
	public Layout() {
		initWidget(uiBinder.createAndBindUi(this));
		
//		RootPanel.get("header").add(header);
//		RootPanel.get("content").add(content);
		RootPanel.get("footer").add(footer);
	}


}
