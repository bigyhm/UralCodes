package com.island.timus.khundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class T2000_Grand_Theft_Array_V {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));

		int num = Integer.parseInt(reader.readLine());
		String intArray = reader.readLine();
		String[] integers = intArray.split(" ");
		int[] ints = new int[integers.length];
		for (int i = 0; i < integers.length; i++) {
			ints[i] = Integer.parseInt(integers[i]);
		}
		String positionStr = reader.readLine();
		String[] positions = positionStr.split(" ");
		int first = Integer.parseInt(positions[0]);
		int second = Integer.parseInt(positions[1]);

		int firstOut = 0;
		int secondOut = 0;
		int pos = (first + second) / 2;
		
		if(first == 1 && second ==1){
			for (int i = 0; i < num; i++) {
				firstOut = firstOut + ints[i];
			}
			int value = getTheLastUnZero(integers);
			value = getTheFirstUnZero(integers);
			secondOut = firstOut - value;
		}

		if (first <= second) {
			for (int i = 0; i < pos; i++) {
				firstOut = firstOut + ints[i];
			}
			for (int i = pos; i < num; i++) {
				secondOut = secondOut + ints[i];
			}
		} else {
			for (int i = pos - 1; i < num; i++) {
				firstOut = firstOut + ints[i];
			}
			for (int i = 0; i < pos - 1; i++) {
				secondOut = secondOut + ints[i];
			}
		}

		System.out.println(firstOut + " " + secondOut);
	}

	private static int getTheFirstUnZero(String[] integers) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int getTheLastUnZero(String[] integers) {
		// TODO Auto-generated method stub
		return 0;
	}
}
