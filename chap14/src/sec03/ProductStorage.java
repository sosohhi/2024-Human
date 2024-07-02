package sec03;

import java.util.*;
// 상품을 관리하는 메인 클래스
public class ProductStorage {
	private List<Product> listproduct = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	private int counter = 0;
	
	
	//메뉴를 보여주는 메소드
	public void showMenu() {
		//메뉴를 보여주는 메소드
		while(true) {
			System.out.println("-----------------------------");
			System.out.println("1.등록  | 2.목록  | 3.종료  ");
			System.out.println("-----------------------------");
			System.out.println("선택:  ");
			
			//키보드를 입력받는 코드
			String selectNo = scanner.nextLine();
			
			switch (selectNo){
				case "1":
					registerProduct();
					break;		// 등록
				case "2":		//조회
					showProduct();
					break;
				case "3":		//종료
					return;						
			}
		}
		}
			//상품 등록 실행
			public void registerProduct() {
			try {
				
				Product product = new Product();
				product.setPno(++counter);
			
				System.out.print("상품명: ");
				product.setName(scanner.nextLine());
				
				System.out.print("가격: ");
				product.setPrice(Integer.parseInt(scanner.nextLine()));
			
				
				System.out.print("재고: ");
				product.setStock(Integer.parseInt(scanner.nextLine()));
				
				listproduct.add(product);
			}catch (Exception e) {
				System.out.println("등록 에러: " + e.getMessage());
			}
	}
			// 상품리스트 조회 실행
			public void showProduct() {
				for (Product p : listproduct) {
					System.out.println(
							p.getPno() + "\t" + 
							p.getName() + "\t" +
							p.getPrice() + "\t" +
							p.getStock()
				);
				}
				
		
			
	}
}
		
	
	




