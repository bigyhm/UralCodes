package com.island.timus.bhundrend;

import java.util.Scanner;

public class T1120_Sum_Of_Sequential_Numbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long N = in.nextLong();
		long P = 1;
		long A = 1;
		long Apioneer = A;
		long pointer = P;
		while (Apioneer > 0) {
			long reminder = (N - pointer * (pointer - 1) / 2) % pointer;
			Apioneer = (N - pointer * (pointer - 1) / 2) / pointer;
			if (reminder == 0 && Apioneer > 0) {
				A = Apioneer;
				P = pointer;
			}
			pointer++;
		}
//		if (N == 1 || N == 2) {
//			A = N;
//			P = 1;
//		}

		System.out.print(A + " ");
		System.out.println(P);
	}

}
