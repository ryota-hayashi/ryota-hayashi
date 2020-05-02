package standardClass;

public class Task5 {

	public static void main(String[] args) {

		//文字列定義
		String text = "cat_mouse_mouse_cat_cat";

		//文字列をハイフン区切りで配列に代入
		String[] strAray = text.split("_");

		//検索する文字列
		String str1 = "cat";
		String str2 = "mouse";

		//カウント用の変数定義
		int str1Cnt = 0;
		int str2Cnt = 0;

		//ループでカウント
		for(String str: strAray) {

			if(str.equals(str1)) {

				str1Cnt++;

			}else if(str.equals(str2)) {

				str2Cnt++;

			}

		}

		//結果表示
		if(str1Cnt > str2Cnt) {

			System.out.println(str1 + "の方が多い");

		}else if(str2Cnt > str1Cnt) {

			System.out.println(str2 + "の方が多い");

		}else {

			System.out.println(str1 + "と" + str2 + "は同じ数である。");

		}

	}

}
