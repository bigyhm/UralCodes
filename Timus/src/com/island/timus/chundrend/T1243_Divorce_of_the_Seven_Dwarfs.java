package com.island.timus.chundrend;

import java.math.BigInteger;
import java.util.Scanner;

public class T1243_Divorce_of_the_Seven_Dwarfs {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger all = in.nextBigInteger();
		BigInteger remain = all.remainder(new BigInteger("7"));
		System.out.println(remain);
	}

}
