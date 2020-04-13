package loop;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		System.out.print("数字を入力してください: ");

		//標準入力
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		//合計用の変数定義
		int sum = 0;

		//ループ文
		for(int i=1; i<num; i++) {
			System.out.print(i + " + ");
			sum += i;
		}

		//numを合計に足して表示
		sum += num;
		System.out.print(num + " = " + sum);
	}

}
