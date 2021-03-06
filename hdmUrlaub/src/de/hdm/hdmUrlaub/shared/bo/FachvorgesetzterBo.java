package de.hdm.hdmUrlaub.shared.bo;

import java.util.List;

public class FachvorgesetzterBo extends HdmUrlaubBusinessObject {

	private static final long serialVersionUID = -4663126183151844320L;

	private String nachname;

	private String vorname;

	private String email;

	private List<UrlaubsantragBo> urlaubsantragBos;

	public FachvorgesetzterBo(Integer id, String nachname, String vorname,
			String email, List<UrlaubsantragBo> urlaubsantragBos) {
		super();
		this.setId(id);
		this.nachname = nachname;
		this.vorname = vorname;
		this.email = email;
		this.urlaubsantragBos = urlaubsantragBos;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<UrlaubsantragBo> getUrlaubsantragBos() {
		return urlaubsantragBos;
	}

	public void setUrlaubsantragBos(List<UrlaubsantragBo> urlaubsantragBos) {
		this.urlaubsantragBos = urlaubsantragBos;
	}
}
