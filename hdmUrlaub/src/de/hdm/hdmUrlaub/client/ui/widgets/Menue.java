package de.hdm.hdmUrlaub.client.ui.widgets;

import org.gwtbootstrap3.client.ui.AnchorListItem;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class Menue extends Composite {

	private static MenueUiBinder uiBinder = GWT.create(MenueUiBinder.class);

	
	
	
	
	
	
	
	interface MenueUiBinder extends UiBinder<Widget, Menue> {
	}

	public Menue() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiField AnchorListItem antrag;
	
	@UiHandler("antrag")
	void onClickAntrag(ClickEvent e){

		Ueberschrift ueberschrift = new Ueberschrift("Neuer Urlaubsantrag");
		Urlaubsantrag urlaubsantrag = new Urlaubsantrag();
		Header header = new Header(ueberschrift);
		Content content = new Content(urlaubsantrag);
	}
	
	@UiHandler("status")
	void onClickStatus(ClickEvent e){

		Ueberschrift ueberschrift = new Ueberschrift("Status aktueller Anträge");
		Status status = new Status();
		Header header = new Header(ueberschrift);
		Content content = new Content(status);
	}

}
