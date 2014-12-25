package de.hdm.hdmUrlaub.client.ui.widgets;

import org.gwtbootstrap3.client.ui.Pagination;
import org.gwtbootstrap3.client.ui.gwt.DataGrid;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;

public class Status extends Composite {

	@UiField(provided = true)
	DataGrid dataGrid = new DataGrid(10);
	@UiField
	Pagination dataGridPagination;
	
	
	private static StatusUiBinder uiBinder = GWT.create(StatusUiBinder.class);

	interface StatusUiBinder extends UiBinder<Widget, Status> {
	}

	public Status() {
		initWidget(uiBinder.createAndBindUi(this));
		
		
	}

}
