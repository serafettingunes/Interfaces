package interfaces;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;

	public Customer() {

	}

	public Customer(int id, String fristName, String lastName) {
		super();
		this.id = id;
		this.firstName = fristName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFristName() {
		return firstName;
	}

	public void setFristName(String fristName) {
		this.firstName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
