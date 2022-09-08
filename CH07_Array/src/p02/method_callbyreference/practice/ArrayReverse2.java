package p02.method_callbyreference.practice;

public class ArrayReverse2 {

	public static void main(String[] args) {
		int[] list = {1, 2, 3, 4, 5};
		
		System.out.print("reverse 전 : ");
		for(int i=0; i<list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
		
		// stack에 있는 list의 값을 newList의 새로운 주소로 변경
		reverse(list);
		System.out.print("reverse 후 : ");
		for(int i=0; i<list.length; i++) {
			System.out.print(list[i] + " ");
		}
		
	}
	
	// return type : array return
	public static void reverse(int[] list) {
		int[] newList = new int[list.length];			// 매개변수로 받아온 list와 달리 새로운 메모리 주소 할당하여 배열 생성.(list와 주소가 다름)
		
		for(int i=0; i<list.length; i++) {
			newList[i] = list[list.length - 1 - i];
		}
		
//		list = newList;
		// newList에 있는 주소를 list에 넘겨줌. => 매개변수로 복사해온 list의 주소가 변경이 되는 것(주소만 변경되지, 값이 변경x)
		
		for(int i=0; i<list.length; i++) {
			list[i] = newList[i];
		}
	}

}
