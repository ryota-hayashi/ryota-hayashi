package branch;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		System.out.println("数字を入力してください");

		//標準入力
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		if(num >= 10) {
			System.out.print("値: " + num);
		}
		else {
			System.out.print("値: 0" + num);
		}
	}

}
