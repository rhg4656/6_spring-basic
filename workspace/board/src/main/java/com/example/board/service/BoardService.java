package com.example.board.service;

import com.example.board.domain.dto.BoardDTO;
import com.example.board.domain.dto.BoardDetailDTO;
import com.example.board.domain.dto.BoardListDTO;
import com.example.board.domain.oauth.CustomOAuth2User;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public interface BoardService {

    // 페이징 처리된 게시글 목록
    List<BoardListDTO> getBoardList(int page, int pageSize);

    // 게시판 총 갯수
    // 페이징 처리할 때 사용할 쿼리
    int getBoardListCount();

    // 게시글 작성
    // 첨부파일도 insert
    void saveBoard(BoardDTO board, List<MultipartFile> files);

    // 게시글 상세보기
    BoardDetailDTO getBoardById(Long boardId, CustomOAuth2User customOAuth2User);

}
