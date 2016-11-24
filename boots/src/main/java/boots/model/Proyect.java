package boots.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="proyect")
public class Proyect implements Serializable{

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(length=150)
	private String schedule;
	@Column(length=150)
	private String presentation;
	@Column(length=150)
	private String principle;
	@Column(length=150)
	private String description;
	
	public Proyect(String shedule, String presentation, String principle, String description) {
		super();
		this.schedule = shedule;
		this.presentation = presentation;
		this.principle =principle;
		this.description = description;
	
	}

	public Proyect() {
		this("","","","");
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the schedule
	 */
	public String getSchedule() {
		return schedule;
	}

	/**
	 * @param schedule the schedule to set
	 */
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	/**
	 * @return the presentation
	 */
	public String getPresentation() {
		return presentation;
	}

	/**
	 * @param presentation the presentation to set
	 */
	public void setPresentation(String presentation) {
		this.presentation = presentation;
	}

	/**
	 * @return the principle
	 */
	public String getPrinciple() {
		return principle;
	}

	/**
	 * @param principle the principle to set
	 */
	public void setPrinciple(String principle) {
		this.principle = principle;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Proyect [id=" + id + ", schedule=" + schedule + ", presentation=" + presentation + ", principle="
				+ principle + ", description=" + description + "]";
	}

	
    
		
	
}
