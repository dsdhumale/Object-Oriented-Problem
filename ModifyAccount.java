package com.Bridgelabz.Day11;

import java.util.Scanner;

public class ModifyAccount {
	static float accountBalance = 25000.00f;

	static void accountcheck() {
		System.out.println(" Ur account balance is : " + accountBalance + " Rupees ");
	}

	static void accounttest() {
		int i = 0;
		while (i < 3) {
			System.out.println("Please enter amount u want to withdraw");
			Scanner input = new Scanner(System.in);
			float debit = input.nextFloat();
			if (debit <= accountBalance) {
				accountBalance -= debit;
				System.out.println(" Ur account balance is : " + accountBalance + " Rupees ");
				i++;
			} else {
				System.out.println(" Debit amount exceeded account balance, Please enter valid amount ");
			}

		}
		System.out.println(" Daily transction exceed ");
	}

	public static void main(String[] args) {
		accountcheck();
		accounttest();

	}
}
