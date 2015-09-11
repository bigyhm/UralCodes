package com.island.timus.fhundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T1585_Penguins {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(reader.readLine());
		int[] all = new int[3];
		for (int i = 0; i < count; i++) {
			String value = reader.readLine();
			if ("Emperor Penguin".equals(value)) {
				all[0]++;
			}
			if ("Macaroni Penguin".equals(value)) {
				all[1]++;
			}
			if ("Little Penguin".equals(value)) {
				all[2]++;
			}
		}
		int max = Integer.MIN_VALUE;
		int counter = 0;
		for (int i = 0; i < 3; i++) {
			if (max < all[i]) {
				max = all[i];
				counter = i;
			}
		}
		if (counter == 0) {
			System.out.println("Emperor Penguin");
		}
		if (counter == 1) {
			System.out.println("Macaroni Penguin");
		}
		if (counter == 2) {
			System.out.println("Little Penguin");
		}
	}
}
