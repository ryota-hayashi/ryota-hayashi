package branch;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		//標準入力
		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		int numB = sc.nextInt();
		int numC = sc.nextInt();
		sc.close();

		//numAを変数maxに代入
		int max;
		max = numA;

		//numBが変数maxより大きい場合変数maxに代入
		if(max < numB) {
			max = numB;
		}

		//numCが変数maxより大きい場合変数maxに代入
		if(max < numC) {
			max = numC;
		}

		System.out.print("最大値: " + max);
	}

}
