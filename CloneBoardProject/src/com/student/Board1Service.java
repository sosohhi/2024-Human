package com.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.student.utils.DBManager;

public class Board1Service {
	Scanner scanner = new Scanner(System.in);
	
	/**
	 * 설명 : 게시글 작성
	 */
	public int insertBoard() {
		// 1. 게시글 제목 받기
		System.out.println("글제목(취소: quit): ");
		String title = scanner.nextLine();	// 키보드로 글 제목 받기
		if (title.equals("quit")) {
			System.out.println("작성이 취소되었습니다.");
			return -1;
		}
		
		// 2. 게시글 내용 받기
		System.out.println("글내용(취소: quit): ");
		String content = scanner.nextLine(); // 키보드로 글 내용 받기
		if (content.equals("quit")) {
			System.out.println("작성이 취소되었습니다.");
			return -1;
		}
		
		// 3. DB위에 입력된 게시글의 제목과 내용을 받아서 Oracle DB에 저장할 수 있도록 DB접속준비
		Connection conn = DBManager.getConnection();
		
		// 4. Oracle DB에 데이터를 삽입하기 위해 insert sql문을 작성
		String insertSql = """
				INSERT INTO board(seq,title,content, read_count) 
				VALUES (seq_board_no.NEXTVAL, ?, ?,0)				
				""";
		
		int resultRows =0;	//insert문을 실행한 뒤에 테이블 영향을 받은 행 개수
		PreparedStatement pstmt = null;
		
		try {
		// 5. Oracle DB에 데이터를 삽입할 코드를 실행할 준비 
		pstmt = conn.prepareStatement(insertSql);
		pstmt.setString(1, title);		// 위 insertSql에 첫번째?에 키보드로 입력받은 제목을 세팅
		pstmt.setString(2, content);	// 위 insertSql에 두번째?에 키보드로 입력받은 내용을 세팅
		
		// 6. 실제로 sql코드를  실행
		resultRows = pstmt.executeUpdate();	//executeUpdate로 insert, update, delete sql코드를 실행
		System.out.println("글이 성공적으로 등록됨.");
		
		}catch(SQLException se) {
			System.out.println("게시글 삽입하는 도중 에러가 발생 -> " + se.getMessage());
		} finally {
			DBManager.dbClose(conn, pstmt,null);
		}
		return resultRows;
		
		
	}
	
	/**
	 * 설명 : 게시글 목록조회
	 */
	public void selectAllBoard() {
		
		PreparedStatement pstmt2 = null;
		ResultSet rs = null;
		
		// 게시판 목록조회 화면구성
		System.out.println("-----------------------------------------------------------------");
		System.out.println("번호       제목                         작성일        수정일        조회수");
		System.out.println("-----------------------------------------------------------------");
		
		//Oracle DB의 Board 테이블에서 위의 4가지 항묵(번호, 제목, 작성일자, 조회수)가 나오도록 출력
		Connection conn = DBManager.getConnection();
		String selectSql = "SELECT seq, title, create_date, read_count, update_date FROM board Order BY seq DESC";
		int countRows = 0; //행의 번호
		
		try {
			pstmt2 = conn.prepareStatement(selectSql);
			rs = pstmt2.executeQuery();
			
			while (rs.next()) {		//sql실행한 데이터들의 1행을 가져옴(데이터가 있으면 true, 없으면 false)
				countRows++;
				
				System.out.println(rs.getString("seq") +"\t" +  
						rs.getString("title") + "\t" +"\t"+
						rs.getString("create_date")+"\t" +"\t"+
						rs.getInt("read_count")) ;
				
				
				
				//printf -> %-3s -> 음수는 오른쪽에서부터 공백문자열 채워줌
				//printf -> %3s -> 양수는 왼쪽에서부터 공백문자열 채워줌
//				System.out.printf("%-5s | %-20s  | %-15s |%-7s \n"
//						,rs.getString("seq")
//						,rs.getString("title")
//						,rs.getString("create_date")
//						,rs.getString("read_count") == null ? "0" : rs.getString("read_count") );
//			
			
			}
			if (countRows ==0 ) {		//board테이블에 데이터가 없을 경우
				System.out.println("게시글이 존재하지 않습니다.");
			}		
		}catch(SQLException se) {
			se.printStackTrace();
			System.out.println("게시글 목록 실행오류 -> " + se.getMessage());
			
		} finally {
			DBManager.dbClose(conn, pstmt2,rs);
		}
						
}
	
