package example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import example.model.entity.Board;
import example.service.BoardService;

@RestController
@RequestMapping("/board")
public class BoardController {
	private BoardService boardService;
	
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	@RequestMapping(value="/find", method=RequestMethod.GET)
	public Board find(Long boardNo) {
		return boardService.getBoard(boardNo);
	}
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Board> getAll() {
		return boardService.getAll();
	}
}
