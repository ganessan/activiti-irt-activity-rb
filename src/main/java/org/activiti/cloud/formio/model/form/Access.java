package org.activiti.cloud.formio.model.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Access implements Serializable {

	private List<String> roles = new ArrayList<String>();
	private String type;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 2503411813220911502L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Access() {
	}

	/**
	 * 
	 * @param roles
	 * @param type
	 */
	public Access(List<String> roles, String type) {
		super();
		this.roles = roles;
		this.type = type;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public Access withRoles(List<String> roles) {
		this.roles = roles;
		return this;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Access withType(String type) {
		this.type = type;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Access withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}