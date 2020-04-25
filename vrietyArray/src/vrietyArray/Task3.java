package vrietyArray;

import java.util.HashMap;

public class Task3 {

	public static void main(String[] args) {

		HashMap<String, Integer> fruitsNum = new HashMap<>();

		fruitsNum.put("りんご", 130);
		fruitsNum.put("みかん", 120);
		fruitsNum.put("バナナ", 98);
		fruitsNum.put("メロン", 6000);


		for(HashMap.Entry<String, Integer> fruitsMoney : fruitsNum.entrySet()) {

			System.out.print(fruitsMoney.getKey());
			System.out.print(":");
			System.out.print(fruitsMoney.getValue());
			System.out.println("円");
		}

	}

}
