package com.kailis.snippet.article.adapter.out.api;

import com.kailis.snippet.article.application.port.out.LoadBoardPort;
import com.kailis.snippet.article.domain.Board;
import org.springframework.stereotype.Component;

@Component
public class BoardApiAdapter implements LoadBoardPort {

    private final BoardFeignClient boardFeignClient;

    public BoardApiAdapter(BoardFeignClient boardFeignClient) {
        this.boardFeignClient = boardFeignClient;
    }

    @Override
    public Board findBoardById(Long boardId) {
        return boardFeignClient.getBoardById(boardId);
    }

}
