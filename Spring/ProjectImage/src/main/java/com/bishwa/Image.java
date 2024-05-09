package com.bishwa;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Image {

	@Id
	private int id;
	private String  PersonName;
	@Lob()
	@Column(columnDefinition =  "MEDIUMBLOB")

	private  byte[] image;
	/**
	 * 
	 */
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param personName
	 * @param image
	 */
	public Image(int id, String personName, byte[] image) {
		super();
		this.id = id;
		PersonName = personName;
		this.image = image;
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
	 * @return the personName
	 */
	public String getPersonName() {
		return PersonName;
	}
	/**
	 * @param personName the personName to set
	 */
	public void setPersonName(String personName) {
		PersonName = personName;
	}
	/**
	 * @return the image
	 */
	public byte[] getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(byte[] image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Image [id=" + id + ", PersonName=" + PersonName + ", image=" + Arrays.toString(image) + "]";
	}
	
	
}
