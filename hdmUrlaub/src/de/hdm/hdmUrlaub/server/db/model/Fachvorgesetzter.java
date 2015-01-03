package de.hdm.hdmUrlaub.server.db.model;

// Generated 03.01.2015 17:25:14 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Fachvorgesetzter generated by hbm2java
 */
@Entity
@Table(name = "fachvorgesetzter", catalog = "mydb")
public class Fachvorgesetzter extends HibernateObject {

	private static final long serialVersionUID = -4563541615518163720L;
	private int id;
	private String nachname;
	private String vorname;
	private String email;
	private Set<Urlaubsantrag> urlaubsantrags = new HashSet<Urlaubsantrag>(0);

	public Fachvorgesetzter() {
	}

	public Fachvorgesetzter(int id) {
		this.id = id;
	}

	public Fachvorgesetzter(int id, String nachname, String vorname,
			String email, Set<Urlaubsantrag> urlaubsantrags) {
		this.id = id;
		this.nachname = nachname;
		this.vorname = vorname;
		this.email = email;
		this.urlaubsantrags = urlaubsantrags;
	}

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "nachname", length = 45)
	public String getNachname() {
		return this.nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	@Column(name = "vorname", length = 45)
	public String getVorname() {
		return this.vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	@Column(name = "email", length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fachvorgesetzter")
	public Set<Urlaubsantrag> getUrlaubsantrags() {
		return this.urlaubsantrags;
	}

	public void setUrlaubsantrags(Set<Urlaubsantrag> urlaubsantrags) {
		this.urlaubsantrags = urlaubsantrags;
	}

}
