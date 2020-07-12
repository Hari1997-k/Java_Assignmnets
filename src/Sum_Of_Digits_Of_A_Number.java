/*
OUTPUT :

Enter The Number : 
25
The Sum Of Digits Of 25 Is : 7
*/

import java.util.Scanner;

public class Sum_Of_Digits_Of_A_Number {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		int mod = 0;
		String snum = Integer.toString(num);
		for (int i = 0; i < snum.length(); i++) {
			mod = temp % 10;
			sum = sum + mod;
			temp = temp / 10;

		}
		System.out.println("The Sum Of Digits Of " + num + " Is : " + sum);

	}
}