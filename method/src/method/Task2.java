package method;

public class Task2 {

	public static void main(String[] args) {

		System.out.println("三角形の面積");
		double returnArea = getTriangleArea(22.25, 15.0);
		System.out.println(returnArea);

	}

	public static double getTriangleArea(double bottom, double tall) {

		double area = Math.round(bottom * tall / 2);
		return area;

	}


}
