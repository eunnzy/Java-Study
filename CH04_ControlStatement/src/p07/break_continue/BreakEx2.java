package p07.break_continue;

import java.util.Scanner;

// -1을 입력 받으면 while문을 빠져 나오는 프로그램
public class BreakEx2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 0; 
		
		while(true) {
			if(in.nextInt()==-1) 
				break;
			num++;
		}
		System.out.println("입력된 숫자 개수는 " + num);
	}

}
