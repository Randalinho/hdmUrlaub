package de.hdm.hdmUrlaub.server.db.model;

// Generated 30.12.2014 17:40:22 by Hibernate Tools 4.3.1

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
 * Mitarbeiter generated by hbm2java
 */
@Entity
@Table(name = "mitarbeiter", catalog = "mydb")
public class Mitarbeiter extends HibernateObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 452848136323507457L;
	private Integer id;
	private String vorname;
	private String nachname;
	private Set<Urlaubsantrag> urlaubsantrags = new HashSet<Urlaubsantrag>(0);

	public Mitarbeiter() {
	}

	public Mitarbeiter(int id) {
		this.id = id;
	}

	public Mitarbeiter(int id, String vorname, String nachname,
			Set<Urlaubsantrag> urlaubsantrags) {
		this.id = id;
		this.vorname = vorname;
		this.nachname = nachname;
		this.urlaubsantrags = urlaubsantrags;
	}

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "vorname", length = 45)
	public String getVorname() {
		return this.vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	@Column(name = "nachname", length = 45)
	public String getNachname() {
		return this.nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mitarbeiter")
	public Set<Urlaubsantrag> getUrlaubsantrags() {
		return this.urlaubsantrags;
	}

	public void setUrlaubsantrags(Set<Urlaubsantrag> urlaubsantrags) {
		this.urlaubsantrags = urlaubsantrags;
	}

}
