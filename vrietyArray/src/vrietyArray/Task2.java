package vrietyArray;

import java.util.ArrayList;

public class Task2 {

	public static void main(String[] args) {

		//配列定義
		int[] array = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60};

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

		//奇数の表示
		System.out.println("奇数: " + oddNumbers);

		//偶数の表示
		System.out.println("偶数: " + evenNumbers);



		//以下ループを使用した表示

		//奇数の表示
		/*System.out.print("奇数: [");

		for(int i = 0; i < oddNumbers.size(); i++) {

			System.out.print(oddNumbers.get(i));

			if(i < oddNumbers.size() - 1) {

				System.out.print(",");

			}

		}

		System.out.println("]");

		//偶数の表示
		System.out.print("偶数: [");

		for(int i = 0; i < evenNumbers.size(); i++) {

			System.out.print(evenNumbers.get(i));

			if(i < evenNumbers.size() - 1) {

				System.out.print(",");

			}

		}

		System.out.println("]");*/

	}

}
