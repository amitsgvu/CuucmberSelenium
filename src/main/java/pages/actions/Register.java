package pages.actions;

public class Register {

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	private String firstName;
	private String lastName;
	private String phone;
	private String Email;

	public Register(String firstName, String lastName, String phone, String Email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.Email = Email;

	}

}
