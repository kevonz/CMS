package com.gcms.controller;

import com.gcms.entity.Article;
import com.gcms.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/article/add")
    public String addArticle(Map<String, Object> map) {
        Article article = new Article();
        map.put("article", article);
        map.put("articlelist", articleService.getArticles());
        return "article";
    }

    @RequestMapping(value = "/article/add", method = RequestMethod.POST)
    public String register(@ModelAttribute("article")
                               Article article, BindingResult result) {
        articleService.addArticle(article);
        return "redirect:/article/add";
    }
}
