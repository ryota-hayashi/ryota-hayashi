package branch;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		//標準入力
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		//0より大きい場合
		if(0 < num) {
			System.out.print("入力された数字は正の数です。");

		//0より小さい場合
		}else if(num < 0) {
			System.out.print("入力された数字は負の数です。");

		//0の場合
		}else if(num == 0) {
			System.out.print("入力された数字は0です。");
		}
	}

}
