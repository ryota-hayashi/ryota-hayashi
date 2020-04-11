package branch;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		System.out.println("10以上の数値を入力してください");

		//標準入力
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		if(num >= 10) {
			System.out.print("値: " + num);
		}
		else {
			System.out.print("値: " + num * 10);
		}
	}

}
