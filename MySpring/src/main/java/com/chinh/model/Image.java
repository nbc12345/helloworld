package com.chinh.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the image database table.
 * 
 */
@Entity
@NamedQuery(name="Image.findAll", query="SELECT i FROM Image i")
public class Image implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idimage;

	private String imagename;

	public Image() {
	}

	public int getIdimage() {
		return this.idimage;
	}

	public void setIdimage(int idimage) {
		this.idimage = idimage;
	}

	public String getImagename() {
		return this.imagename;
	}

	public void setImagename(String imagename) {
		this.imagename = imagename;
	}

}