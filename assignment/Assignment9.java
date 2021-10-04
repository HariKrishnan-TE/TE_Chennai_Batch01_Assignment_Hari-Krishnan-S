package com.te.AssignmentQuestions;

import java.util.Scanner;

public class Assignment9 {
	public static int fact(int a) {
		int fact=1;
		for (int i = 1; i <=a; i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=ref.nextInt();
		int result= fact(num);
		System.out.println(result);

	}

}
