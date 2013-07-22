package com.gcms.dao;

import com.gcms.entity.Article;
import com.gcms.entity.Tag;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jin
 * Date: 13-7-22
 * Time: 下午8:56
 * To change this template use File | Settings | File Templates.
 */
public interface ArticleDAO {
    public void addArticle(Article article);
    public List<Article> getArticles();
    public void addTag(Tag tag);
}
