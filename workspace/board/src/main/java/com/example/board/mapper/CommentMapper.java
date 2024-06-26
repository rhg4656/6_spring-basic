package com.example.board.mapper;

import com.example.board.domain.dto.CommentListDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {

    // 해당 게시글의 댓글 목록 보기
    List<CommentListDTO> selectCommentById(Long boardId);


}
