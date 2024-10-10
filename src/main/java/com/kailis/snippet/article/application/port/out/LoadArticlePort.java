package com.kailis.snippet.article.application.port.out;

import com.kailis.snippet.article.domain.Article;
import java.util.List;
import java.util.Optional;

public interface LoadArticlePort {
    Article findArticleById(Long articleId);
    List<Article> findArticlesByBoardId(Long boardId);
}
