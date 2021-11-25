package com.technoelevate.myprogram;

import java.util.Scanner;

public class ScannerClass {
	public static void sort() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] x = new int[size];
		System.out.println("please enter the values");
		for (int i = 0; i < size; i++) {
			x[i] = sc.nextInt();

		}

		for (int i = 0; i < size; i++) {
			System.out.println(x[i]);
		}
		boolean flag = true;

		while (flag) {
			flag = false;
			int temp = 0;
			for (int i = 0; i < size; i++) {
				if (x[i] < x[i + 1]) {
					temp = x[i];
					x[i] = x[i + 1];
					x[i + 1] = temp;
					flag = true;
				}
			}
		}
	}

	public static void main(String[] args) {
		sort();
	}
}
