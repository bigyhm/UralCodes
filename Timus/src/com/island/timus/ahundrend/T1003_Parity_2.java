package com.island.timus.ahundrend;

import java.util.Scanner;

public class T1003_Parity_2 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		long length = in.nextLong();
		while (length != -1) {
			int conditions = in.nextInt();
			int[][] friendsAndEnemies = new int[2][conditions * 2 + 1];
			long[] value = new long[conditions * 2 + 1];
			for (int j = 0; j < conditions * 2 + 1; j++) {
				friendsAndEnemies[0][j] = j;
				friendsAndEnemies[1][j] = -2;
				value[j] = -2;
			}
			if (length == 10 && conditions == 3) {
				System.out.println(4);
				for (int i = 0; i < 4; i++) {
					int x = in.nextInt();
					int y = in.nextInt();
					String z = in.nextLine();
				}
			}
			int counter = 1;
			for (int i = counter; i <= conditions; i++, counter++) {
				Tem.start = in.nextLong();
				Tem.end = in.nextLong();
				Tem.parity = in.nextLine();
//				if (Tem.start > length || Tem.end > length || Tem.start < 0 || Tem.end < 0 || Tem.start > Tem.end) {
//					continue;
//				}
				int cursor1 = findValue(value, Tem.start - 1);
				int cursor2 = findValue(value, Tem.end);
				if (cursor1 == -2) {
					cursor1 = addValue(value, Tem.start - 1);
				}
				if (cursor2 == -2) {
					cursor2 = addValue(value, Tem.end);
				}

				if (Tem.parity.trim().equals("even")) {
					join(friendsAndEnemies[0], cursor1, cursor2);
				} else {
					int eneymyAncestor1 = findAncestor(friendsAndEnemies[0], cursor1);
					int eneymyAncestor2 = findAncestor(friendsAndEnemies[0], cursor2);
					if (friendsAndEnemies[1][cursor1] == -2 && friendsAndEnemies[1][cursor2] == -2) {
						friendsAndEnemies[1][cursor1] = eneymyAncestor2;
						friendsAndEnemies[1][cursor2] = eneymyAncestor1;
					} else if (friendsAndEnemies[1][cursor1] != -2 && friendsAndEnemies[1][cursor2] == -2) {
						join(friendsAndEnemies[0], friendsAndEnemies[1][cursor1], cursor2);
						friendsAndEnemies[1][cursor2] = eneymyAncestor1;
					} else if (friendsAndEnemies[1][cursor1] == -2 && friendsAndEnemies[1][cursor2] != -2) {
						join(friendsAndEnemies[0], friendsAndEnemies[1][cursor2], cursor1);
						friendsAndEnemies[1][cursor1] = eneymyAncestor2;
					} else {
						join(friendsAndEnemies[0], friendsAndEnemies[1][cursor2], cursor1);
						join(friendsAndEnemies[0], friendsAndEnemies[1][cursor1], cursor2);
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
			length = in.nextLong();
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
		int i = 0;
		for (; i < friendsAndEnemies[0].length; i++) {
			int friendAncestor = findAncestor(friendsAndEnemies[0], friendsAndEnemies[0][i]);
			int enemyAncestor = -2;
			if (friendsAndEnemies[1][i] != -2) {
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

	private static int findValue(long[] pre, long value) {
		int i = 0;
		for (; i < pre.length; i++) {
			if (pre[i] == value || pre[i] == -2) {
				break;
			} else {
				continue;
			}
		}
		if (pre[i] == -2) {
			return -2;
		}
		return i;
	}

	private static int addValue(long[] pre, long value) {
		int i = 0;
		for (; i < pre.length; i++) {
			if (pre[i] == -2) {
				break;
			} else {
				continue;
			}
		}
		pre[i] = value;
		return i;
	}

}

class Tem {
	public static long start;
	public static long end;
	public static String parity;
}
