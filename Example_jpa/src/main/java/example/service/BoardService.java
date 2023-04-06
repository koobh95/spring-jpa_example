package example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import example.model.entity.Board;
import example.repository.BoardRepository;

@Service
public class BoardService {
	private BoardRepository boardRepository;
	
	public BoardService(BoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}

	@Transactional
	public Board getBoard(Long boardNo) {
		Optional<Board> board = boardRepository.findById(boardNo);
		// null 처리, 안해주면 HTTP 500 에러 발생
		
		return board.get();
	}

	@Transactional
	public List<Board> getAll() {
		return boardRepository.findAll();
	}
}
