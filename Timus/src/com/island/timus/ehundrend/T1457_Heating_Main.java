package com.island.timus.ehundrend;

import java.util.Scanner;

public class T1457_Heating_Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum = sum + in.nextInt();
		}
		java.text.DecimalFormat df = new java.text.DecimalFormat("#.000000");
		String result = df.format(((double) sum) / num);
		System.out.println(result);
	}
}
