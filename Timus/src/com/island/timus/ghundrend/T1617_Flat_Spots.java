package com.island.timus.ghundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class T1617_Flat_Spots {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));
		int length = Integer.parseInt(reader.readLine());
		int[] wheels = new int[length];
		Map<Integer, Integer> keyMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < length; i++) {
			wheels[i] = Integer.parseInt(reader.readLine());
		}

		quickSort(wheels, 0, length - 1);
		int keysCount = 0;
		int key = wheels[0];
		keyMap.put(keysCount, key);
		for (int i = 0; i < length; i++) {
			if (key != wheels[i]) {
				keysCount++;
				keyMap.put(keysCount, wheels[i]);
				key = wheels[i];
			} else {
				continue;
			}

		}

		int counter = 0;
		int iout = 0;
		for (int k = 0; k <= keysCount; k++) {
			int innerCounter = iout;
			int innerKey = keyMap.get(k);
			while (iout < length && innerKey == wheels[iout]) {
				iout++;
			}
			int add = (iout - innerCounter) / 4;
			counter = counter + add;

		}

		System.out.println(counter);
	}

	private static void quickSort(int[] wheels, int low, int high) {
		if (low >= high) {
			return;
		}
		int i = low;
		int j = high;
		int key = wheels[i];
		while (i < j) {
			while (i < j && key <= wheels[j]) {
				j--;
			}
			wheels[i] = wheels[j];
			while (i < j && key >= wheels[i]) {
				i++;
			}
			wheels[j] = wheels[i];
		}
		wheels[i] = key;
		quickSort(wheels, low, i - 1);
		quickSort(wheels, i + 1, high);
	}
}
