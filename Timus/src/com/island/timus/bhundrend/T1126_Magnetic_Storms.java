package com.island.timus.bhundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class T1126_Magnetic_Storms {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));

		int k = Integer.parseInt(reader.readLine());
		int[] a = new int[k];
		List<Integer> intList = new ArrayList<Integer>();

		// Read the value into array.
		int value = Integer.parseInt(reader.readLine());
		while (value != -1) {
			intList.add(value);
			value = Integer.parseInt(reader.readLine());
		}
		int[] intArray = new int[intList.size()];
		int counter = 0;
		for (Integer intValue : intList) {
			intArray[counter] = intValue;
			counter++;
		}

		// Initialize the array a[].
		for (int i = 0; i < k; i++) {
			a[i] = -1;
		}
		// a[0] = 0;
		int aPosition = 0;
		int intArrayPosition = 0;
		for (int i = 0; i < k; i++) {
			if (aPosition == 0) {
				a[aPosition] = intArrayPosition;
				aPosition++;
			} else {
				while (aPosition > 0 && intArray[a[aPosition - 1]] < intArray[intArrayPosition]) {
					a[aPosition - 1] = -1;
					aPosition--;
				}
				a[aPosition] = intArrayPosition;
				aPosition++;
			}
			intArrayPosition++;
		}
		writer.println(intArray[a[0]]);

		while (intArrayPosition < intArray.length) {
			// Scan the array a and change the array.
			aPosition = scanToChangeArray(a, aPosition, intArrayPosition);
			if (aPosition == 0) {
				a[aPosition] = intArrayPosition;
				aPosition++;
			} else {
				while (aPosition > 0 && intArray[a[aPosition - 1]] < intArray[intArrayPosition]) {
					a[aPosition - 1] = -1;
					aPosition--;
				}
				a[aPosition] = intArrayPosition;
				aPosition++;
			}
			writer.println(intArray[a[0]]);
			intArrayPosition++;
		}
		writer.flush();
	}

	private static int scanToChangeArray(int[] a, int aPosition, int intArrayPosition) {
		int k = a.length;
		int deletePosition = -1;
		for (int i = 0; i < aPosition; i++) {
			if (a[i] == intArrayPosition - k) {
				deletePosition = i;
				break;
			}
		}
		if (deletePosition == -1) {
			return aPosition;
		} else {
			for (int i = deletePosition; i < aPosition - 1; i++) {
				a[i] = a[i + 1];
			}
			if (aPosition - 1 >= 0) {
				a[aPosition - 1] = -1;
			}
			return aPosition - 1;
		}
	}

}
