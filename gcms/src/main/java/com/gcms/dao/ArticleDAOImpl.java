package com.gcms.dao;

import com.gcms.entity.Article;
import com.gcms.entity.Tag;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jin
 * Date: 13-7-22
 * Time: 下午8:57
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class ArticleDAOImpl implements ArticleDAO {

    @Resource
    private SessionFactory sessionFactory;

    @Override
    public void addArticle(Article article) {
        sessionFactory.getCurrentSession().save(article);
    }

    @Override
    public List<Article> getArticles() {
        return sessionFactory.getCurrentSession().createQuery("from Article").list();
    }

    @Override
    public void addTag(Tag tag) {
        sessionFactory.getCurrentSession().save(tag);
    }
}
