package com.kailis.snippet.article.adapter.out.api;

import com.kailis.snippet.article.application.port.out.CommandArticlePort;
import com.kailis.snippet.article.application.port.out.LoadArticlePort;
import com.kailis.snippet.article.domain.Article;
import com.kailis.snippet.common.exception.ResourceNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ArticleApiAdapter implements LoadArticlePort, CommandArticlePort {

    private final ArticleFeignClient articleFeignClient;

    public ArticleApiAdapter(ArticleFeignClient articleFeignClient) {
        this.articleFeignClient = articleFeignClient;
    }

    @Override
    public Article findArticleById(Long articleId) {
        Article article = articleFeignClient.getArticleById(articleId);
        if (article == null) {
            throw new ResourceNotFoundException("Article not found with id: " + articleId);
        }
        return article;
    }

    @Override
    public List<Article> findArticlesByBoardId(Long boardId) {
        return articleFeignClient.getArticlesByBoardId(boardId);
    }

    @Override
    public Article createArticle(Article article) {
        return articleFeignClient.createArticle(article);
    }

    @Override
    public Article modifyArticle(Article article) {
        return articleFeignClient.modifyArticle(article.getId(), article);
    }

    @Override
    public void deleteArticle(Long articleId) {
        articleFeignClient.deleteArticle(articleId);
    }
}
