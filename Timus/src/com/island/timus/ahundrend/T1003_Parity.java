package com.island.timus.ahundrend;

import java.util.Scanner;

public class T1003_Parity {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int length = in.nextInt();
		while (length != -1) {
			int[][] friendsAndEnemies = new int[2][length + 1];

			for (int j = 0; j < length + 1; j++) {
				friendsAndEnemies[0][j] = j;
				friendsAndEnemies[1][j] = -1;
			}

			int conditions = in.nextInt();
			int counter = 1;
			for (int i = counter; i <= conditions; i++, counter++) {
				Term.start = in.nextInt();
				Term.end = in.nextInt();
				Term.parity = in.nextLine();
				if (Term.start > length || Term.end > length || Term.start < 1 || Term.end < 1) {
					break;
				}
				if (Term.parity.trim().equals("even")) {
					join(friendsAndEnemies[0], Term.start - 1, Term.end);
				} else {
					int eneymyAncestor1 = findAncestor(friendsAndEnemies[0], Term.start - 1);
					int eneymyAncestor2 = findAncestor(friendsAndEnemies[0], Term.end);
					if (friendsAndEnemies[1][Term.start - 1] == -1 && friendsAndEnemies[1][Term.end] == -1) {
						friendsAndEnemies[1][Term.start - 1] = eneymyAncestor2;
						friendsAndEnemies[1][Term.end] = eneymyAncestor1;
					} else if (friendsAndEnemies[1][Term.start - 1] != -1 && friendsAndEnemies[1][Term.end] == -1) {
						join(friendsAndEnemies[0], friendsAndEnemies[1][Term.start - 1], Term.end);
						friendsAndEnemies[1][Term.end] = eneymyAncestor1;
					} else if (friendsAndEnemies[1][Term.start - 1] == -1 && friendsAndEnemies[1][Term.end] != -1) {
						join(friendsAndEnemies[0], friendsAndEnemies[1][Term.end], Term.start - 1);
						friendsAndEnemies[1][Term.start - 1] = eneymyAncestor2;
					} else {
						join(friendsAndEnemies[0], friendsAndEnemies[1][Term.end], Term.start - 1);
						join(friendsAndEnemies[0], friendsAndEnemies[1][Term.start - 1], Term.end);
					}
				}
				int pause = check(friendsAndEnemies);
				if (pause == friendsAndEnemies[0].length) {
					continue;
				} else {
					break;
				}
			}

			System.out.println(counter - 1);
			for (int i = counter + 1; i <= conditions; i++) {
				int x = in.nextInt();
				int y = in.nextInt();
				String z = in.nextLine();
			}
			length = in.nextInt();
		}
	}

	private static int findAncestor(int[] friends, int value) {
		int r = value;
		while (r != friends[r]) {
			r = friends[r];
		}
		return r;
	}

	private static void join(int[] pre, int x, int y) {
		int ancestorX = findAncestor(pre, x);
		int ancestorY = findAncestor(pre, y);
		int r = y;
		if (ancestorX != ancestorY) {
			while (r != pre[r]) {
				int temp = pre[r];
				pre[r] = ancestorX;
				r = temp;
			}
			pre[ancestorY] = ancestorX;
		}
	}

	private static int check(int[][] friendsAndEnemies) {
		int i = 1;
		for (; i < friendsAndEnemies[0].length; i++) {
			int friendAncestor = findAncestor(friendsAndEnemies[0], friendsAndEnemies[0][i]);
			int enemyAncestor = -1;
			if (friendsAndEnemies[1][i] != -1) {
				enemyAncestor = findAncestor(friendsAndEnemies[0], friendsAndEnemies[1][i]);
			}
			if (friendAncestor == enemyAncestor) {
				break;
			} else {
				continue;
			}
		}
		return i;
	}

}

class Term {
	public static int start;
	public static int end;
	public static String parity;
}
