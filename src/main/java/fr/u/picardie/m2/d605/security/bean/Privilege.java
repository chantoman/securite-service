package fr.u.picardie.m2.d605.security.bean;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Privilege {
	private String id;
	private String extref;
	private String name;
	private String group;
	public Privilege(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Privilege() {
	}

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
	public String getExtref() {
		return getId();
	}

	public void setExtref(String extref) {
		this.extref = getId();
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

}
