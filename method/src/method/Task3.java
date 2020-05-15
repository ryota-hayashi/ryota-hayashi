package method;

public class Task3 {

	public static void main(String[] args) {

		System.out.println(add("文字列1", "文字列2"));
		System.out.println(add(3, 5));
		System.out.println(add(3.5, 5.5));

	}

	//引数が文字列のみ
	public static String add(String str1, String str2) {

		System.out.println("--①文字列だけの場合---");
		return str1 + str2;

	}

	//引数が整数のみ
	public static int add(int num1, int num2) {

		System.out.println("---②整数だけの場合----");
		return num1 + num2;

	}

	//引数が小数のみ
	public static double add(double numDouble1, double numDouble2) {

		System.out.println("---③小数だけの場合----");
		return numDouble1 + numDouble2;

	}

}
