package io.javabrains.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.javabrains.springbootstarter.topic.Topic;

@Entity
public class Course {
	
	private String name;
	private String description;
	@Id
	private String id;
	@ManyToOne
	private Topic topic;
	
	public Course()
	{
		
	}
	public Course(String name, String description, String id, String topicId) {
		super();
		this.name = name;
		this.description = description;
		this.id = id;
		this.topic = new Topic(topicId, "", "");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}

}
