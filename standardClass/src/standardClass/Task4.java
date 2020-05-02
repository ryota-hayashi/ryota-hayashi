package standardClass;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		//変数定義
		String str = "ABCDGOPQRSYZ";

		//標準入力
		System.out.print("探したい文字: ");
		Scanner sc = new Scanner(System.in);
		String strInput = sc.next();
		sc.close();

		//入力文字列チェック
		if(str.indexOf(strInput) >= 0){

			System.out.println(str + "は" + strInput + "を含む");

		}else {

			System.out.println(str + "は" + strInput + "を含まない");

		}

	}

}
