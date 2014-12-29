package de.hdm.hdmUrlaub.shared.enums;

public enum Status {

	OFFEN("Offen"), GENEHMIGT("Genehmigt"), ABGELEHNT("Abgelehnt");

	private String text;

	private Status(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

}
