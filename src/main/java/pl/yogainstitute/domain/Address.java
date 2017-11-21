package pl.yogainstitute.domain;

public class Address {
	
	private Integer id;
	private String city;
	private String street;
	private String postalCode;
	
	
	
	public Address(String city, String street, String postalCode) {
		this.city = city;
		this.street = street;
		this.postalCode = postalCode;
	}



	public Integer getId() {
		return id;
	}



	public String getCity() {
		return city;
	}



	public String getStreet() {
		return street;
	}



	public String getPostalCode() {
		return postalCode;
	}
	
	

}
