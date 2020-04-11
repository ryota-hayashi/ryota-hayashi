package branch;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		//標準入力
		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		int numB = sc.nextInt();
		sc.close();

		//numAが0以下の場合
		if(numA <= 0) {
			System.out.print("正の整数を入力してください");

		//numBが0以下の場合
		}else if(numB <= 0) {
			System.out.print("正の整数を入力してください");

		//numBがnumAを割り切れる場合
		}else if(numA % numB == 0) {
			System.out.print("numBはnumAの約数です");

		//numBがnumAを割り切れない場合
		}else if(numA % numB != 0) {
			System.out.print("numBはnumAの約数ではありません");
		}

	}

}
