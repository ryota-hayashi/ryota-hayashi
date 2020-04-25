package vrietyArray;

import java.util.ArrayList;

public class Task1 {

	public static void main(String[] args) {

		ArrayList<String> localNames = new ArrayList<>();

		localNames.add("北海道");
		localNames.add("東北");
		localNames.add("関東");
		localNames.add("中部");
		localNames.add("近畿");
		localNames.add("中国");
		localNames.add("九州");

		for(String name : localNames) {

			System.out.println(name);

		}

	}

}
