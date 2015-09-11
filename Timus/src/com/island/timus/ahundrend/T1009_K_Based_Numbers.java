package com.island.timus.ahundrend;

import java.util.Scanner;
import java.math.BigInteger;

public class T1009_K_Based_Numbers {

	public static int result;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		BigInteger nValue = BigInteger.valueOf(n);
		BigInteger kValue = BigInteger.valueOf(k);
		BigInteger value;
		if (2 == n) {
			value = kValue.pow(2).subtract(kValue.pow(1));
		} else {
			value = kValue.pow(n).subtract(kValue.pow(n - 1)).subtract(BigInteger.valueOf(1))
					.subtract( kValue.pow(n - 3).multiply(BigInteger.valueOf(k - 2)).multiply(BigInteger.valueOf(n - 2)));
		}

		System.out.println(value);
	}
}
