package com.gcms.service;

import com.gcms.entity.Article;
import com.gcms.entity.Tag;

import java.util.List;

public interface ArticleService {
	public void addArticle(Article article);
    public List<Article> getArticles();
	public void addTag(Tag tag);
}
