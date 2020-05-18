package object;

public class Main {

	public static void main(String[] args) {
		System.out.println("インスタンスを生成していない状態");
		System.out.println(Person.wallet);

		//インスタンスを2つ生成
		Person hoge01 = new Person(1000);
		Person hoge02 = new Person(2000);

		System.out.println("インスタンスhoge01でwalletにアクセス");
		System.out.println(hoge01.wallet);
		System.out.println("インスタンスhoge02でwalletにアクセス");
		System.out.println(hoge02.wallet);
		System.out.println("クラスPersonでwalletにアクセス");
		System.out.println(Person.wallet);

		//課題5
		//インスタンスの作成
		Animal ani = new Animal();
		Dog dog = new Dog("ポチ", 5, 12.3);

		//子クラス変数表示
		System.out.println("名前:" + dog.name);
		System.out.println("年齢:" + dog.age + "歳");
		System.out.println("体重:" + dog.weight + "kg");

		//走る 子クラスメソッド呼出
		dog.run();

		//眠る
		ani.sleep();
		dog.sleep();
	}
}
