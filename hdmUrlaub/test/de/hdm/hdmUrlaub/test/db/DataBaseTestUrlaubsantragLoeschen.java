package de.hdm.hdmUrlaub.test.db;

import org.junit.Test;

import de.hdm.hdmUrlaub.server.db.DataAcces;
import de.hdm.hdmUrlaub.server.db.model.Urlaubsantrag;

public class DataBaseTestUrlaubsantragLoeschen {

	@Test
	public void test() {
		
		DataAcces dataAcces = new DataAcces();
		Urlaubsantrag urlaubsantrag = dataAcces.getAllUrlaubsantrags().get(0);
		
		dataAcces.deleteUrlaubsantrag(urlaubsantrag);
	}
}
