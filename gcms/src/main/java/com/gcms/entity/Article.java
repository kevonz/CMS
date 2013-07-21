package com.gcms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the t_article database table.
 * 
 */
@Entity
@Table(name="t_article")
public class Article implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String title;

	//bi-directional many-to-many association to Tag
	@ManyToMany(mappedBy="Articles")
	private List<Tag> Tags;

	public Article() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Tag> getTags() {
		return this.Tags;
	}

	public void setTags(List<Tag> Tags) {
		this.Tags = Tags;
	}

}