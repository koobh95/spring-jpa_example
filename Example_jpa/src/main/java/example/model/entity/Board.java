package example.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Getter;

@Entity
@Getter
@SequenceGenerator(name = "BOARD_NO_SEQ",
		sequenceName = "seq_board_bd_number",
		initialValue = 1,
		allocationSize = 1)
public class Board {
	@Id
	@Column(name="bd_no")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
			generator="BOARD_NO_SEQ")
	private Long no;
	private String title;
	private String content;
	private String writer;
	
	protected Board() {}
}
