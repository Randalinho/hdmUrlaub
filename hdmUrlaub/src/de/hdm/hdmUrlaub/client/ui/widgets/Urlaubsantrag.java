package de.hdm.hdmUrlaub.client.ui.widgets;

import java.util.Date;

import org.gwtbootstrap3.client.ui.Label;
import org.gwtbootstrap3.client.ui.TextBox;
import org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Urlaubsantrag extends Composite {

	@UiField
	DateTimePicker datetimepicker1;
	@UiField
	DateTimePicker datetimepicker2;
	@UiField
	Label lburlaubsende;
	@UiField
	Label urlaubstage;
	@UiField
	TextBox vertretung;
	
	//TODO: Diese Methode in die Impl verschieben
//	public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
//		long diffInMillies = date2.getTime() - date1.getTime();
//		return timeUnit.convert(diffInMillies, TimeUnit.MILLISECONDS);
//	}

	private static UrlaubsantragUiBinder uiBinder = GWT
			.create(UrlaubsantragUiBinder.class);

	interface UrlaubsantragUiBinder extends UiBinder<Widget, Urlaubsantrag> {
	}

	public Urlaubsantrag() {
		initWidget(uiBinder.createAndBindUi(this));
	}

//	@UiHandler("datetimepicker2")
//	void onChange(ChangeEvent e) {
//		urlaubstage.setText("Urlaubstage: "
//				+ getDateDiff(datetimepicker1.getValue(),
//						datetimepicker2.getValue(), TimeUnit.DAYS));
//	}
	
	@UiHandler("vertretung")
	void onClick(ChangeEvent e) {
		vertretung.setText(" ");
	}

}
