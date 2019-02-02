package com.socge.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "system_example")
public class SystemExample {

	@Getter
	@Setter
	private String name;

	@Getter
	@Setter
	private String lastaudit;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private long id;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	
	public String toString(){
		return id+" | " + name+ " | "+ lastaudit;
	}
	
}
