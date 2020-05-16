package object;

public class Person {
	//名前
	private String name;
	//年齢
	private int age;
	//お財布
	static int wallet;

	//getterメソッド
	public String getName(){
		return this.name;
	}

	//setterメソッド
	public void setName(String name) {
		this.name = name;
	}

	//getterメソッド
	public int getAge(){
		return this.age;
	}

	//setterメソッド
	public void setAge(int age) {
		this.age = age;
	}

	//コンストラクタ 引数なし
	Person(){
		System.out.println("名前と年齢が設定されていません。");
	}

	//コンストラクタ
	Person(String name, int age, int wallet){
		this.name = name;
		this.age = age;
		Person.wallet = wallet;
	}

	public void myProfile() {
		System.out.println("私の名前は" + this.name + "です。");
		System.out.println("私の年齢は" + this.age + "です。");
		System.out.println("よろしくお願いします。");
	}
}