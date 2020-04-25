package array;

import java.util.Random;

public class Task3 {

	public static void main(String[] args) {

		//配列定義
		int[] array = new int[6];

		//最大
		int max = 0;

		//最小;
		int min = 0;

		//ループ
		for(int i = 0; i < array.length; i++) {

			int r = new Random().nextInt(10);

			array[i] = r;

		}


		System.out.print("[");

		//配列の表示
		for(int i = 0; i < array.length; i++) {

			System.out.print(array[i]);

			//カンマの表示
			if(i < array.length -1) {

				System.out.print(",");

			}

			if(i == 0) {
				max = array[i];
				min = array[i];
			}

			if(max < array[i]) {
				max = array[i];
			}

			if(min > array[i]) {
				min = array[i];
			}

		}

		//改行
		System.out.println("]");

		//最大値の表示
		System.out.println("最大値: " + max);

		//最小値の表示
		System.out.print("最小値: " + min);


	}

}
