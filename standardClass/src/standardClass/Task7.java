package standardClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Task7 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();

		SimpleDateFormat  sdf = new SimpleDateFormat("yyyy年MM月dd日");

		//現在日時
		System.out.println("現在日時: " + sdf.format(cal.getTime()));

		//1週間後
		cal.add(Calendar.DAY_OF_MONTH, 7);
		System.out.println("１週間後: " + sdf.format(cal.getTime()));

		//1年後
		cal.add(Calendar.YEAR, 1);
		cal.add(Calendar.DAY_OF_MONTH, -7);
		System.out.print("１年後  : " + sdf.format(cal.getTime()));

		//曜日
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
			case 1:
				System.out.println("(日)");
				break;

			case 2:
				System.out.println("(月)");
				break;

			case 3:
				System.out.println("(火)");
				break;

			case 4:
				System.out.println("(水)");
				break;

			case 5:
				System.out.println("(木)");
				break;

			case 6:
				System.out.println("(金)");
				break;

			case 7:
				System.out.println("(土)");
				break;

		};

	}

}
