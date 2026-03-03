package com.board.springboard.model.mapper;

import com.board.springboard.model.dto.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    // 전체 게시물 조회
    List<Board> 전체게시물();

    // 게시물 하나 조회
    Board 단일게시물();

    // 게시물 추가
    void 게시물추가();

    // 게시물 수정
    void 게시물수정();

    // 게시물 삭제
    void 게시물삭제();
}
