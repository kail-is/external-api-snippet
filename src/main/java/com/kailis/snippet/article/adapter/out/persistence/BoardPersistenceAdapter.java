package com.kailis.snippet.article.adapter.out.persistence;

import com.kailis.snippet.article.adapter.out.persistence.entity.BoardJpaEntity;
import com.kailis.snippet.article.adapter.out.persistence.repository.BoardRepository;
import com.kailis.snippet.article.application.port.out.LoadBoardPort;
import com.kailis.snippet.article.domain.Board;
import java.util.Optional;
import org.springframework.stereotype.Component;

//@Component
//public class BoardPersistenceAdapter implements LoadBoardPort {
//    private final BoardRepository boardRepository;
//
//    public BoardPersistenceAdapter(BoardRepository boardRepository) {
//        this.boardRepository = boardRepository;
//    }
//
//    @Override
//    public Board findBoardById(Long boardId) {
//        return boardRepository.findById(boardId)
//            .map(BoardJpaEntity::toDomain).orElseThrow();
//    }
//}
