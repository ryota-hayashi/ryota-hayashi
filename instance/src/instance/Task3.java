package instance;

public class Task3 {

	public static void main(String[] args) {

		//インスタンスの生成
		Person hayashi = new Person();

		//生成したインスタンスのフィールドに値を設定
		hayashi.name = "林 亮太";
		hayashi.age = 27;

		//メソッドの呼び出し
		hayashi.myProfile();

	}

}