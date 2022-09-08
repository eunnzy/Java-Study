package p02.practice2;

public class GoodsUsingThis {

	public static void main(String[] args) {
		Goods goods = new Goods("사이다", 200, 30, 25);
		System.out.println("goods 주소 : " + System.identityHashCode(goods));
		System.out.println("goods의 판매 개수 : " + goods.getSold());
		
		Goods g2 = goods.me();
		System.out.println("g2 주소 : " + System.identityHashCode(g2));
		// goods와 g2의 주소는 똑같음.
		
		
		Goods goods2 = new Goods("콜라", 200, 20, 35);
		System.out.println("goods2 주소: " + System.identityHashCode(goods2));
		g2 = goods2.me();
		System.out.println("g2 주소: " + System.identityHashCode(g2));
		// goods2와 g2의 주소는 똑같음.
		
	}

}
