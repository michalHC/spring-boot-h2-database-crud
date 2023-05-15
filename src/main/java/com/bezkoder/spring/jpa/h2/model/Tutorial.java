package com.bezkoder.spring.jpa.h2.model;

import javax.persistence.*;

@Entity
@Table(name = "tutorials")
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

/*	@Column(name = "level")
	private int level;

 */
	@Column(name = "published")
	private boolean published;

/*
	@Column(name="created_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
*/
	public Tutorial() {

	}

	public Tutorial(String title, String description, boolean published) {
		//String title, String description, int level, boolean published, Date createdAt
		this.title = title;
		this.description = description;
		//this.level = level;
		this.published = published;
		//this.createdAt = createdAt;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean isPublished) {
		this.published = isPublished;
	}
	/*
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	 */

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
	}

}
