package demo.example.model;

import java.util.Date;

public class Product {
	private String id;
	private String name;
	private String photo;
	private Date creationDate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Product(String id, String name, String photo, Date creationDate) {
		super();
		this.id = id;
		this.name = name;
		this.photo = photo;
		this.creationDate = creationDate;
	}
	public Product() {
		super();
	}
	
	
	
	

}
