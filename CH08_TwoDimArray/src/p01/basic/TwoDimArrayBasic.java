package p01.basic;

public class TwoDimArrayBasic {

	public static void main(String[] args) {
		String[][] gPerson = {
								{"1", "박철호", "서울" , "회사원" },
								{"2", "김의실", "경기" , "공무원" },
								{"3", "오수철", "수원" , "연예인" },
								{"4", "김길동", "모름" }
							};
		
		String[] onePerson = new String[4];
		onePerson = gPerson[2];
		
		
		for(int i=0; i<onePerson.length; i++) {
			System.out.println("onePerson[" + i + "] : " + onePerson[i]);
		}
		System.out.println();
		
		// gPerson.length = 행의 길이 / gPerson[i].length = 열의 길이
		for(int i=0; i<gPerson.length; i++) {
			for(int j=0; j<gPerson[i].length; j++) {
				System.out.println("gPerson[" + i + "][" + j + "] : " + gPerson[i][j]);
			}
		}
		System.out.println();
		
		System.out.println("gPerson[0][0] : " + gPerson[0][0]);
		System.out.println("gPerson[0][1] : " + gPerson[0][1]);
		System.out.println("gPerson[0][2] : " + gPerson[0][2]);
		System.out.println("gPerson[0][3] : " + gPerson[0][3]);
		
		System.out.println("gPerson[0][0] : " + gPerson[1][0]);
		System.out.println("gPerson[0][1] : " + gPerson[1][1]);
		System.out.println("gPerson[0][2] : " + gPerson[1][2]);
		System.out.println("gPerson[0][3] : " + gPerson[1][3]);
		
		System.out.println("gPerson[0][0] : " + gPerson[2][0]);
		System.out.println("gPerson[0][1] : " + gPerson[2][1]);
		System.out.println("gPerson[0][2] : " + gPerson[2][2]);
		System.out.println("gPerson[0][3] : " + gPerson[2][3]);
		
		
	}

}
