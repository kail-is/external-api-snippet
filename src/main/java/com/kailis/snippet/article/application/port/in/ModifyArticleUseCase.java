package com.kailis.snippet.article.application.port.in;

import com.kailis.snippet.article.adapter.in.api.dto.ArticleDto;
import com.kailis.snippet.article.domain.Article;

public interface ModifyArticleUseCase {
    Article modifyArticle(ArticleDto.UpdateArticleRequest request);
}
