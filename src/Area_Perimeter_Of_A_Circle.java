

import java.util.Scanner;

public class Area_Perimeter_Of_A_Circle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Radius Of Thr Circle : ");
		int r = sc.nextInt();

		double pi = 3.14;
		double area = pi * (r * r);
		double perimeter = 2 * (pi * r);

		System.out.println("Areaf Of Circle Is : " + area);
		System.out.println("The Perimeter Of The Circle Is : " + perimeter);

	}

}
