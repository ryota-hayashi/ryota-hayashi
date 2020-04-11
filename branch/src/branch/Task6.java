package branch;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		System.out.println("1から5までの数字を入力してください");

		//標準入力
		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		sc.close();

		String numRoma;

		switch(numA) {

			case 1:
				numRoma = "Ⅰ";
				break;

			case 2:
				numRoma = "Ⅱ";
				break;

			case 3:
				numRoma = "Ⅲ";
				break;

			case 4:
				numRoma = "Ⅳ";
				break;

			case 5:
				numRoma = "Ⅴ";
				break;

			default:
				numRoma = "unknown";
				break;
		}

		System.out.print(numA + " -> " + numRoma);
	}

}
