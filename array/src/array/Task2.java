package array;

public class Task2 {

	public static void main(String[] args) {
		//配列定義
		int[] array = new int[7];

		//順表示
		for(int i = array.length; i > 0; i--) {

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
		for(int i = 0; i < array.length; i++) {

			System.out.print(array[i]);

			//カンマ表示
			if(i < array.length - 1) {
				System.out.print(",");
			};
		}
	}

}
