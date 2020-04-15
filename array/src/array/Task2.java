package array;

public class Task2 {

	public static void main(String[] args) {
		//配列定義
		int[] array = new int[7];

		//順表示
		for(int i = 7; i > 0; i--) {

			array[i - 1] = i;

			System.out.print(array[i - 1]);


			//カンマ表示
			if(i > 1) {
				System.out.print(",");


			//改行
			}else {

				System.out.println();

			}
		}
		//逆順表示
		for(int i = 0; i < 7; i++) {

			System.out.print(array[i]);

			//カンマ表示
			if(i < 6 ) {
				System.out.print(",");
			};
		}
	}

}
