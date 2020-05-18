package object;

public class Dog extends Animal {
	//体重
	double weight;

	//コンストラクタ
	public Dog(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	};

	//走る
	public void run(){
		System.out.println(this.name + "は走った");
	}

	//眠る オーバーライド
	public void sleep() {
		System.out.print(this.name + "は");
		super.sleep();
	}
}
