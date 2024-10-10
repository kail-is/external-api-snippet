package com.kailis.snippet.article.application.port.in;

import com.kailis.snippet.article.domain.Article;
import java.util.List;

public interface GetArticleUseCase {
    Article getArticleById(Long articleId);

    List<Article> getArticlesByBoard(Long boardId);
}
