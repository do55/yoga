package pl.yogainstitute.domain;

import java.math.BigDecimal;



public class Product {
	private Integer id;
	private String name;
	private String color;
	private ProductSize size;
	private BigDecimal price;
	
	
	public Product() {}
	
	public Product(String name, String color, ProductSize size, BigDecimal price) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public ProductSize getSize() {
		return size;
	}

	public BigDecimal getPrice() {
		return price;
	}
	
	

}
