package p04.anonymous_interface;

public class Window {
	Button btn1 = new Button();
	Button btn2 = new Button();
	
//	부모인 listener interface type에 자식 익명 객체를 넣음.(promotion발생)
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	public Window() {
		btn1.setListener(listener);
		// setListener에 자식 익명객체를 넘긴 것임. (promotion 발생)
		btn2.setListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다.");
			}
		});
	}
}
