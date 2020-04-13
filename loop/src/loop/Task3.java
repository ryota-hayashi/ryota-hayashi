package loop;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		System.out.print("数字を入力してください: ");

		//標準入力
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		sc.close();

		//桁数用の変数
		int keta = 0;

		//ループ文
		while(num > 0) {

			keta++;
			num = num / 10;

		}

		System.out.print("桁数: " + keta);

	}

}
