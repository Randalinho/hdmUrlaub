package de.hdm.hdmUrlaub.client.ui.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class Content extends Composite {

	private static ContentUiBinder uiBinder = GWT.create(ContentUiBinder.class);

	interface ContentUiBinder extends UiBinder<Widget, Content> {
	}

	
	Menue menue = new Menue();
	
	public Content(Widget widget) {
		initWidget(uiBinder.createAndBindUi(this));
		
		RootPanel.get("content").add(widget);
	}

}
