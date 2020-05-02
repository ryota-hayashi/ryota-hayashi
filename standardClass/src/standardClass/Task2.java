package standardClass;

public class Task2 {

	public static void main(String[] args) {

		String str = "Java Programming Training";

		System.out.println(str.substring(str.indexOf("Training")));
		System.out.println(str.substring(0, str.indexOf("Training") - 1));

	}

}
