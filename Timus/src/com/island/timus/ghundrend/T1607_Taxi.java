package com.island.timus.ghundrend;

import java.util.Scanner;

public class T1607_Taxi {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int petr = in.nextInt();
		int padd = in.nextInt();
		int driver = in.nextInt();
		int doff = in.nextInt();

		int pr = petr;
		int dd = driver;

		if (petr > driver) {
			System.out.println(pr);
		} else {
			while (true) {
				if (petr > driver) {
					System.out.println(pr);
					break;
				}
				if (pr + padd >= dd) {
					System.out.println(dd);
					break;
				} else {
					pr = pr + padd;
					if (pr >= dd - doff) {
						System.out.println(pr);
						break;
					} else {
						dd = dd - doff;
					}
				}
			}
		}
	}
}
