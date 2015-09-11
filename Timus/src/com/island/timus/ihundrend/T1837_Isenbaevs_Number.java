package com.island.timus.ihundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class T1837_Isenbaevs_Number {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));
		int lineCount = Integer.parseInt(reader.readLine());

		List<HashMap<String, Integer>> mapList = new ArrayList<HashMap<String, Integer>>();

		String[] all = new String[3 * lineCount];
		for (int i = 0; i < lineCount; i++) {
			String input = reader.readLine();
			String[] values = input.split(" ");
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			for (int j = 0; j < 3; j++) {
				all[3 * i + j] = values[j];
				map.put(all[3 * i + j], Integer.MAX_VALUE);
			}
			mapList.add(map);
		}

		// Initialize.
		Map<String, Integer> keysMap = new HashMap<String, Integer>();
		keysMap.put("Isenbaev", 0);

		int counter = 0;
		int[] tobeRemove = new int[lineCount];
		int length = 0;
		int position = 0;

		while (true) {
			counter = 0;
			length = 0;
			position = 0;
			for (HashMap<String, Integer> map : mapList) {
				position++;
				int frinedLevel = Integer.MAX_VALUE;
				Iterator iter = map.entrySet().iterator();
				while (iter.hasNext()) {
					Map.Entry entry = (Map.Entry) iter.next();
					String key = (String) entry.getKey();
					if (keysMap.containsKey(key)) {
						if (keysMap.get(key) < frinedLevel) {
							frinedLevel = keysMap.get(key);
						}
					}
				}
				if (frinedLevel != Integer.MAX_VALUE) {
					iter = map.entrySet().iterator();
					while (iter.hasNext()) {
						Map.Entry entry = (Map.Entry) iter.next();
						String key = (String) entry.getKey();
						if (!keysMap.containsKey(key)) {
							keysMap.put(key, frinedLevel + 1);
							counter++;
						}
					}
					tobeRemove[length] = position - 1;
					length++;
				} else {
					// Do nothing.
				}
			}
			for (int k = 0; k < length; k++) {
				mapList.remove(tobeRemove[k] - k);
			}
			if (counter == 0) {
				break;
			}
		}
		Arrays.sort(all);
		all = array_unique(all);
		for (int i = 0; i < all.length; i++) {
			if (keysMap.containsKey(all[i])) {
				System.out.println(all[i] + " " + keysMap.get(all[i]));
			} else {
				System.out.println(all[i] + " undefined");
			}
		}
	}

	// 去除数组中重复的记录
	public static String[] array_unique(String[] a) {
		// array_unique
		List<String> list = new LinkedList<String>();
		for (int i = 0; i < a.length; i++) {
			if (!list.contains(a[i])) {
				list.add(a[i]);
			}
		}
		return (String[]) list.toArray(new String[list.size()]);
	}
}
