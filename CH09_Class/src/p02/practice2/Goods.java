package p02.practice2;

/*
  	생성자 overloading : field 이름이 틀리더라도 signature가 동일하면 overloading 할 수 없음(중복 선언 불가능)
  	생성자는 return 타입이 없음.	
  	생성자 이름은 클래스 이름과 동일.
  	메소드는 return 타입이 있음.
  	
*/

public class Goods {
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	
/*
	// 오류 : Duplicate method Goods(int, int) in type Goods
	public Goods(int p, int nStock) {
		price = p;
		numberOfStock = nStock;
	}

	public Goods(int nStock, int p) {
		price = p;
		numberOfStock = nStock;
	}
*/
	public Goods(String n, int p, int nStock, int s) {
		this.name = n;
		this.price = p;
		this.numberOfStock = nStock;
		this.sold = s;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getNumberOfStock() {
		return numberOfStock;
	}

	public int getSold() {
		return sold;
	}
	
	public Goods me() {
		return this;		// heap memory에 있는 인스턴스 본인을 의미함.
	}
	
	
}
