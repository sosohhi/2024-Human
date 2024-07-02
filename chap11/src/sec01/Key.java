package sec01;

public class Key {
	
	//필드
		public int number;
		
		//생성자
		public Key(int number) {
			//super();가 생략되어있음(Object의 기본 생성자)
			this.number = number;	
		}
		
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Key) {		//ClassCastException방지
				Key key = (Key)obj;	//강제형변환
				
				if (this.number == key.number) 
					return true;
									
			}
			
			return false;
		}
		@Override
		public int hashCode() { // 주소값이 hashcode값이 아니라 number가 hashcode가 되도록 재정의
			return number;
		}

	
}
