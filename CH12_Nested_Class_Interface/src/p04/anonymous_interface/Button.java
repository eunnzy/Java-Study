package p04.anonymous_interface;

public class Button {
	OnClickListener listener;
	

	/*
	 	promotion 발생(CallListener, MessageListener의 자식 인스턴스를 부모 역할을 하는 
	 				  OnClickListener interface로 자동형변환)
	 */
	public void setListener(OnClickListener listener) {		
		this.listener = listener;
	}

	void touch() {
		listener.onClick();		// polymorphism 발생.
	}
	
	interface OnClickListener {
		void onClick();		// abstract method
	}
}
