package standardClass;

public class Task3 {

	public static void main(String[] args) {

		String str = "ABCDEFG";
		System.out.println("文字列: " + str);

		String str2 = "";

		for(int i = str.length() - 1; i >= 0; i--) {

			str2 += str.charAt(i);

		}

		System.out.println(str2 + ": 列字文");

	}

}
