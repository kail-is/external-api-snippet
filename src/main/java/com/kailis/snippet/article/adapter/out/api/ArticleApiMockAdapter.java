package com.kailis.snippet.article.adapter.out.api;

import com.kailis.snippet.article.application.port.out.CommandArticlePort;
import com.kailis.snippet.article.application.port.out.LoadArticlePort;
import com.kailis.snippet.article.domain.Article;
import com.kailis.snippet.article.domain.Board;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Profile("!prod")
@Component
public class ArticleApiMockAdapter implements LoadArticlePort, CommandArticlePort {

    @Override
    public Article findArticleById(Long articleId) {

        log.info("findArticleById: {}", articleId);

        Board board = new Board(1L, "name");
        return new Article(articleId, board, "Mocked Subject", "This is mocked content.", "MockUser", LocalDateTime.now());

    }

    @Override
    public List<Article> findArticlesByBoardId(Long boardId) {

        log.info("findArticlesByBoardId: {}", boardId);
        Board board = new Board(boardId, "name");

        return List.of(
            new Article(1L, board, "Mocked Subject", "This is mocked content.", "MockUser", LocalDateTime.now()),
            new Article(2L, board, "Mocked Subject", "This is mocked content.", "MockUser", LocalDateTime.now()),
            new Article(3L, board, "Mocked Subject", "This is mocked content.", "MockUser", LocalDateTime.now()),
            new Article(4L, board, "Mocked Subject", "This is mocked content.", "MockUser", LocalDateTime.now())
        );
    }

    @Override
    public Article createArticle(Article article) {
        log.info("createArticle");
        Board board = new Board(99L, "name");
        return new Article(99L, board, "Mocked Subject", "This is a created article.", "MockUser", LocalDateTime.now());
    }

    @Override
    public Article modifyArticle(Article article) {
        log.info("modifyArticle");
        Board board = new Board(999L, "name");
        return new Article(999L, board, "Mocked Subject", "This is a modified article.", "MockUser", LocalDateTime.now());
    }

    @Override
    public void deleteArticle(Long articleId) {
        log.info("deleteArticle");
    }

}
