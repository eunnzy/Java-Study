package q01.quiz04_Quiz08_5;

public class ShopService {
	private static ShopService shopService = new ShopService();
	
	public ShopService() {
		
	}
	
	public static ShopService getInstance() {
		return shopService;
	}

}
