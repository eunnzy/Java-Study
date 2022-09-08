package p07.stack_ex;

import java.util.*;

public class StackEx {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		
//		while(!coinBox.isEmpty()) {
//			Coin coin = coinBox.pop();		// pop() : 객체를 스택에서 제거
//			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
//		}
		
		System.out.println();
		
		for(Coin coin : coinBox) {
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
		
		// 출력결과 -> pop 때문에 한번밖에 안나옴. 단순 출력을 위해서는 향상된 for문을 사용
		
	}

}
