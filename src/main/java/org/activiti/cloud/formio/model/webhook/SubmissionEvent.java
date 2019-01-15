package org.activiti.cloud.formio.model.webhook;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.cloud.formio.model.submission.Metadata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SubmissionEvent implements Serializable {

	@JsonProperty("_id")
	private String id;
	private String owner;
	private Object deleted;
	private List<Object> roles = new ArrayList<Object>();
	private Map<String, Object> data;
	private List<Object> access = new ArrayList<Object>();
	private Metadata metadata;
	private String form;
	private List<Object> externalIds = new ArrayList<Object>();
	private String created;
	private String modified;
	private Long v;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -2969686806236372286L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public SubmissionEvent() {
	}

	/**
	 * 
	 * @param id
	 * @param v
	 * @param externalIds
	 * @param form
	 * @param created
	 * @param roles
	 * @param data
	 * @param owner
	 * @param access
	 * @param deleted
	 * @param modified
	 * @param metadata
	 */
	
	public SubmissionEvent(String id, String owner, Object deleted, List<Object> roles, Map<String, Object> data, List<Object> access,
			Metadata metadata, String form, List<Object> externalIds, String created, String modified, Long v) {
		super();
		this.id = id;
		this.owner = owner;
		this.deleted = deleted;
		this.roles = roles;
		this.data = data;
		this.access = access;
		this.metadata = metadata;
		this.form = form;
		this.externalIds = externalIds;
		this.created = created;
		this.modified = modified;
		this.v = v;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public SubmissionEvent withId(String id) {
		this.id = id;
		return this;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public SubmissionEvent withOwner(String owner) {
		this.owner = owner;
		return this;
	}

	public Object getDeleted() {
		return deleted;
	}

	public void setDeleted(Object deleted) {
		this.deleted = deleted;
	}

	public SubmissionEvent withDeleted(Object deleted) {
		this.deleted = deleted;
		return this;
	}

	public List<Object> getRoles() {
		return roles;
	}

	public void setRoles(List<Object> roles) {
		this.roles = roles;
	}

	public SubmissionEvent withRoles(List<Object> roles) {
		this.roles = roles;
		return this;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}

	public SubmissionEvent withData(Map<String, Object> data) {
		this.data = data;
		return this;
	}

	public List<Object> getAccess() {
		return access;
	}

	public void setAccess(List<Object> access) {
		this.access = access;
	}

	public SubmissionEvent withAccess(List<Object> access) {
		this.access = access;
		return this;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public SubmissionEvent withMetadata(Metadata metadata) {
		this.metadata = metadata;
		return this;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public SubmissionEvent withForm(String form) {
		this.form = form;
		return this;
	}

	public List<Object> getExternalIds() {
		return externalIds;
	}

	public void setExternalIds(List<Object> externalIds) {
		this.externalIds = externalIds;
	}

	public SubmissionEvent withExternalIds(List<Object> externalIds) {
		this.externalIds = externalIds;
		return this;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public SubmissionEvent withCreated(String created) {
		this.created = created;
		return this;
	}

	public String getModified() {
		return modified;
	}

	public void setModified(String modified) {
		this.modified = modified;
	}

	public SubmissionEvent withModified(String modified) {
		this.modified = modified;
		return this;
	}

	public Long getV() {
		return v;
	}

	public void setV(Long v) {
		this.v = v;
	}

	public SubmissionEvent withV(Long v) {
		this.v = v;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public SubmissionEvent withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}