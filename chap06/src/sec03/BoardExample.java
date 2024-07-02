package sec03;

public class BoardExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Board board1 = new Board("안녕","안녀엉");
		System.out.println(board1.title);
		System.out.println(board1.content);
		System.out.println();
		
		Board board2 = new Board("안녕","안녀엉","친구");
		System.out.println(board2.title);
		System.out.println(board2.content);
		System.out.println(board2.writer);
		System.out.println();
		
		Board board3 = new Board("안녕","안녀엉","친구","5.27");
		System.out.println(board3.title);
		System.out.println(board3.content);
		System.out.println(board3.writer);
		System.out.println(board3.date);
		System.out.println();
		
		Board board4 = new Board("안녕","안녀엉","친구","5.27",15);
		System.out.println(board4.title);
		System.out.println(board4.content);
		System.out.println(board4.writer);
		System.out.println(board4.date);
		System.out.println(board4.hitcount);
		System.out.println();

	}

}
