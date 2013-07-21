package com.gcms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the t_tag database table.
 * 
 */
@Entity
@Table(name="t_tag")
public class Tag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	//bi-directional many-to-many association to Article
	@ManyToMany
	@JoinTable(
		name="t_article_tag"
		, joinColumns={
			@JoinColumn(name="tag_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="article_id")
			}
		)
	private List<Article> Articles;

	public Tag() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Article> getArticles() {
		return this.Articles;
	}

	public void setArticles(List<Article> Articles) {
		this.Articles = Articles;
	}

}