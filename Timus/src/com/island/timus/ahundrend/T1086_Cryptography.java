package com.island.timus.ahundrend;

import java.util.Scanner;

public class T1086_Cryptography {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int[] arr = new int[count];
		int max = 0;
		for (int i = 0; i < count; i++) {
			arr[i] = in.nextInt();
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		int[] primes = new int[max];
		primes = getPrimes(primes);
		for (int i = 0; i < count; i++) {
			System.out.println(primes[arr[i] - 1]);
		}
	}

	private static int[] getPrimes(int[] primes) {
		primes[0] = 2;
		primes[1] = 3;
		primes[2] = 5;
		for (int i = 3, j = 7; i < primes.length; i++, j = j + 2) {
			int k = 0;
			for (; k < i; k++) {
				if (j % primes[k] == 0) {
					j = j + 2;
					k = -1;
				}
			}
			primes[i] = j;
		}
		return primes;
	}

}
