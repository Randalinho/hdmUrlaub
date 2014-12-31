package de.hdm.hdmUrlaub.server.db.mapper;

import java.util.List;

import de.hdm.hdmUrlaub.server.db.model.HibernateObject;
import de.hdm.hdmUrlaub.shared.bo.HdmUrlaubBusinessObject;

/**
 * Generisches Interface, welches ein {@link HdmUrlaubBusinessObject} in ein
 * {@link HibernateObject} mappt. Dies ist notwendig, da GWT clientseitig nicht
 * mit Hibernate/JPA Objekten umgehen kann.
 * 
 * @author Fabian
 *
 * @param <Bo>
 * @param <DbObject>
 */
public interface DbMapper<Bo extends HdmUrlaubBusinessObject, DbObject extends HibernateObject> {

	public Bo getBo(DbObject dbobject);

	public List<Bo> getBoList(List<DbObject> dbObjectListe);

	public DbObject getDbObject(Bo bo);

}
