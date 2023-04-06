package example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import example.model.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
	
}
