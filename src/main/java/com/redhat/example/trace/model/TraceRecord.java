package com.redhat.example.trace.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TraceRecord {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	String id;
	Date date;
	String message;
	
	public TraceRecord() {}
	
	public TraceRecord(String message) {
		this.date = new Date();
		this.message = message;
	}
	
	public TraceRecord(String id, Date date, String message) {
		this.id = id;
		this.date = date;
		this.message = message;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String toString() {
		return "TraceRecord{" +
				"id=\"" + id + "\", " +
				"date=" + date + ", " +
				"message=\"" + message + "\"}";
	}
}
