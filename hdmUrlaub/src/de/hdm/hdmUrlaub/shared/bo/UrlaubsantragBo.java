package de.hdm.hdmUrlaub.shared.bo;

import de.hdm.hdmUrlaub.shared.enums.Status;

public class UrlaubsantragBo extends HdmUrlaubBusinessObject {

	private static final long serialVersionUID = -7712834612413841876L;

	private String vertretung;

	private String fachvorgesetzter;

	private int anzahltage;

	private Status status;

	private int mitarbeiterId;

	public UrlaubsantragBo() {
		super();
	}

	public UrlaubsantragBo(Integer id, String vertretung,
			String fachvorgesetzter, int anzahltage, int mitarbeiterId) {
		super();
		this.setId(id);
		this.vertretung = vertretung;
		this.fachvorgesetzter = fachvorgesetzter;
		this.anzahltage = anzahltage;
		this.mitarbeiterId = mitarbeiterId;
	}

	public String getVertretung() {
		return vertretung;
	}

	public void setVertretung(String vertretung) {
		this.vertretung = vertretung;
	}

	public String getFachvorgesetzter() {
		return fachvorgesetzter;
	}

	public void setFachvorgesetzter(String fachvorgesetzter) {
		this.fachvorgesetzter = fachvorgesetzter;
	}

	public int getAnzahltage() {
		return anzahltage;
	}

	public void setAnzahltage(int anzahltage) {
		this.anzahltage = anzahltage;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public int getMitarbeiterId() {
		return mitarbeiterId;
	}

	public void setMitarbeiterId(int mitarbeiterId) {
		this.mitarbeiterId = mitarbeiterId;
	}

}
