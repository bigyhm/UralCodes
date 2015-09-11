package com.island.timus.fhundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class T1510_Order {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(reader.readLine());

		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			int key = Integer.parseInt(reader.readLine());
			arr[i] = key;
		}
		Arrays.sort(arr);
		System.out.println(arr[num / 2]);
	}
}
