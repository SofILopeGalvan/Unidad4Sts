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

@Entity(name="garment")
public class Garment implements Serializable{

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(length=45)
	private String color;
	@Column(length=45)
	private String type;
	@Column(length=45)
	private String size;
	
	
	public Garment(String color, String type, String size) {
		super();
		this.color = color;
		this.type = type;
		this.size = size;
		
	}

	public Garment() {
		this("","","");
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
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Garment [id=" + id + ", color=" + color + ", type=" + type + ", size=" + size + "]";
	}


}
