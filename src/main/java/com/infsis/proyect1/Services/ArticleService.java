package com.infsis.proyect1.Services;

import com.infsis.proyect1.DTOs.ArticleDTO;
import com.infsis.proyect1.Models.Article;

import java.util.Optional;

public interface ArticleService {
    Optional<ArticleDTO> ArticleById (Integer ArticleId);
    ArticleDTO saveArticle(ArticleDTO articleDTO);
    ArticleDTO updateArticle(Integer articleId, ArticleDTO articleDTO);
    void deleteArticle(Integer articleId);
}
