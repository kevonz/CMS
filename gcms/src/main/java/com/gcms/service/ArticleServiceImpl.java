/**
 * 
 */
package com.gcms.service;

import com.gcms.dao.ArticleDAO;
import com.gcms.entity.Article;
import com.gcms.entity.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Jin
 *
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired(required = false)
    private ArticleDAO articleDAO;

	/* (non-Javadoc)
	 * @see com.gcms.service.ArticleService#addArticle(com.gcms.entity.Article)
	 */
    @Transactional
	public void addArticle(Article article) {
        articleDAO.addArticle(article);
	}

    @Override
    @Transactional
    public List<Article> getArticles() {
        return articleDAO.getArticles();
    }

    /* (non-Javadoc)
     * @see com.gcms.service.ArticleService#addTag(com.gcms.entity.Tag)
     */
    @Transactional
	public void addTag(Tag tag) {
		articleDAO.addTag(tag);
	}

}
