package com.narrative.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


@Entity
//@Data
//@ToString(includeFieldNames=true)
//@RequiredArgsConstructor
@Table(name = "user_records")
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(
			name = "getUniqueUsersByTimestamp", 
			procedureName="getUniqueUsersByTimestamp",
			parameters= {
					@StoredProcedureParameter(mode = ParameterMode.IN, name = "epochTime", type = Long.class)})})
public class UserRecords {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long ID ;
	
	@Column(name = "userId")
	private String userId;

	@Column(name = "eventType")
	private int eventType;

	@Column(name = "timestamps")
	private Long timestamps;
	
	private Long clicks;
	private Long impressions;
	private Long uniqueUsers;
	
	public UserRecords() {
		super();
	}
	
	public UserRecords(String userId, int eventType, Long timestamps) {
		super();
		this.userId = userId;
		this.eventType = eventType;
		this.timestamps = timestamps;
	}
	
	public UserRecords(String userId, int eventType) {
		super();
		this.userId = userId;
		this.eventType = eventType;
	}
	
	public UserRecords(Long uniqueUsers, Long clicks, Long impressions) {
		super();
		this.uniqueUsers = uniqueUsers;
		this.clicks = clicks;
		this.impressions = impressions;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getEventType() {
		return eventType;
	}

	public void setEventType(int eventType) {
		this.eventType = eventType;
	}

	public Long gettimestamps() {
		return timestamps;
	}

	public void setDateTime(Long timestamps) {
		this.timestamps = timestamps;
	}
	
}
