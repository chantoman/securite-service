package fr.u.picardie.m2.d605.security.bean;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

public class User {
	@Id
	private String id;
	private String extref;
	@Indexed(unique = true)
	private String login;
	private Boolean provided;
	private String provider;
	private String lastName;
	private String firstName;
	private String email;
	private String password;
	private boolean enabled;
	private boolean tokenExpired;
	private List<Role> roles;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isTokenExpired() {
		return tokenExpired;
	}

	public void setTokenExpired(boolean tokenExpired) {
		this.tokenExpired = tokenExpired;
	}

	public Boolean getProvided() {
		return provided;
	}

	public void setProvided(Boolean provided) {
		this.provided = provided;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public String getExtref() {
		return getId();
	}

	public void setExtref(String extref) {
		this.extref = getId();
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public String getId() {
		return id;
	}

	public void setId(String _id) {
		this.id = _id;
	}

}
