package array;

public class Task1 {

	public static void main(String[] args) {

		//配列定義
		int[] array = {4,9,19,5,8,21,42,64,73,18,2};

		System.out.print("配列: [");

		//配列の表示
		for(int i = 0; i < array.length; i++) {

			System.out.print(array[i]);

			if(i < array.length -1) {
				System.out.print(",");

			}else {
				System.out.println("]");
			}

		}

		int sum = 0;

		//合計の表示
		for(int arraySum : array) {

			sum += arraySum;

		}

		System.out.print("合計: " + sum);

	}

}
