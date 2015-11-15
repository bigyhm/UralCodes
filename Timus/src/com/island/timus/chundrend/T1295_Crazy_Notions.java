package com.island.timus.chundrend;

import java.math.BigDecimal;
import java.util.Scanner;

public class T1295_Crazy_Notions {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		BigDecimal value = new BigDecimal(1);
		BigDecimal two = new BigDecimal(2);
		BigDecimal three = new BigDecimal(3);
		BigDecimal four = new BigDecimal(4);
		two = two.pow(n);
		three = three.pow(n);
		four = four.pow(n);

		value = value.add(two).add(three).add(four);

		int result = 0;
		BigDecimal remainder = new BigDecimal(0);
		BigDecimal zero = new BigDecimal(0);
		while (true) {
			BigDecimal ten = new BigDecimal(10);
			remainder = value.remainder(ten);
			value = value.divide(ten);
			if (remainder.compareTo(zero) == 0 && value.compareTo(zero) != 0) {
				result++;
			} else {
				break;
			}
		}
		System.out.println(result);
	}
}
