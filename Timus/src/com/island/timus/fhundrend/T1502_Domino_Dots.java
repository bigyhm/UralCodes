package com.island.timus.fhundrend;

import java.util.Scanner;

public class T1502_Domino_Dots {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		System.out.println(n * (n + 1) * (n + 2) / 2);
	}
}