	/**
	 * 설명 : 게시글 수정
	 * 
	 */
	public int updateBoard() {
		// 1. 수정할 게시글 번호
		
		System.out.println("작성목록을 수정하시겠습니까?(yes/no): ");
		String select_yn = scanner.nextLine();
			
		if (select_yn.equals("no")) {
			System.out.println("수정이 취소되었습니다");
			return-1;
			}
		// 1. 게시글의 상세 데이터를 받기 위해 Oracle DB로 접속준비	
		Connection conn = DBManager.getConnection();
		
		String countSql = "SELECT COUNT(*) FROM board WHERE seq = ? ";
		
		// 2. 게시글 특정번호 수정
		String updateSql =  """
				UPDATE board
				SET title=?,content=?,update_date = sysdate ,read_count=0 WHERE seq = ?				
				""";
		
				
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int resultRows =0;
		
		// 1. 게시글번호
		int boardNum = getBoardNo();
		
		try {
		pstmt = conn.prepareStatement(countSql);
		pstmt.setInt(1, boardNum);		
		rs = pstmt.executeQuery();	//select실행
		if (rs.next()) {
			resultRows = rs.getInt(1);		//count(*)값 가져오기				
			
			if (resultRows == 0) {
				System.out.println("수정할 게시글 번호가 없습니다.");
				return-1;
			}
		}
		}catch(SQLException se) {
			System.out.println("게시글 수정하는 도중 에러가 발생 -> " + se.getMessage());
	}
		
		// 2. 수정할 게시글 제목
		System.out.println("새로운 제목를 입력하시오: ");
		String newtitle = scanner.nextLine();
		
		// 3. 수정할 게시글 내용
		System.out.println("새로운 내용을 입력하시오: ");			
		String newcontent = scanner.nextLine();
		
		try {
			// 3. sql 실행
			pstmt = conn.prepareStatement(updateSql);
			pstmt.setString(1, newtitle);		
			pstmt.setString(2, newcontent);
			pstmt.setInt(3, boardNum);
			
			
			resultRows = pstmt.executeUpdate();	//executeUpdate로 insert, update, delete sql코드를 실행
			System.out.println("글이 성공적으로 수정되었습니다.");
			
		}catch(SQLException se) {
			System.out.println("게시글 수정하는 도중 에러가 발생 -> " + se.getMessage());
		} finally {
			DBManager.dbClose(conn, pstmt,null);
		}
		return resultRows;
			
	}
				
	
	/**
	 * 설명 : 게시글 상세조회
	 */
	
