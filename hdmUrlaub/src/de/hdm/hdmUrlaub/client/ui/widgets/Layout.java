package de.hdm.hdmUrlaub.client.ui.widgets;

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
import com.google.gwt.user.client.ui.Widget;

public class Layout extends Composite {

	private static MenueUiBinder uiBinder = GWT.create(MenueUiBinder.class);

	interface MenueUiBinder extends UiBinder<Widget, Layout> {
	}

	final Menue menue = new Menue();
	
	@UiField
	PanelBody body;
	
	public Layout() {
		initWidget(uiBinder.createAndBindUi(this));
		
		body.add(menue);
	}


}
