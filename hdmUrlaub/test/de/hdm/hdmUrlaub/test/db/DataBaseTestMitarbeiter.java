package de.hdm.hdmUrlaub.test.db;

import java.util.List;

import org.junit.Test;

import de.hdm.hdmUrlaub.server.db.DataAcces;
import de.hdm.hdmUrlaub.server.db.model.Urlaubsantrag;

public class DataBaseTestMitarbeiter {

	@Test
	public void test() {
		DataAcces dataAcces = new DataAcces();

		List<Urlaubsantrag> liste = dataAcces.getAllUrlaubsantrags();

		for (Urlaubsantrag urlaubsantrag : liste) {
			System.out.println(urlaubsantrag.getId());
			System.out.println(urlaubsantrag.getMitarbeiter().getNachname());
		}

	}

}
