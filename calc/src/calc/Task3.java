package calc;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		//標準入力
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();

		//合計
		int sum = num1 + num2 + num3;

		//平均（3で割った時）
		int average1 = sum / 3;

		//平均（3.0で割った時）
		double average2 = sum / 3.0;

		System.out.println("合計: " + sum);
		System.out.println("平均(3で割った時): " + average1);
		System.out.print("平均(3.0で割った時): " + average2);
 	}

}
