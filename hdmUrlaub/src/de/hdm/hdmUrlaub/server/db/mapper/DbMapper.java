package de.hdm.hdmUrlaub.server.db.mapper;

import java.util.List;

import de.hdm.hdmUrlaub.server.db.model.HibernateObject;
import de.hdm.hdmUrlaub.shared.bo.HdmUrlaubBusinessObject;

public interface DbMapper<Bo extends HdmUrlaubBusinessObject, DbObject extends HibernateObject> {

	public Bo getBo(DbObject dbobject);

	public List<Bo> getBoList(List<DbObject> dbObjectListe);

	public DbObject getDbObject(Bo bo);

}
