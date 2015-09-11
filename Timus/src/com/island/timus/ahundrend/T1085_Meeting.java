package com.island.timus.ahundrend;

import java.util.Scanner;

public class T1085_Meeting {

	public static void main(String[] args) {
		int MAX = 100000;
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int[][] Grap = new int[N + 1][N + 1];
		for (int i = 1; i < N + 1; i++) {
			for (int j = 1; j < N + 1; j++) {
				if (i == j) {
					Grap[i][j] = 0;
				} else {
					Grap[i][j] = MAX;
				}
			}
		}
		for (int i = 0; i < M; i++) {
			int count = in.nextInt();
			int[] stops = new int[count];
			for (int j = 0; j < count; j++) {
				stops[j] = in.nextInt();
			}
			for (int m = 0; m < count - 1; m++) {
				for (int n = m + 1; n < count; n++) {
					if (stops[m] != stops[n]) {
						Grap[stops[m]][stops[n]] = 4;
						Grap[stops[n]][stops[m]] = 4;
					}
					// else{
					// for(int p = n; p>m;p--){
					// for(int q = n-1; q>m-1; q--){
					// if(stops[p]!=stops[q]){
					// Grap[stops[p]][stops[q]] = 4;
					// }
					// }
					// }
					// }
				}
			}
		}

		int K = in.nextInt();
		int[][] fInfo = new int[K][3];
		int allMoney = 0;
		for (int l = 0; l < K; l++) {
			fInfo[l][0] = in.nextInt();
			fInfo[l][1] = in.nextInt();
			fInfo[l][2] = in.nextInt();
			allMoney = fInfo[l][0] + allMoney;
		}

		int[][][] distance = new int[2][N + 1][N + 1];
		for (int i = 1; i < N + 1; i++) {
			for (int j = 1; j < N + 1; j++) {
				distance[0][i][j] = Grap[i][j];
			}
		}

		for (int k = 1; k < N + 1; k++) {
			if (k != 1) {
				for (int p = 1; p < N + 1; p++) {
					for (int q = 1; q < N + 1; q++) {
						distance[0][p][q] = distance[1][p][q];
					}
				}
			}
			for (int i = 1; i < N + 1; i++) {
				for (int j = 1; j < N + 1; j++) {
					distance[1][i][j] = Math.min(distance[0][i][j], distance[0][i][k] + distance[0][k][j]);
					distance[1][i][j] = Math.min(distance[1][i][j], distance[0][j][i]);
					distance[1][j][i] = distance[1][i][j];
				}
			}
		}

		int[] cost = new int[N + 1];
		int min = MAX;
		int cursor = 0;
		for (int i = 1; i < N + 1; i++) {
			for (int j = 0; j < K; j++) {
				if ((fInfo[j][0] < distance[1][fInfo[j][1]][i] && fInfo[j][2] == 0)
						|| distance[1][fInfo[j][1]][i] >= MAX) {
					cost[i] = MAX;
					break;
				}
				if (fInfo[j][2] == 1) {
					continue;
				}
				cost[i] = cost[i] + distance[1][fInfo[j][1]][i];
			}
			if (cost[i] < min) {
				min = cost[i];
				cursor = i;
			}
		}
		allMoney = allMoney - min;
		if (min >= MAX) {
			System.out.println(0);
		} else {
			System.out.print(cursor);
			System.out.print(" ");
			System.out.println(min);
		}
	}
}