	public void selectOneBoard(){
		
		int boardNo = getBoardNo();
		// 1. 게시글의 상세 데이터를 받기 위해 Oracle DB접속준비 
		Connection conn = DBManager.getConnection();
		
		String countSql = "SELECT COUNT(*) FROM board WHERE seq = ?"; //sql2번 쓰기
		PreparedStatement pstmt2 = null;
		ResultSet rs = null;
		String selectSql = "SELECT seq, title, content, create_date, read_count FROM board WHERE seq = ? ORDER BY seq DESC";
		String updateSql = "UPDATE board SET read_count =? WHERE seq = ?";
		// 다른 방법
//		String updateSql = "UPDATE board SET read_count = NVL(read_count, 0) + 1 WHERE seq = ?";
		
		try {
//			// 3. sql2번 실행 하기 (데이터가 많을 경우 아래의 코드보다 잘 작동함)
			pstmt2 = conn.prepareStatement(countSql);
			pstmt2.setInt(1,boardNo);
			rs = pstmt2.executeQuery();	//select실행(count)
			
			if (rs.next()) {
				int rowCount = rs.getInt(1);	//count(*) 값 가져오기
				
				if (rowCount == 0) {
					System.out.println("상세조회할 게시글 번호가 없습니다.");
					return;
				}
			}
		
			// 게시판 상세조회
			pstmt2 = conn.prepareStatement(selectSql);
			pstmt2.setInt(1,boardNo);
			rs = pstmt2.executeQuery();	//select실행(count)
			
			int readcount = 0;
			int resultRows = 0;
			
			if (rs.next()) {		//sql실행한 데이터들의 1행을 가져옴(데이터가 있으면 true, 없으면 false)
				System.out.println("--------------------------------------------------");
				System.out.println("번호: " + rs.getString("seq"));
				System.out.println("제목: " + rs.getString("title"));
				System.out.println("내용: " + rs.getString("content"));
				System.out.println("작성일: " +rs.getString("create_date"));
				System.out.println("--------------------------------------------------");
				readcount = rs.getInt("read_count")+1;
			}
			pstmt2 = conn.prepareStatement(updateSql);
			pstmt2.setInt(1, readcount);		
			pstmt2.setInt(2, boardNo);
			resultRows = pstmt2.executeUpdate();
			
			
			
//			}else {
//				System.out.println("해당 번호를 찾을 수 없습니다.");
//				return;
//			}			
		
		}catch(SQLException se) {
			se.printStackTrace();
			System.out.println("게시글 상세조회 실행오류 -> " + se.getMessage());
		}finally {
			DBManager.dbClose(conn, pstmt2,rs);
		}
		
			
	}
	/**
	 * 설명 : 게시글 삭제
	 * 
	 */
	
	public void deleteBoard() {
		System.out.println("전체삭제(all) / 부분삭제(part)");
		String select_ap = scanner.nextLine();
		
		// 1. 게시글의 상세 데이터를 받기 위해 Oracle DB접속준비
		Connection conn = DBManager.getConnection();
		PreparedStatement pstmt2 = null;
		ResultSet rs = null;
		int resultRow = 0;
		
		try {
		if (select_ap.equals("all")) {
			System.out.println("정말 전체 게시글을 삭제하시겠습니까?(y/n)" );
			String confirmYN = scanner.nextLine(); 
			if (!confirmYN.equals("Y"))
				return;
			
			String deleteSql = "DELETE From board";
			pstmt2 = conn.prepareStatement(deleteSql);
			resultRow = pstmt2.executeUpdate();	//delete실행
			
				
		}else {
			
			int selectNum = getBoardNo();
			System.out.println("정말 " +selectNum + "번 게시글을 삭제하시겠습니까?(y/n)" );
			String confirmYN = scanner.nextLine();
			if (!confirmYN.equals("Y"))
				return;
			
			String deleteSql = "DELETE From board WHERE seq = ?";
			pstmt2 = conn.prepareStatement(deleteSql);
			pstmt2.setInt(1,selectNum);
			rs = pstmt2.executeQuery();
			
			if (rs.next()) {
				System.out.println(selectNum + "번이 삭제되었습니다.");
				
			}else {
				System.out.println("해당 번호를 찾을 수 없습니다.");
				return;
			}
		}
		}catch(SQLException se) {
			se.printStackTrace();
			System.out.println("게시글 삭제 실행오류 -> " + se.getMessage());
		}finally {
			DBManager.dbClose(conn, pstmt2,rs);
		}
		
	}
	/**
	 * 설명 : 콘솔에서 사용자의 키보드 입력받아 리턴
	 * @return 게시판 번호
	 */
	
	
	private int getBoardNo() {
		int boardNo = 0;
		while(true) {
			System.out.println("게시판 번호를 입력하세요. > ");
			try {
				boardNo = Integer.parseInt(scanner.nextLine());
				break;
			}catch(InputMismatchException | NumberFormatException e) {
				System.out.println("잘못된 값을 입력하셨습니다. 다시 입력해주세요");
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("알 수 없는 오류. ->" + e.getMessage());
			}
		}
		return boardNo;
	}
}