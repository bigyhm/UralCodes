package com.island.timus.fhundrend;

import java.util.Scanner;

public class T1573_Alchemy {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int blue = in.nextInt();
		int red = in.nextInt();
		int yellow = in.nextInt();
		int colorNum = in.nextInt();
		int num = 1;
		in.nextLine();
		for (int i = 0; i < colorNum; i++) {
			String color = in.nextLine();
			if ("Red".equals(color)) {
				num = num * red;
			}
			if ("Yellow".equals(color)) {
				num = num * yellow;
			}
			if ("Blue".equals(color)) {
				num = num * blue;
			}
		}
		System.out.println(num);

	}

}
