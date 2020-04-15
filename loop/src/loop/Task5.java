package loop;

public class Task5 {

	public static void main(String[] args) {

		//ループ１
		for(int i = 1; i < 10; i++) {

			//ループ２
			for(int j = 1; j < 10; j++) {

				//１桁の場合
				if((i * j / 10) < 1) {

					System.out.print(" " + i * j + " ");

				//１桁以外の場合
				}else {

					System.out.print(i*j + " ");

				}

			}
			//改行
			System.out.println();

		}

	}

}
