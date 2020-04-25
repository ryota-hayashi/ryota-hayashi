package vrietyArray;

import java.util.ArrayList;
import java.util.HashMap;

public class Task4 {


	public static void main(String[] args) {

		//配列定義
		int[] array = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60, 29, 5, 46, 74, 14, 193, 215, 83};

		//奇数ArrayList定義
		ArrayList<Integer> oddNumbers = new ArrayList<>();

		//偶数ArrayList定義
		ArrayList<Integer> evenNumbers = new ArrayList<>();

		for(int arrayAll : array) {

			if(arrayAll % 2 == 0) {

				evenNumbers.add(arrayAll);

			}else {

				oddNumbers.add(arrayAll);

			}

		}

		//HashMap定義
		HashMap<String, ArrayList<Integer>> allNumbers = new HashMap<>();

		allNumbers.put("偶数", evenNumbers);
		allNumbers.put("奇数", oddNumbers);

		System.out.println(allNumbers.entrySet());

	}


}
