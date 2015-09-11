package com.island.timus.ihundrend;

import java.util.Scanner;

public class T1876_Centipedes_Morning {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int firstPartTime = 2 * b + 40;
		int secondPartTime = 2 * a + 39;

		System.out.println(firstPartTime > secondPartTime ? firstPartTime : secondPartTime);
	}
}
