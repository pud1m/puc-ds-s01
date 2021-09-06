package src.model;

public abstract class User {

	private String Name;

	private String Password;

	private String Address;

	public User(String Name, String Password, String Address) {

	}

	public void setName(String Name) {

	}

	public String getName() {
		return null;
	}

	public void setPassword(String Password) {

	}

	public String getPassword() {
		return null;
	}

	public void setAddress(String Address) {

	}

	public String getAddress() {
		return null;
	}

	public abstract void createRegistrations();

	public abstract void getGroups();

}
