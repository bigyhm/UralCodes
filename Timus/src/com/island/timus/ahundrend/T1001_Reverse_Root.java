package com.island.timus.ahundrend;

import java.text.NumberFormat;
import java.util.Scanner;

class Sqrt {
	public static Double SqrtInt(long arr) {
		double result = Math.sqrt(arr);
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMinimumIntegerDigits(4);
		return Double.valueOf(nf.format(result));
	}
}

public class T1001_Reverse_Root {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long[] arr = new long[1000000];
		int i;
		for (i = 0; in.hasNext(); i++) {
			arr[i] = in.nextLong();
		}
		for (; i > 0; i--) {
			System.out.println(Sqrt.SqrtInt(arr[i - 1]));
		}
	}
}
