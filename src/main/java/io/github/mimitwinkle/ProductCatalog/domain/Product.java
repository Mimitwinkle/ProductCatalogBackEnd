package io.github.mimitwinkle.ProductCatalog.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "price", nullable = false)
	private double price;
	
	/*
	 * TODO: Create data column for storing the categories of a product
	@Column(name = "categories")
	private List<String> categories;
	*/
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "imageUrl")
	private String imageUrl;
	
	
	public Product() {
	}
	
	public Product(long id, String name, double price, String description, String imageUrl) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.imageUrl = imageUrl;
	}

	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
}
