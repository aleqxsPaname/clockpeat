package com.socge.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Messages")
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String queue;

	//@Column(columnDefinition = "text")
	@Lob
	private String message;

	public Message(String queue, String message){
		this.queue = queue;
		this.message = message;
	}

	public Message(){
	}


	
}
