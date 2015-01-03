package de.hdm.hdmUrlaub.test.db;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import de.hdm.hdmUrlaub.server.db.DataAcces;
import de.hdm.hdmUrlaub.server.db.model.Fachvorgesetzter;
import de.hdm.hdmUrlaub.server.db.model.Mitarbeiter;
import de.hdm.hdmUrlaub.server.db.model.Urlaubsantrag;
import de.hdm.hdmUrlaub.server.db.model.Zeitraum;

public class DataBaseTestUrlaubsantragSpeichern {

	@Test
	public void test() {
		DataAcces dataAcces = new DataAcces();
		Fachvorgesetzter fachvorgesetzter = dataAcces.getAllFachvorgesetzter()
				.get(1);
		Mitarbeiter mitarbeiter = dataAcces.getAllMitarbeiter().get(0);

		Set<Zeitraum> zeitraums = new HashSet<Zeitraum>();
		zeitraums.add(new Zeitraum(new Date(), new Date()));

		Urlaubsantrag antrag = new Urlaubsantrag();
		antrag.setAnzahltage(1);
		antrag.setZeitraums(zeitraums);
		antrag.setMitarbeiter(mitarbeiter);
		antrag.setStatus('o');
		antrag.setVertretung("Hans Wurst");

		antrag.setFachvorgesetzter(fachvorgesetzter);

		dataAcces.saveUrlaubsantrag(antrag);
		dataAcces.closeEntityManagerAndFactory();
	}
}
