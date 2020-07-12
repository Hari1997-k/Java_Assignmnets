package Pattern_Programs;

/*	PATTER - 3 :	
							7654321
							654321
							54321
							4321
							321
							21
							1

			*/

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The NOOfRows :");
		int rows = sc.nextInt();
		int rowcount = rows;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
			}
			for (int k = rowcount; k > 0; k--) {
				System.out.print(k);
			}
			System.out.println();
			rowcount--;
		}

	}

}
