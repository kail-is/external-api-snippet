package com.kailis.snippet.article.adapter.out.api;


import com.kailis.snippet.article.domain.Article;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "article-api", url = "http://localhost:8081")
public interface ArticleFeignClient {

    @GetMapping("/articles/{id}")
    Article getArticleById(@PathVariable("id") Long articleId);

    @GetMapping("/boards/{boardId}/articles")
    List<Article> getArticlesByBoardId(@PathVariable("boardId") Long boardId);

    @PostMapping("/articles")
    Article createArticle(@RequestBody Article article);

    @PutMapping("/articles/{id}")
    Article modifyArticle(@PathVariable("id") Long articleId, @RequestBody Article article);

    @DeleteMapping("/articles/{id}")
    void deleteArticle(@PathVariable("id") Long articleId);
}