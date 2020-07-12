package Pattern_Programs;

/*  PATTERN -4 :		
  					1234567
					123456
					12345
					1234
					123
					12
					1
					12
					123
					1234
					12345
					123456 
					1234567 
						
 */

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The No Of Rows  :");
		int size = sc.nextInt();

		for (int i = size; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		for (int i = 2; i <= size; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
