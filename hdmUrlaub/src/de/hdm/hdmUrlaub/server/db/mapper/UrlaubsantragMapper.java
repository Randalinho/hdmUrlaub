package de.hdm.hdmUrlaub.server.db.mapper;

import java.util.ArrayList;
import java.util.List;

import de.hdm.hdmUrlaub.server.db.model.Urlaubsantrag;
import de.hdm.hdmUrlaub.shared.bo.UrlaubsantragBo;
import de.hdm.hdmUrlaub.shared.enums.Status;

public class UrlaubsantragMapper implements
		DbMapper<UrlaubsantragBo, Urlaubsantrag> {

	private MitarbeiterMapper mitarbeitermapper;

	public UrlaubsantragMapper() {
		mitarbeitermapper = new MitarbeiterMapper();
	}

	@Override
	public UrlaubsantragBo getBo(Urlaubsantrag dbobject) {
		UrlaubsantragBo urlaubsantragBo = new UrlaubsantragBo(dbobject.getId(),
				dbobject.getVertretung(), dbobject.getFachvorgesetzter(),
				dbobject.getAnzahltage(), dbobject.getMitarbeiterId());

		switch (dbobject.getStatus()) {
		case 'g':
			urlaubsantragBo.setStatus(Status.GENEHMIGT);
			break;
		case 'o':
			urlaubsantragBo.setStatus(Status.OFFEN);
			break;
		case 'a':
			urlaubsantragBo.setStatus(Status.ABGELEHNT);
			break;
		default:
			break;
		}

		return urlaubsantragBo;
	}

	@Override
	public List<UrlaubsantragBo> getBoList(List<Urlaubsantrag> dbObjectListe) {
		ArrayList<UrlaubsantragBo> antraege = new ArrayList<UrlaubsantragBo>();
		for (Urlaubsantrag urlaubsantrag : dbObjectListe) {
			antraege.add(getBo(urlaubsantrag));
		}
		return antraege;
	}

	@Override
	public Urlaubsantrag getDbObject(UrlaubsantragBo bo) {
		// TODO Auto-generated method stub
		return null;
	}

}
