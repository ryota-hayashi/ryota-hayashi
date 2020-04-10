package calc;

public class Task2 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 12;
		int num3 = 13;

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
