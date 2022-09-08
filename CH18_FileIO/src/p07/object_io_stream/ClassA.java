package p07.object_io_stream;

import java.io.Serializable;

/*
	Class로 선언된 인스턴스(new로 힙메모리에 생성)는 기본적으로 file에 read/write가 가능하고, network의 data 송수신이 가능.
	- field만 가능 (생성자, 메소드는 제외)
	- field에서도 static은 제외
	- transient는 Serializable interface를 implements한 class에서 사용
	  => file의 write하거나 network에서 data 송수신 대상에서 제외할 목적으로 쓰임.
	     ex) password를 관리하는 field인 경우
	- 힙메모리에 있는 인스턴스만 가능 (있다고 하더라도 제외 가능)

	file의 read/write 또는 network상의 데이터 송수신용으로 사용할 class를 Serializable interface로 선언한 이유
	1. ObjectOutputStream을 사용하여 write할 때 byte단위로 직렬화(serialization) =>file에 write할 때 encoding하는 것도 동일.
	2. ObjectInputStream을 사용하여 read할 때 byte단위로 되어 있는 것을 원래의 class 인스턴스로 변환(decoding)
	   역직렬화 수행(reverse serialization)
	3. 송수신할 클래스를 변경하는 것을 막기 위해서 또는 변경되지 않았다는 것을 guarantee하기 위해서 Serializable로 선언
	4. serialVersionUID = 4641626255760256711
	   => UID는 class가 변경될 때마다 (field 등) 새로 생성되는 난수
	5. 만약 class에서 serialVersionUID를 명시적으로 값을 부여하면, class에서 field가 추가되는 등의 변화가 있더라도  
	   file R/W나 데이터 송수신할 때 error 발생하지 않음..
*/

public class ClassA implements Serializable{
	static final long serialVersionUID = 1;	// 명시적으로 선언하면 field 변경이 가능.
	int field1;
	ClassB field2 = new ClassB();
	static int field3;		// static으로 선언된 field는 
	transient int field4;
	int field5;
}
