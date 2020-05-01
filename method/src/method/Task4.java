package method;

public class Task4 {

	public static void main(String[] args) {

		//配列1定義
		String [] array1 = {"a", "b", "c"};

		//配列2定義
		String [] array2 = {"a", null, "c"};

		System.out.println(nullCheck(array1));
		System.out.println(nullCheck(array2));

	}

	public static boolean nullCheck(String [] array) {

		for(String i: array) {

			if(i == null) {

				System.out.println("---配列にnullがある場合---");
				return true;

			}

		}

		System.out.println("---配列にnullがない場合---");
		return false;

	}

}
