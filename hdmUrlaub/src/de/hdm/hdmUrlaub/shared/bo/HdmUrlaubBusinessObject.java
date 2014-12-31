package de.hdm.hdmUrlaub.shared.bo;

import java.io.Serializable;

/**
 * Basisklasse f&uuml;r alle Business Objects.
 * 
 * @author Fabian
 *
 */
public class HdmUrlaubBusinessObject implements Serializable {

	private static final long serialVersionUID = 6947890086626039880L;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
