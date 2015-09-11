package com.island.timus.ihundrend;

import java.util.Scanner;

public class T1893_A380 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String value = in.nextLine();
		String line = "";
		String column = "";
		int lineNum = 0;
		if (value.length() == 2) {
			line = value.substring(0, 1);
			column = value.substring(1, 2);
		} else {
			line = value.substring(0, 2);
			column = value.substring(2, 3);
		}
		lineNum = Integer.parseInt(line);
		if (lineNum <= 2) {
			if (column.equals("B") || column.equals("C")) {
				System.out.println("aisle");
			} else {
				System.out.println("window");
			}
		} else if (lineNum <= 20) {
			if (column.equals("A") || column.equals("F")) {
				System.out.println("window");
			} else {
				System.out.println("aisle");
			}
		} else {
			if (column.equals("A") || column.equals("K")) {
				System.out.println("window");
			} else if (column.equals("C") || column.equals("D") || column.equals("G") || column.equals("H")) {
				System.out.println("aisle");
			} else {
				System.out.println("neither");
			}
		}

	}

}
