package com.island.timus.khundrend;

import java.util.Scanner;

public class T2001_Mathematicians_Berries {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a1 = in.nextInt();
		int b1 = in.nextInt();
		int a2 = in.nextInt();
		int b2 = in.nextInt();
		int a3 = in.nextInt();
		int b3 = in.nextInt();

		System.out.print(a1 - a3);
		System.out.print(" ");
		System.out.println(b1 - b2);

	}
}
