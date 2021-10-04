package com.te.AssignmentQuestions;

import java.util.Scanner;

public class TestAccount extends ClassAccount {

	public static void main(String[] args) {
		System.out.println(" Welcome to HDFC Bank");
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter amount to be deposit : ");
		long depositamt = obj.nextLong();
		System.out.println("Enter amount to be withdrawn : ");
		long withdrawamt = obj.nextLong();
		obj.close();
		TestAccount ref = new TestAccount();

		System.out.println("Previous Balance : " + ref.getBalance());
		ref.deposite(depositamt);
		ref.withDraw(withdrawamt);
	}

}
