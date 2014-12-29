package de.hdm.hdmUrlaub.shared.bo;

public class MitarbeiterBo extends HdmUrlaubBusinessObject {

	private static final long serialVersionUID = 2190497750177912427L;

	private String vorname;

	private String nachname;

	public MitarbeiterBo() {
		super();
	}

	public MitarbeiterBo(Integer id, String vorname, String nachname) {
		super();
		this.setId(id);
		this.vorname = vorname;
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

}
