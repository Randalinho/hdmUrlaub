package de.hdm.hdmUrlaub.client.ui.widgets;

import org.gwtbootstrap3.client.ui.Heading;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Ueberschrift extends Composite {

	@UiField
	Heading ueberschrift;
	
	private static UeberschriftUiBinder uiBinder = GWT
			.create(UeberschriftUiBinder.class);

	interface UeberschriftUiBinder extends UiBinder<Widget, Ueberschrift> {
	}

	public Ueberschrift(String text) {
		initWidget(uiBinder.createAndBindUi(this));
		ueberschrift.setText(text);
	}

}
