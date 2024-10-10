package com.kailis.snippet.article.adapter.out.api;

import com.kailis.snippet.article.domain.Board;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "board-api", url = "http://localhost:8082")
public interface BoardFeignClient {

    @GetMapping("/boards/{id}")
    Board getBoardById(@PathVariable("id") Long boardId);

}
