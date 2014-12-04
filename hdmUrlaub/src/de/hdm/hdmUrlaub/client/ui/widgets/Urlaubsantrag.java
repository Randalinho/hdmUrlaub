package de.hdm.hdmUrlaub.client.ui.widgets;

import org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Urlaubsantrag extends Composite {

	
	
	private static UrlaubsantragUiBinder uiBinder = GWT
			.create(UrlaubsantragUiBinder.class);

	interface UrlaubsantragUiBinder extends UiBinder<Widget, Urlaubsantrag> {
	}

	public Urlaubsantrag() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField DateTimePicker datetimepicker;
	
	
	
}
