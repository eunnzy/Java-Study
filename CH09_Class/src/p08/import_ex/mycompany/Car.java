package p08.import_ex.mycompany;

import p08.import_ex.hankook.SnowTire;
import p08.import_ex.hankook.Tire;
import p08.import_ex.hyundai.Engine;
import p08.import_ex.kumho.BigWidthTire;

/*
  	1. 다른 package에 있는 class를 사용하려면 import 키워드를 사용해야 함.
  	2. class 이름은 package이름과 결합되어 있음.
  		- 같은 class 이름이라도 package가 틀리면 다른 class로 인식됨.
*/
public class Car {
	
	public static void main(String[] args) {
		Engine engine = new Engine();
		SnowTire snowTire = new SnowTire();
		BigWidthTire bigTire = new BigWidthTire();
		Tire hankookTire = new Tire();
		p08.import_ex.kumho.Tire kumhoTire = new p08.import_ex.kumho.Tire();
		
	}
}
