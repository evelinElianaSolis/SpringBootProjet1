package com.infsis.proyect1.Services.Implements;

import com.infsis.proyect1.DTOs.ArticleDTO;
import com.infsis.proyect1.Models.Article;
import com.infsis.proyect1.Services.ArticleService;
import com.infsis.proyect1.Services.UserService;

import java.util.Optional;

public class ArticleServiceImpl implements ArticleService {

    @Override
    public Optional<ArticleDTO> ArticleById(Integer ArticleId) {
        return Optional.empty();
    }

    @Override
    public ArticleDTO saveArticle(ArticleDTO articleDTO) {
        return null;
    }

    @Override
    public ArticleDTO updateArticle(Integer articleId, ArticleDTO articleDTO) {
        return null;
    }

    @Override
    public void deleteArticle(Integer articleId) {

    }
    public Article articleDtoToArticle(ArticleDTO articleDTO){
        Article article = new Article();
        article.setId(articleDTO.getId());
        article.setTitle(articleDTO.getTitle());
        article.setReference(articleDTO.getReference());

        return article;
    }

    public ArticleDTO articleToArticleDTO(Article article){
        ArticleDTO articleDTO = new ArticleDTO(
                article.getId(),
                article.getTitle(),
                article.getReference()
        );
        return  articleDTO;
    }
}
