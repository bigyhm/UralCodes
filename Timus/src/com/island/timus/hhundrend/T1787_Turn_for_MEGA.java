package com.island.timus.hhundrend;

import java.util.Scanner;

public class T1787_Turn_for_MEGA {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int allow = in.nextInt();
		int minutes = in.nextInt();
		int cars = 0;
		for (int i = 0; i < minutes; i++) {
			cars = cars + in.nextInt();
			if (cars <= allow) {
				cars = 0;
			} else {
				cars = cars - allow;
			}
		}
		System.out.println(cars);
	}

}
