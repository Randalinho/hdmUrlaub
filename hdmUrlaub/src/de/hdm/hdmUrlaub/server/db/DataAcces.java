package de.hdm.hdmUrlaub.server.db;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import de.hdm.hdmUrlaub.server.db.model.Fachvorgesetzter;
import de.hdm.hdmUrlaub.server.db.model.Mitarbeiter;
import de.hdm.hdmUrlaub.server.db.model.Urlaubsantrag;
import de.hdm.hdmUrlaub.server.db.model.Zeitraum;

/**
 * Klasse f&uuml;r alle Datenbankzugriffe.
 * 
 * @author Fabian
 *
 */
public class DataAcces {

	private EntityManagerFactory entityManagerFactory = null;

	private EntityManager entityManager = null;

	private static final String PERSISTENCEUNIT = "hdmUrlaub";

	public DataAcces() {
		getEntityManager();
	}

	/**
	 * Methode zum Abrufen aller {@link Urlaubsantrag}.
	 * 
	 * @return {@link List} <{@link Urlaubsantrag}>
	 */
	public List<Urlaubsantrag> getAllUrlaubsantrags() {

		List<Urlaubsantrag> urlaubsantrags = entityManager.createQuery(
				"Select urlaubsantrag FROM Urlaubsantrag urlaubsantrag",
				Urlaubsantrag.class).getResultList();

		return urlaubsantrags;
	}

	/**
	 * Methode zum Abrufen aller {@link Mitarbeiter}.
	 * 
	 * @return {@link List}<{@link Mitarbeiter}>
	 */
	public List<Mitarbeiter> getAllMitarbeiter() {

		List<Mitarbeiter> mitarbeiters = entityManager.createQuery(
				"Select mitarbeiter FROM Mitarbeiter mitarbeiter",
				Mitarbeiter.class).getResultList();

		return mitarbeiters;
	}

	/**
	 * Methode zum Abrufen aller Fachvorgesetzten.
	 * 
	 * @return {@link List}<{@link Fachvorgesetzter}>
	 */
	public List<Fachvorgesetzter> getAllFachvorgesetzter() {
		List<Fachvorgesetzter> fachvorgesetzters = entityManager
				.createQuery(
						"Select fachvorgesetzter FROM Fachvorgesetzter fachvorgesetzter",
						Fachvorgesetzter.class).getResultList();

		return fachvorgesetzters;
	}

	/**
	 * Methode zum Speichern eines {@link Urlaubsantrag}
	 * 
	 * @param urlaubsantrag
	 */
	public void saveUrlaubsantrag(Urlaubsantrag urlaubsantrag) {
		entityManager.getTransaction().begin();
		Urlaubsantrag urlaubsantragToSave;
		if (urlaubsantrag.getId() != null) {
			urlaubsantragToSave = entityManager.find(Urlaubsantrag.class,
					urlaubsantrag.getId());
		} else {
			urlaubsantragToSave = new Urlaubsantrag();
		}
		urlaubsantragToSave.setAnzahltage(urlaubsantrag.getAnzahltage());
		urlaubsantragToSave.setFachvorgesetzter(urlaubsantrag
				.getFachvorgesetzter());
		urlaubsantragToSave.setStatus(urlaubsantrag.getStatus());
		urlaubsantragToSave.setMitarbeiter(urlaubsantrag.getMitarbeiter());
		urlaubsantragToSave.setVertretung(urlaubsantrag.getVertretung());
		urlaubsantragToSave.setFachvorgesetzter(urlaubsantrag
				.getFachvorgesetzter());

		entityManager.persist(urlaubsantragToSave);

		Set<Zeitraum> zeitraums = urlaubsantrag.getZeitraums();

		for (Zeitraum zeitraum : zeitraums) {
			Zeitraum zeitraumToSave;
			if (zeitraum.getId() != null) {
				zeitraumToSave = entityManager.find(Zeitraum.class,
						zeitraum.getId());
			} else {
				zeitraumToSave = new Zeitraum();
			}
			zeitraumToSave.setBeginn(zeitraum.getBeginn());
			zeitraumToSave.setEnde(zeitraum.getEnde());
			zeitraumToSave.setUrlaubsantrag(urlaubsantragToSave);
			entityManager.persist(zeitraumToSave);
		}
		entityManager.getTransaction().commit();
	}

	/**
	 * Methode zum Speichern eines Mitarbeiters.
	 * 
	 * @param mitarbeiter
	 */
	public void saveMitarbeiter(Mitarbeiter mitarbeiter) {
		entityManager.getTransaction().begin();
		Mitarbeiter mitarbeiterToSave;
		if (mitarbeiter.getId() != null) {
			mitarbeiterToSave = entityManager.find(Mitarbeiter.class,
					mitarbeiter.getId());
		} else {
			mitarbeiterToSave = new Mitarbeiter();
		}
		mitarbeiterToSave.setNachname(mitarbeiter.getNachname());
		mitarbeiterToSave.setVorname(mitarbeiter.getVorname());
		entityManager.persist(mitarbeiter);
		entityManager.getTransaction().commit();
	}

	/**
	 * Methode zum L&ouml;schen eines {@link Urlaubsantrag};
	 * 
	 * @param urlaubsantrag
	 */
	public void deleteUrlaubsantrag(Urlaubsantrag urlaubsantrag) {
		entityManager.getTransaction().begin();
		entityManager.remove(urlaubsantrag);
		entityManager.getTransaction().commit();
	}

	/**
	 * Erstellt eine neue {@link EntityManagerFactory} und einen neuen
	 * {@link EntityManager}.
	 * 
	 * @return
	 */
	private void getEntityManager() {
		entityManagerFactory = Persistence
				.createEntityManagerFactory(PERSISTENCEUNIT);
		entityManager = entityManagerFactory.createEntityManager();
	}

	/**
	 * Schlie�t den {@link EntityManager} und die {@link EntityManagerFactory};
	 */
	public void closeEntityManagerAndFactory() {
		entityManager.close();
		entityManagerFactory.close();
	}

}
