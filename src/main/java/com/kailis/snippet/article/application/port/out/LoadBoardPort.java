package com.kailis.snippet.article.application.port.out;

import com.kailis.snippet.article.domain.Board;
import java.util.Optional;

public interface LoadBoardPort {
    Board findBoardById(Long boardId);
}
