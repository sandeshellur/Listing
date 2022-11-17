package com.example.propertyListing.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Images {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	String imageurl;
	String size;
	
	@OneToOne
	@JoinColumn(name = "property_id", referencedColumnName = "id")
	private Property property;
	
	public Images() {
		super();
		
	}

	public Images(Integer id, String imageurl, String size, Property property) {
		super();
		this.id = id;
		this.imageurl = imageurl;
		this.size = size;
		this.property = property;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

}
