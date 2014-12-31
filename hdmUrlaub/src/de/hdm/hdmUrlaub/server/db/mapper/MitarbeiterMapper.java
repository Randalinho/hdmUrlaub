package de.hdm.hdmUrlaub.server.db.mapper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import de.hdm.hdmUrlaub.server.db.model.Mitarbeiter;
import de.hdm.hdmUrlaub.server.db.model.Urlaubsantrag;
import de.hdm.hdmUrlaub.shared.bo.MitarbeiterBo;
import de.hdm.hdmUrlaub.shared.bo.UrlaubsantragBo;

public class MitarbeiterMapper implements DbMapper<MitarbeiterBo, Mitarbeiter> {

	private UrlaubsantragMapper urlaubsantragmapper;

	public MitarbeiterMapper() {
		urlaubsantragmapper = new UrlaubsantragMapper();
	}

	@Override
	public MitarbeiterBo getBo(Mitarbeiter dbobject) {

		MitarbeiterBo mitarbeiterBo = new MitarbeiterBo(dbobject.getId(),
				dbobject.getVorname(), dbobject.getNachname());
		ArrayList<UrlaubsantragBo> antraege = new ArrayList<UrlaubsantragBo>();
		for (UrlaubsantragBo urlaubsantragBo : urlaubsantragmapper
				.getBoList(new ArrayList<Urlaubsantrag>(dbobject
						.getUrlaubsantrags()))) {
			antraege.add(urlaubsantragBo);
		}
		mitarbeiterBo.setUrlaubsantraege(antraege);
		return mitarbeiterBo;
	}

	@Override
	public List<MitarbeiterBo> getBoList(List<Mitarbeiter> dbObjectListe) {
		ArrayList<MitarbeiterBo> mitarbeiterBoListe = new ArrayList<MitarbeiterBo>();

		for (Mitarbeiter mitarbeiter : dbObjectListe) {
			mitarbeiterBoListe.add(getBo(mitarbeiter));
		}
		return mitarbeiterBoListe;
	}

	@Override
	public Mitarbeiter getDbObject(MitarbeiterBo bo) {

		Set<Urlaubsantrag> antraege = new HashSet<Urlaubsantrag>();

		for (UrlaubsantragBo urlaubsantragBo : bo.getUrlaubsantraege()) {
			antraege.add(urlaubsantragmapper.getDbObject(urlaubsantragBo));
		}

		return new Mitarbeiter(bo.getId(), bo.getVorname(), bo.getNachname(),
				antraege);
	}
}
