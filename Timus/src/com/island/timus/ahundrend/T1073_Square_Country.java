package com.island.timus.ahundrend;

import java.util.Scanner;

public class T1073_Square_Country {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int money = in.nextInt();
		int copy = money;
		int[] stack = new int[(int) Math.sqrt(money)];
		int min = init(money, stack);
		if (min >= 3) {
			while (min >= 3 && stack[0] > stack[1]) {
				stack[min - 1] = 0;
				int tmp = stack[min - 2];
				stack[min - 2] = 0;
				stack[min - 3]--;
				while (stack[min - 3] > tmp) {
					for (int i = 0; i < min - 2; i++) {
						money = money - stack[i] * stack[i];
					}
					int next = (int) Math.sqrt(money);
					money = money - next * next;
					if (money != 0) {
						stack[min - 3]--;
						money = copy;
					} else {
						min = min - 1;
					}

				}

			}
		}

		System.out.println(min);

	}

	private static int init(int money, int[] stack) {
		int counter = 0;
		while (true) {
			int afterSqrt = (int) Math.sqrt(money);
			stack[counter] = afterSqrt;
			int remain = money - afterSqrt * afterSqrt;

			counter++;
			if (remain != 0) {
				money = remain;
				continue;
			} else {
				break;
			}
		}
		return counter;
	}

}
