package loop;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		System.out.print("正の整数を入力してください: ");

		//標準入力
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		System.out.print(num + "の約数: ");

		for(int i=1; i<num; i++) {

			if(num % i == 0) {

				System.out.print(i + ",");

			}
		}

		System.out.print(num);;

	}

}
