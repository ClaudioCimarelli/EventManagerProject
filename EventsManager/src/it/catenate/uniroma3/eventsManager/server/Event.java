package it.catenate.uniroma3.eventsManager.server;

// Generated 16-giu-2014 12.19.45 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Event generated by hbm2java
 */
@Entity
@Table(name = "Event")
public class Event implements java.io.Serializable {

	private Long id;
	private Date date;
	private String notes;
	private String organization;
	private Integer version;

	public Event() {
	}

	public Event(Date date) {
		this.date = date;
	}

	public Event(Date date, String notes, String organization, Integer version) {
		this.date = date;
		this.notes = notes;
		this.organization = organization;
		this.version = version;
	}

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "date", unique = true, nullable = false)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "notes")
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "organization")
	public String getOrganization() {
		return this.organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	@Column(name = "version")
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
