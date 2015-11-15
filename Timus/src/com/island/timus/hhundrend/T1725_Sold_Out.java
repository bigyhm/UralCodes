package com.island.timus.hhundrend;

import java.util.Scanner;

public class T1725_Sold_Out {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sitsCount = in.nextInt();
		int sitsNum = in.nextInt();

		if (sitsCount <= 2) {
			System.out.println(0);
			return;
		}
		int stumbleNum = 0;
		int middle = sitsCount / 2;

		if (middle >= sitsNum) {
			stumbleNum = sitsCount - 2 - sitsNum;
		} else {
			stumbleNum = sitsCount - 2 - (sitsCount - sitsNum + 1);
		}
		System.out.println(stumbleNum);
	}
}