package sec01;

import java.util.List;
import java.util.ArrayList;

public class BoardDao {
	public List<Board> getBoardList(){
		List<Board> list = new ArrayList<>();
		list.add(new Board("제목1","내용1"));
		// Board board1 = new Board("제목1","내용1");
		// list.add(board1); -> 위 내용을 풀어 쓴것
		list.add(new Board("제목2","내용2"));
		list.add(new Board("제목3","내용3"));
		return list;
	}

}
