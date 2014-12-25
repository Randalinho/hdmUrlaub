package de.hdm.hdmUrlaub.client.ui.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Status extends Composite {

	private static StatusUiBinder uiBinder = GWT.create(StatusUiBinder.class);

	interface StatusUiBinder extends UiBinder<Widget, Status> {
	}

	public Status() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
