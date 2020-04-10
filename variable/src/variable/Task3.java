package variable;

public class Task3 {

	public static void main(String[] args) {
		int intNum = 219;
		long long_intNum = (long)intNum;

		double doubleNum = 364.2;
		float float_doubleNum = (float)doubleNum;

		long longNum = 123456L;
		double double_longNum = (double)longNum;

		System.out.println("変換前");
		System.out.println(intNum);
		System.out.println(doubleNum);
		System.out.println(longNum);

		System.out.println("変換後");
		System.out.println(long_intNum);
		System.out.println(float_doubleNum);
		System.out.print(double_longNum);
	}

}
