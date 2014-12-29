package de.hdm.hdmUrlaub.server.db;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import de.hdm.hdmUrlaub.server.db.model.Urlaubsantrag;

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

	}

	/**
	 * Methode zum Abrufen aller {@link Urlaubsantrag}.
	 * 
	 * @return
	 */
	public List<Urlaubsantrag> getAllUrlaubsantrags() {

		getEntityManager();

		List<Urlaubsantrag> list = entityManager.createQuery(
				"Select kategorie FROM Kategorie kategorie",
				Urlaubsantrag.class).getResultList();

		closeEntityManagerAndFactory();

		return list;
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
	 * Schlieﬂt den {@link EntityManager} und die {@link EntityManagerFactory};
	 */
	private void closeEntityManagerAndFactory() {
		entityManager.close();
		entityManagerFactory.close();
	}

}
