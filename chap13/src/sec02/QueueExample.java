package sec02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		//Queue는 인터페이스
		Queue<Message> messageQueue = new LinkedList<>();
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKaKaotalk", "홍두께"));
		
		while(!messageQueue.isEmpty()) {		//큐 안의 객체들이 비어있을 때까지
			Message message = messageQueue.poll();	//큐 안에 제일 먼저 들어간 객체를 가져옴
			
			switch(message.commend) {
			case "sendMail":		//1번째 실행
				System.out.println(message.to + "님에게 메일을 보낸다");
				break;
			case "sendKaKaotalk":		//3번째 실행
				System.out.println(message.to + "님에게 카톡을 보낸다");

				break;
			case "sendSMS":			//2번째 실행
				System.out.println(message.to + "님에게 sms을 보낸다");

				break;
				
			}
		}


	}

}
