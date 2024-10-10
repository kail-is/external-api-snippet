package com.kailis.snippet.article.application.port.out;

import com.kailis.snippet.article.domain.Article;

public interface CommandArticlePort {
    Article createArticle(Article article);

    Article modifyArticle(Article article);

    void deleteArticle(Long articleId);
}
