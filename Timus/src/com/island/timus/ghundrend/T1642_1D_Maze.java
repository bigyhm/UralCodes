package com.island.timus.ghundrend;

import java.util.Scanner;

public class T1642_1D_Maze {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int obsNum = in.nextInt();
		int[] obstacles = new int[obsNum];
		int exit = in.nextInt();
		for (int i = 0; i < obsNum; i++) {
			obstacles[i] = in.nextInt();
		}
		quickSort(obstacles, 0, obsNum - 1);
		int noSolution = 0;
		if (exit > 0) {
			for (int i = 0; i < obsNum; i++) {
				if (obstacles[i] > 0 && obstacles[i] < exit) {
					noSolution = 1;
					break;
				}
			}
		} else {
			for (int i = 0; i < obsNum; i++) {
				if (obstacles[i] < 0 && obstacles[i] > exit) {
					noSolution = 1;
					break;
				}
			}
		}
		if (noSolution == 1) {
			System.out.println("Impossible");
			return;
		} else {
			int forward = 0;
			int backward = 0;

			if (exit > 0) {
				forward = exit;
				int maxFushu = -1000001;
				for (int i = 0; i < obsNum; i++) {
					if (obstacles[i] < 0 && obstacles[i] > maxFushu) {
						maxFushu = obstacles[i];
					}
					backward = exit - 2 * maxFushu;
				}
			} else if (exit < 0) {
				backward = 0 - exit;
				int maxZhenshu = 1000001;
				for (int i = 0; i < obsNum; i++) {
					if (obstacles[i] > 0 && obstacles[i] < maxZhenshu) {
						maxZhenshu = obstacles[i];
					}
					forward = backward + 2 * maxZhenshu;
				}
			} else {

			}
			System.out.println(forward + " " + backward);
		}
	}

	private static void quickSort(int[] a, int low, int high) {
		if (low >= high) {
			return;
		}
		int i = low, j = high;
		int key = a[i];
		while (i < j) {
			while (i < j && key <= a[j]) {
				j--;
			}
			a[i] = a[j];

			while (i < j && key >= a[i]) {
				i++;
			}
			a[j] = a[i];
		}
		a[i] = key;
		quickSort(a, low, i - 1);
		quickSort(a, i + 1, high);
	}

}
