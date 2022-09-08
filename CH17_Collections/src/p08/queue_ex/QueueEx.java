package p08.queue_ex;

import java.util.*;

public class QueueEx {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "홍두께"));
		
		// poll() -> 객체를 큐에서 제거 함.
//		while(!messageQueue.isEmpty()) {
//			Message message = messageQueue.poll();
//			switch(message.command) {
//			case "sendMail" :
//				System.out.println(message.to + "님에게 메일을 보냅니다.");
//				break;
//			case "sendSMS" :
//				System.out.println(message.to + "님에게 SMS을 보냅니다.");
//				break;
//			case "sendKakaotalk" :
//				System.out.println(message.to + "님에게 kakaotalk을 보냅니다.");
//				break;
//			}
//		}
		
		System.out.println();
		
		// 향상된 for문 사용 (단순 출력을 위하면 향상된 for문을 사용)
		for(Message message : messageQueue) {
			switch(message.command) {
			case "sendMail" :
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS" :
				System.out.println(message.to + "님에게 SMS을 보냅니다.");
				break;
			case "sendKakaotalk" :
				System.out.println(message.to + "님에게 kakaotalk을 보냅니다.");
				break;
			}
		}
		
	}

}
