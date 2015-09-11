package com.island.timus.khundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class T2002_Test_Task {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(reader.readLine());

		Map<String, String> registeredMap = new HashMap<String, String>();
		Map<String, String> loginedMap = new HashMap<String, String>();

		for (int i = 0; i < count; i++) {
			String value = reader.readLine();
			if (value.startsWith("register")) {
				String[] values = value.split(" ");
				if (registeredMap.containsKey(values[1])) {
					System.out.println("fail: user already exists");
				} else {
					registeredMap.put(values[1], values[2]);
					System.out.println("success: new user added");
				}
			} else if (value.startsWith("login")) {
				String[] values = value.split(" ");
				// if (loginedMap.containsKey(values[1])) {
				// System.out.println("fail: already logged in");
				// } else {
				if (registeredMap.containsKey(values[1])) {
					if (registeredMap.get(values[1]).equals(values[2])) {
						if (loginedMap.containsKey(values[1])) {
							System.out.println("fail: already logged in");
						} else {
							loginedMap.put(values[1], values[2]);
							System.out.println("success: user logged in");
						}
					} else {
						System.out.println("fail: incorrect password");
					}
				} else {
					System.out.println("fail: no such user");
				}
				// }
			} else {
				String[] values = value.split(" ");
				if (registeredMap.containsKey(values[1])) {
					if (loginedMap.containsKey(values[1])) {
						loginedMap.remove(values[1]);
						System.out.println("success: user logged out");
					} else {
						System.out.println("fail: already logged out");
					}
				} else {
					System.out.println("fail: no such user");
				}
			}

		}

	}
}
