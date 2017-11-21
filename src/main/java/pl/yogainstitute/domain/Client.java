package pl.yogainstitute.domain;

public class Client {
	
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private ClientType type;
	
	public Client() {}

	public Client(String firstName, String lastName, String email, ClientType type) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public ClientType getType() {
		return type;
	}
	
	
	
}
