package sec02;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
public class ObjectStreamExample {

	public static void main(String[] args) throws Exception {
		// Object 보조 스트림 활용 예제
		
		// 게시판 등록
		writeList();
		
		//게시판 조회
		List<Board> boardlist = readList();
		for(Board board : boardlist) {
			System.out.println(
					board.getBno() + "\t" +
							board.getTitle() + "\t" +
							board.getContent() + "\t"+
							board.getWriter() + "\t"+
							new SimpleDateFormat("yyyy-mm-dd").format(board.getData())
							);
		}
		
		System.out.println("프로그램 종료");
	}
	public static void writeList() throws Exception{
		List<Board> boardlist = new ArrayList<>();
		
		// 게시판 낱개 등록
		boardlist.add(new Board(1,"제목1","본문1","글쓴이1", new Date()));
		boardlist.add(new Board(2,"제목2","본문2","글쓴이2", new Date()));
		boardlist.add(new Board(3,"제목3","본문3","글쓴이3", new Date()));
		
		FileOutputStream fos = new FileOutputStream("./bin/sec02/board.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);	//objectoutput 보조 스트림
		oos.writeObject(boardlist);
		oos.flush();
		oos.close();
	}
	// board.db 파일에 있는 게시판의 내용들을 조회하여 List객체를 리턴한다.
	public static List<Board> readList() throws Exception{
		FileInputStream fis = new FileInputStream("./bin/sec02/board.db");
		ObjectInputStream ois = new ObjectInputStream(fis);		//objectInput 보조 스트림
		List boardlist =(List<Board>)ois.readObject();
		
		return boardlist;
		
		
	}

}
