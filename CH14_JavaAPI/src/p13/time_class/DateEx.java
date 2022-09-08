package p13.time_class;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date date = new Date();

		String strNow = date.toString();
		System.out.println(strNow);
		System.out.println(date);
		
//		yyyy : year 4자리로 출력, MM : month 2자리, dd: day 2자리, hh : hour 2자리, mm : minute 2자리, ss : second 2자리
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(date);
		System.out.println(strNow2);
		
		
	}

}
