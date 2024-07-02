package sec01;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0 ;
		int totalScore = 0;
		
		System.out.println("엔트리 수 : " + map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		//for문을 사용
		for(Map.Entry<String, Integer> entry : entrySet){
			totalScore += entry.getValue();		//합계점수
			if (maxScore < entry.getValue()) {
				maxScore = entry.getValue();	//최고점수
				name = entry.getKey();			//최고점수를 받은 아이디
			}
			
		}
		/* while문을 이용한 식
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			
			totalScore += entry.getValue();		//합계점수
			if (maxScore < entry.getValue()) {
				maxScore = entry.getValue();	//최고점수
				name = entry.getKey();			//최고점수를 받은 아이디
			
			}
		}*/
		double avg = (double)totalScore/map.size();
		System.out.println("평균점수: " + avg );
		System.out.println("최고점수: " + maxScore );
		System.out.println("최고점수를 받은 아이디: " + name );
	}

}
