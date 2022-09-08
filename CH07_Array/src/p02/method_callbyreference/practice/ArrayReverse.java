package p02.method_callbyreference.practice;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] list = {1, 2, 3, 4, 5};
		
		System.out.print("reverse 전 : ");
		for(int i=0; i<list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
		
		// stack에 있는 list의 값을 newList의 새로운 주소로 변경
		list = reverse(list);

		System.out.print("reverse 후 : ");
		for(int i=0; i<list.length; i++) {
			System.out.print(list[i] + " ");
		}
		
	}
	
	// return type : array return
	public static int[] reverse(int[] list) {
		int[] newList = new int[list.length];
		
		for(int i=0; i<list.length; i++) {
			newList[i] = list[list.length - 1 - i];
		}
		
		return newList;
	}

}
